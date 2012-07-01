(ns typed.test.core
  (:refer-clojure :exclude [defrecord])
  (:import (clojure.lang Seqable ISeq ASeq))
  (:require [clojure.test :refer :all]
            [analyze.core :refer [ast]]
            [typed.core :refer :all]))

(deftest add-scopes-test
  (is (let [body (make-F 'a)]
        (= (add-scopes 0 body)
           body)))
  (is (let [body (make-F 'a)]
        (= (add-scopes 1 body)
           (->Scope body))))
  (is (let [body (make-F 'a)]
        (= (add-scopes 3 body)
           (-> body ->Scope ->Scope ->Scope)))))

(deftest remove-scopes-test
  (is (let [scope (->Scope (make-F 'a))]
        (= (remove-scopes 0 scope)
           scope)))
  (is (let [body (make-F 'a)]
        (= (remove-scopes 1 (->Scope body))
           body))))

(deftest name-to-test
  (is (let [body (make-F 'a)]
        (= (name-to body 'a 0)
           (->B 0 (->Top) (Bottom))))))

(deftest parse-type-test
  (is (= (Poly-body* '(x) (parse-type '(All [x] x)))
         (make-F 'x)))
  (is (= (Poly-body* '(x y) (parse-type '(All [x y] x)))
         (make-F 'x)))
  (is (= (Poly-body* '(x y) (parse-type '(All [x y] y)))
         (make-F 'y)))
  (is (= (Poly-body* '(a b c d e f g h i) (parse-type '(All [a b c d e f g h i] e)))
         (make-F 'e))))

(defmacro sub? [s t]
  `(subtype? (parse-type '~s)
             (parse-type '~t)))

(deftest subtype-test
  (is (subtype? (parse-type 'Integer)
                (parse-type 'Integer)))
  (is (subtype? (parse-type 'Integer)
                (parse-type 'Object)))
  (is (not (sub? Object Integer)))
  (is (not (sub? Object Object)))
  (is (subtype? (parse-type 'Integer)
                (parse-type 'Number)))
  (is (subtype? (parse-type '(clojure.lang.Seqable Integer))
                (parse-type '(clojure.lang.Seqable Integer))))
  (is (subtype? (parse-type '(clojure.lang.Seqable Integer))
                (parse-type '(clojure.lang.Seqable Number))))
  (is (not
        (subtype? (parse-type '(clojure.lang.Seqable Number))
                  (parse-type '(clojure.lang.Seqable Integer)))))
  (is (subtype? (parse-type '(clojure.lang.Cons Integer))
                (parse-type '(clojure.lang.Cons Number))))
  (is (subtype? (parse-type '(clojure.lang.Cons Integer))
                (parse-type '(clojure.lang.Seqable Number)))))

(deftest subtype-hmap
  (is (not (subtype? (constant-type '{:a nil})
                     (constant-type '{:a 1}))))
  (is (subtype? (constant-type '{:a 1 :b 2 :c 3})
                (constant-type '{:a 1 :b 2}))))

(deftest subtype-top-Function
  (is (subtype? (parse-type '[Integer -> Number])
                (In (->TopFunction)))))

(deftest subtype-rec
  (is (subtype? (parse-type 'Integer)
                (parse-type '(Rec [x] (U Integer (clojure.lang.Seqable x))))))
  (is (subtype? (parse-type '(clojure.lang.Seqable (clojure.lang.Seqable Integer)))
                (parse-type '(Rec [x] (U Integer (clojure.lang.Seqable x))))))
  (is (not (subtype? (parse-type 'Number)
                     (parse-type '(Rec [x] (U Integer (clojure.lang.Seqable x)))))))
  (is (sub (Map* :mandatory
                  {:op (Value :if)
                   :test (Map* :mandatory
                               {:op (Value :var)
                                :var clojure.lang.Var})
                   :then (Map* :mandatory
                               {:op (Value :nil)})
                   :else (Map* :mandatory
                               {:op (Value :false)})})
            (Rec [x] 
                 (U (Map* :mandatory
                          {:op (Value :if)
                           :test x
                           :then x
                           :else x})
                    (Map* :mandatory
                          {:op (Value :var)
                           :var clojure.lang.Var})
                    (Map* :mandatory
                          {:op (Value :nil)})
                    (Map* :mandatory
                          {:op (Value :false)})))))

 #_(is (sub? (Rec [x] (U Integer (clojure.lang.ILookup x x)))
            (Rec [x] (U Number (clojure.lang.ILookup x x)))))
  )

; expanding dotted pretypes
(deftest trans-dots-test
  (is (= (manual-inst (parse-type '(All [x b ...]
                                        [x ... b -> x]))
                      (map parse-type '(Integer Double Float)))
         (parse-type '[Integer Integer -> Integer])))
  (is (= (manual-inst (parse-type '(All [x b ...]
                                        [b ... b -> x]))
                      (map parse-type '(Integer Double Float)))
         (parse-type '[Double Float -> Integer])))
  ;map type
  (is (= (manual-inst (parse-type '(All [c a b ...]
                                        [[a b ... b -> c] (clojure.lang.Seqable a) (clojure.lang.Seqable b) ... b -> (clojure.lang.Seqable c)]))
                      (map parse-type '(Integer Double Float)))
         (parse-type '[[Double Float -> Integer] (clojure.lang.Seqable Double) (clojure.lang.Seqable Float) -> (clojure.lang.Seqable Integer)]))))

;return type for an expression f
(defmacro ety [f]
  `(-> (ast ~f) check expr-type ret-t))

(deftest tc-invoke-fn-test
  (is (subtype? (ety
                  ((typed.core/fn> [[a :- Number] [b :- Number]] b)
                     1 2))
                (parse-type 'Number)))
  (is (subtype? (ety
                  ((typed.core/fn> [[a :- (clojure.lang.Seqable Number)] [b :- Number]] 
                                   ((typed.core/inst seq Number) a))
                     [1 2 1.2] 1))
                (parse-type '(U nil (clojure.lang.ASeq Number)))))
  (is (subtype? (ety
                  ((typed.core/fn> [[a :- (clojure.lang.IPersistentMap Any Number)] [b :- Number]] 
                                   ((typed.core/inst get Number) a b))
                     {:a 1} 1))
                (parse-type '(U nil Number)))))

(deftest check-do
  (is (= (ety (do 1 2))
         (->Value 2))))
