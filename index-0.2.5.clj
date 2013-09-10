{:namespaces
 ({:source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed/clojure.core.typed-api.html",
   :name "clojure.core.typed",
   :doc nil}
  {:source-url
   "https://github.com/clojure/core.typed/blob/8201fe05488acefeb1e8158a8fb413e848657710/src/main/clojure/clojure/core/typed/async.clj",
   :wiki-url
   "http://clojure.github.com/core.typed/clojure.core.typed.async-api.html",
   :name "clojure.core.typed.async",
   :doc
   "This namespace contains annotations and helper macros for type\nchecking core.async code. Ensure clojure.core.async is require'd\nbefore performing type checking.\n\ngo\n  use go>\n\nchan\n  use chan>\n\nbuffer\n  use buffer> (similar for other buffer constructors)\n"}
  {:source-url
   "https://github.com/clojure/core.typed/blob/6b5231ad882ee07b0ef6c5e978e09c09aed083a6/src/main/clojure/clojure/core/typed/hole.clj",
   :wiki-url
   "http://clojure.github.com/core.typed/clojure.core.typed.hole-api.html",
   :name "clojure.core.typed.hole",
   :doc
   "This namespace contains easy tools for hole driven development"}
  {:source-url
   "https://github.com/clojure/core.typed/blob/048c9ca3dbf7218157423ddf8e18f2a12a48eb9e/src/main/clojure/clojure/core/typed/util_cljs.clj",
   :wiki-url
   "http://clojure.github.com/core.typed/clojure.core.typed.util-cljs-api.html",
   :name "clojure.core.typed.util-cljs",
   :doc nil}),
 :vars
 ({:name "*verbose-forms*",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L1157",
   :dynamic true,
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/*verbose-forms*",
   :doc
   "If true, print complete forms in error messages. Bind\naround a type checking form like cf or check-ns.\n\neg.\n(binding [*verbose-forms* true]\n  (cf ['deep ['deep ['deep ['deep]]]] Number))\n;=> <full form in error>",
   :var-type "var",
   :line 1157,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:name "*verbose-types*",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L1144",
   :dynamic true,
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/*verbose-types*",
   :doc
   "If true, print fully qualified types in error messages\nand return values. Bind around a type checking form like \ncf or check-ns.\n\neg. \n(binding [*verbose-types* true] \n  (cf 1 Number))\n;=> java.lang.Number",
   :var-type "var",
   :line 1144,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/AnyInteger",
   :namespace "clojure.core.typed",
   :forms [AnyInteger],
   :var-type "type alias",
   :doc
   "A type that returns true for clojure.core/integer?\n\n(U Integer Long clojure.lang.BigInt BigInteger Short Byte)",
   :name "AnyInteger"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Atom1",
   :namespace "clojure.core.typed",
   :forms [(Atom1 t)],
   :var-type "type alias",
   :doc
   "An atom that can read and write type x.\n\n(TFn [[x :variance :invariant]] (Atom x x))",
   :name "Atom1"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Coll",
   :namespace "clojure.core.typed",
   :forms [(Coll t)],
   :var-type "type alias",
   :doc
   "A persistent collection with member type x.\n\n(TFn [[x :variance :covariant]] (IPersistentCollection x))",
   :name "Coll"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/EmptyCount",
   :namespace "clojure.core.typed",
   :forms [EmptyCount],
   :var-type "type alias",
   :doc
   "The type of all things with count 0. Use as part of an intersection.\neg. See EmptySeqable.\n\n(ExactCount 0)",
   :name "EmptyCount"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/EmptySeqable",
   :namespace "clojure.core.typed",
   :forms [(EmptySeqable t)],
   :var-type "type alias",
   :doc
   "A type that can be used to create a sequence of member type x\nwith count 0.\n\n(TFn [[x :variance :covariant]] (I (Seqable x) (ExactCount 0)))",
   :name "EmptySeqable"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Id",
   :namespace "clojure.core.typed",
   :forms [Id],
   :var-type "type alias",
   :doc
   "The identity function at the type level.\n\n(TFn [[x :variance :covariant]] x)",
   :name "Id"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Int",
   :namespace "clojure.core.typed",
   :forms [Int],
   :var-type "type alias",
   :doc
   "A type that returns true for clojure.core/integer?\n\n(U Integer Long clojure.lang.BigInt BigInteger Short Byte)",
   :name "Int"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Map",
   :namespace "clojure.core.typed",
   :forms [(Map t t)],
   :var-type "type alias",
   :doc
   "A persistent map with keys k and vals v.\n\n(TFn\n [[k :variance :covariant] [v :variance :covariant]]\n (IPersistentMap k v))",
   :name "Map"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/NonEmptyColl",
   :namespace "clojure.core.typed",
   :forms [(NonEmptyColl t)],
   :var-type "type alias",
   :doc
   "A persistent collection with member type x and count greater than 0.\n\n(TFn\n [[x :variance :covariant]]\n (I (IPersistentCollection x) (CountRange 1)))",
   :name "NonEmptyColl"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/NonEmptyCount",
   :namespace "clojure.core.typed",
   :forms [NonEmptyCount],
   :var-type "type alias",
   :doc
   "The type of all things with count greater than 0. Use as part of an intersection.\neg. See NonEmptySeq\n\n(CountRange 1)",
   :name "NonEmptyCount"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/NonEmptyLazySeq",
   :namespace "clojure.core.typed",
   :forms [(NonEmptyLazySeq t)],
   :var-type "type alias",
   :doc
   "A non-empty lazy sequence of type t\n\n(TFn [[t :variance :covariant]] (I (LazySeq t) (CountRange 1)))",
   :name "NonEmptyLazySeq"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/NonEmptySeq",
   :namespace "clojure.core.typed",
   :forms [(NonEmptySeq t)],
   :var-type "type alias",
   :doc
   "A persistent sequence of member type x with count greater than 0.\n\n(TFn [[x :variance :covariant]] (I (ISeq x) (CountRange 1)))",
   :name "NonEmptySeq"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/NonEmptySeqable",
   :namespace "clojure.core.typed",
   :forms [(NonEmptySeqable t)],
   :var-type "type alias",
   :doc
   "A type that can be used to create a sequence of member type x\nwith count greater than 0.\n\n(TFn [[x :variance :covariant]] (I (Seqable x) (CountRange 1)))",
   :name "NonEmptySeqable"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/NonEmptyVec",
   :namespace "clojure.core.typed",
   :forms [(NonEmptyVec t)],
   :var-type "type alias",
   :doc
   "A persistent vector with member type x and count greater than 0.\n\n(TFn\n [[x :variance :covariant]]\n (I (IPersistentVector x) (CountRange 1)))",
   :name "NonEmptyVec"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Num",
   :namespace "clojure.core.typed",
   :forms [Number],
   :var-type "type alias",
   :doc "A type that returns true for clojure.core/number?\n\nNumber",
   :name "Num"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Option",
   :namespace "clojure.core.typed",
   :forms [(Option t)],
   :var-type "type alias",
   :doc
   "A union of x and nil.\n\n(TFn [[x :variance :covariant]] (U nil x))",
   :name "Option"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Seq",
   :namespace "clojure.core.typed",
   :forms [(Seq t)],
   :var-type "type alias",
   :doc
   "A persistent sequence of member type x.\n\n(TFn [[x :variance :covariant]] (ISeq x))",
   :name "Seq"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Seqable",
   :namespace "clojure.core.typed",
   :forms [(Seqable t)],
   :var-type "type alias",
   :doc
   "A type that can be used to create a sequence of member type x.\n\n(TFn [[x :variance :covariant]] (Seqable x))",
   :name "Seqable"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Set",
   :namespace "clojure.core.typed",
   :forms [(Set t)],
   :var-type "type alias",
   :doc
   "A persistent set with member type x\n\n(TFn [[x :variance :covariant]] (IPersistentSet x))",
   :name "Set"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/SortedSet",
   :namespace "clojure.core.typed",
   :forms [(SortedSet t)],
   :var-type "type alias",
   :doc
   "A sorted persistent set with member type x\n\n(TFn [[x :variance :covariant]] (Extends [(IPersistentSet x) Sorted]))",
   :name "SortedSet"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/Vec",
   :namespace "clojure.core.typed",
   :forms [(Vec t)],
   :var-type "type alias",
   :doc
   "A persistent vector with member type x.\n\n(TFn [[x :variance :covariant]] (IPersistentVector x))",
   :name "Vec"}
  {:arglists ([varsym typesyn]),
   :name "ann",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L809",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/ann",
   :doc
   "Annotate varsym with type. If unqualified, qualify in the current namespace.\nIf varsym has metadata {:no-check true}, ignore definitions of varsym \nwhile type checking.\n\nIf annotating vars in namespaces other than the current one, a fully\nqualified symbol must be provided. Note that namespace aliases are not\nrecognised: the *full* namespace must be given in the first part of the symbol.\n\neg. ; annotate the var foo in this namespace\n    (ann foo [Number -> Number])\n\n    ; annotate a var in another namespace\n    (ann another.ns/bar [-> nil])\n \n    ; don't check this var\n    (ann ^:no-check foobar [Integer -> String])",
   :var-type "macro",
   :line 809,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([& args]),
   :forms
   [(ann-datatype dname [field :- type*] opts*)
    (ann-datatype binder dname [field :- type*] opts*)],
   :name "ann-datatype",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L855",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/ann-datatype",
   :doc
   "Annotate datatype Class name dname with expected fields.\nIf unqualified, qualify in the current namespace.\nTakes an optional type variable binder before the name.\n\neg. ; a datatype in the current namespace\n    (ann-datatype MyDatatype [a :- Number,\n                              b :- Long])\n\n    ; a datatype in another namespace\n    (ann-datatype another.ns.TheirDatatype\n                  [str :- String,\n                   vec :- (IPersistentVector Number)])\n\n    ; a datatype, polymorphic in a\n    (ann-datatype [[a :variance :covariant]]\n                  MyPolyDatatype\n                  [str :- String,\n                   vec :- (IPersistentVector Number)])",
   :var-type "macro",
   :line 855,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([form ty]),
   :name "ann-form",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L695",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/ann-form",
   :doc "Annotate a form with an expected type.",
   :var-type "macro",
   :line 695,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([t & vs]),
   :name "ann-many",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L841",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/ann-many",
   :doc
   "Annotate several vars with type t.\n\neg. (ann-many FakeSearch\n              web1 web2 image1 image2 video1 video2)",
   :var-type "macro",
   :line 841,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists
   ([dname
     vbnd
     fields
     &
     {ancests :unchecked-ancestors, rplc :replace, :as opt}]),
   :name "ann-precord",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L924",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/ann-precord",
   :doc
   "Annotate record Class name dname with a polymorphic binder and expected fields.\nIf unqualified, qualify in the current namespace.",
   :var-type "macro",
   :line 924,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([& args]),
   :forms
   [(ann-protocol vbnd varsym & methods)
    (ann-protocol varsym & methods)],
   :name "ann-protocol",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L936",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/ann-protocol",
   :doc
   "Annotate a possibly polymorphic protocol var with method types.\n\neg. (ann-protocol IFoo\n      bar\n      [IFoo -> Any]\n      baz\n      [IFoo -> Number])\n\n    ; polymorphic\n    (ann-protocol [[x :variance :covariant]]\n      IFoo\n      bar\n      [IFoo -> Any]\n      baz\n      [IFoo -> Number])",
   :var-type "macro",
   :line 936,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists
   ([dname
     fields
     &
     {ancests :unchecked-ancestors, rplc :replace, :as opt}]),
   :name "ann-record",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L912",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/ann-record",
   :doc
   "Annotate record Class name dname with expected fields.\nIf unqualified, qualify in the current namespace.",
   :var-type "macro",
   :line 912,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([t init & args]),
   :name "atom>",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L1036",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/atom>",
   :doc
   "Like atom, but creates an Atom1 of type t.\n\nSame as (atom (ann-form init t) args*)\n\neg. (atom> Number 1)\n    (atom> (Vec Any) [])",
   :var-type "macro",
   :line 1036,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([form] [form expected]),
   :name "cf",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L1081",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/cf",
   :doc
   "Takes a form and an optional expected type and\nreturns a human-readable inferred type for that form.\nThrows an exception if type checking fails.\n\nDo not use cf inside a typed namespace. cf is intended to be\nused at the REPL or within a unit test. Note that testing for\ntruthiness is not sufficient to unit test a call to cf, as nil\nand false are valid type syntax.\n\ncf preserves annotations from previous calls to check-ns or cf,\nand keeps any new ones collected during a cf. This is useful for\ndebugging and experimentation. cf may be less strict than check-ns\nwith type checker warnings.\n\neg. (cf 1) \n    ;=> Long\n\n    (cf #(inc %) [Number -> Number])\n    ;=> [Number -> Number]",
   :var-type "macro",
   :line 1081,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([form] [form expected] [form expected type-provided?]),
   :name "check-form*",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L1064",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/check-form*",
   :doc
   "Takes a (quoted) form and optional expected type syntax and\ntype checks the form. If expected is provided, type-provided?\nmust be true.",
   :var-type "function",
   :line 1064,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([form & {:keys [expected type-provided?]}]),
   :name "check-form-info",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L1211",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/check-form-info",
   :doc
   "Alpha - subject to change\n\nType checks a (quoted) form and returns a map of results from type checking the\nform.",
   :var-type "function",
   :line 1211,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([] [ns-or-sym & {:keys [collect-only trace]}]),
   :name "check-ns",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L1302",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/check-ns",
   :doc
   "Type check a namespace (a symbol or Namespace).\nIf not provided default to current namespace.\nReturns a true value if type checking is successful, otherwise\nthrows an Exception.\n\nDo not use check-ns within a checked namespace.\nIt is intended to be used at the REPL or within a unit test.\nSuggested idiom for clojure.test: (is (check-ns 'your.ns))\n\ncheck-ns resets annotations collected from \nprevious check-ns calls or cf. A successful check-ns call will\npreserve any type annotations collect during that checking run.\n\nKeyword arguments:\n- :collect-only  if true, collect type annotations but don't type check code.\n                 Useful for debugging purposes.\n\nIf providing keyword arguments, the namespace to check must be provided\nas the first argument.\n\nBind *verbose-types* to true to print fully qualified types.\nBind *verbose-forms* to print full forms in error messages.\n\neg. (check-ns 'myns.typed)\n    ;=> :ok\n   \n    ; implicitly check current namespace\n    (check-ns)\n    ;=> :ok\n\n    ; collect but don't check the current namespace\n    (check-ns *ns* :collect-only true)",
   :var-type "function",
   :line 1302,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([] [ns-or-sym & {:keys [collect-only trace]}]),
   :name "check-ns-info",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L1240",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/check-ns-info",
   :doc
   "Alpha - subject to change\n\nSame as check-ns, but returns a map of results from type checking the\nnamespace.",
   :var-type "function",
   :line 1240,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([sym ty]),
   :name "declare-alias-kind",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L641",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/declare-alias-kind",
   :doc
   "Declare a kind for an alias, similar to declare but on the kind level.",
   :var-type "macro",
   :line 641,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([& syms]),
   :name "declare-datatypes",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L619",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/declare-datatypes",
   :doc "Declare datatypes, similar to declare but on the type level.",
   :var-type "macro",
   :line 619,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([& syms]),
   :name "declare-names",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L654",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/declare-names",
   :doc "Declare names, similar to declare but on the type level.",
   :var-type "macro",
   :line 654,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([& syms]),
   :name "declare-protocols",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L630",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/declare-protocols",
   :doc "Declare protocols, similar to declare but on the type level.",
   :var-type "macro",
   :line 630,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([sym doc-str t] [sym t]),
   :name "def-alias",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L665",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/def-alias",
   :doc
   "Define a type alias. Takes an optional doc-string as a second\nargument.\n\nUpdates the corresponding var with documentation.\n\neg. (def-alias MyAlias\n      \"Here is my alias\"\n      (U nil String))",
   :var-type "macro",
   :line 665,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([seq-exprs & body]),
   :name "doseq>",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L292",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/doseq>",
   :doc
   "Like doseq but requires annotation for each loop variable: \n[a [1 2]] becomes [a :- Long [1 2]]\n\neg.\n(doseq> [a :- (U nil AnyInteger) [1 nil 2 3]\n         :when a]\n   (inc a))",
   :var-type "macro",
   :line 292,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([bindings & body]),
   :name "dotimes>",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L150",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/dotimes>",
   :doc
   "Like dotimes.\n\neg. (dotimes> [_ 100]\n      (println \"like normal\"))",
   :var-type "macro",
   :line 150,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([& forms]),
   :forms
   [(fn> name? :- type? [param :- type* & param :- type * ?] exprs*)
    (fn>
     name?
     (:- type? [param :- type* & param :- type * ?] exprs*)
     +)],
   :name "fn>",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L494",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/fn>",
   :doc
   "Like fn, but with annotations. Annotations are mandatory\nfor parameters, with optional annotations for return type.\nIf fn is named, return type annotation is mandatory.\n\nSuggested idiom: use commas between parameter annotation triples.\n\neg. (fn> [a :- Number, b :- (U Symbol nil)] ...)\n\n    ;annotate return\n    (fn> :- String [a :- String] ...)\n\n    ;named fn\n    (fn> fname :- String [a :- String] ...)\n\n    ;multi-arity\n    (fn> fname \n      (:- String [a :- String] ...)\n      (:- Long   [a :- String, b :- Number] ...))",
   :var-type "macro",
   :line 494,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([tk ret-ann seq-exprs body-expr]),
   :name "for>",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L167",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/for>",
   :doc
   "Like for but requires annotation for each loop variable: [a [1 2]] becomes [a :- Long [1 2]]\nAlso requires annotation for return type.\n\neg. (for> :- Number\n      [a :- (U nil AnyInteger) [1 nil 2 3]\n       :when a]\n      (inc a))",
   :var-type "macro",
   :line 167,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([inst-of & types]),
   :name "inst",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L120",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/inst",
   :doc "Instantiate a polymorphic type with a number of types",
   :var-type "macro",
   :line 120,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([inst-of & types]),
   :name "inst-ctor",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L125",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/inst-ctor",
   :doc
   "Instantiate a call to a constructor with a number of types.\nFirst argument must be an immediate call to a constructor.\nReturns exactly the instantiatee (the first argument).",
   :var-type "macro",
   :line 125,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists
   ([cljt coll] [javat cljt coll] [into-array-syn javat cljt coll]),
   :name "into-array>",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L745",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/into-array>",
   :doc
   "Make a Java array with Java class javat and Typed Clojure type\ncljt. Resulting array will be of type javat, but elements of coll must be under\ncljt. cljt should be a subtype of javat (the same or more specific).\n\n*Temporary hack*\ninto-array-syn is exactly the syntax to put as the first argument to into-array.\nCalling resolve on this syntax should give the correct class.",
   :var-type "macro",
   :line 745,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([fn-specs-and-annotations & body]),
   :forms [(letfn> [fn-spec-or-annotation*] expr*)],
   :name "letfn>",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L520",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/letfn>",
   :doc
   "Like letfn, but each function spec must be annotated.\n\neg. (letfn> [a :- [Number -> Number]\n             (a [b] 2)\n\n             c :- [Symbol -> nil]\n             (c [s] nil)]\n      ...)",
   :var-type "macro",
   :line 520,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([]),
   :name "load-if-needed",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L1182",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/load-if-needed",
   :doc "Load and initialize all of core.typed if not already",
   :var-type "function",
   :line 1182,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([bndings* & forms]),
   :forms [(loop> [binding :- type init*] exprs*)],
   :name "loop>",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L573",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/loop>",
   :doc
   "Like loop, except loop variables require annotation.\n\nSuggested idiom: use a comma between the type and the initial\nexpression.\n\neg. (loop> [a :- Number, 1\n            b :- (U nil Number), nil]\n      ...)",
   :var-type "macro",
   :line 573,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([mname]),
   :name "method-type",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L73",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/method-type",
   :doc
   "Given a method symbol, print the core.typed types assigned to it.\nIntended for use at the REPL.",
   :var-type "function",
   :line 73,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([msym mmap]),
   :name "nilable-param",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L783",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/nilable-param",
   :doc
   "Override which parameters in qualified method msym may accept\nnilable values. If the parameter is a parameterised type or\nan Array, this also declares the parameterised types and the Array type as nilable.\n\nmmap is a map mapping arity parameter number to a set of parameter\npositions (integers). If the map contains the key :all then this overrides\nother entries. The key can also be :all, which declares all parameters nilable.",
   :var-type "macro",
   :line 783,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([msym arities]),
   :name "non-nil-return",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L767",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/non-nil-return",
   :doc
   "Override the return type of qualified method msym to be non-nil.\nTakes a set of relevant arities,\nrepresented by the number of parameters it takes (rest parameter counts as one),\nor :all which overrides all arities.\n\neg.  (non-nil-return java.lang.Class/getDeclaredMethod :all)",
   :var-type "macro",
   :line 767,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([ctorsym typesyn]),
   :name "override-constructor",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L989",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/override-constructor",
   :doc "Override all constructors for Class ctorsym with type.",
   :var-type "macro",
   :line 989,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([methodsym typesyn]),
   :name "override-method",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L1000",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/override-method",
   :doc "Override type for qualified method methodsym.",
   :var-type "macro",
   :line 1000,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([& forms]),
   :name "pfn>",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L478",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/pfn>",
   :doc
   "Define a polymorphic typed anonymous function.\n(pfn> name? [binder+] :- type? [[param :- type]* & [param :- type *]?] exprs*)\n(pfn> name? [binder+] (:- type? [[param :- type]* & [param :- type *]?] exprs*)+)",
   :var-type "macro",
   :line 478,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([debug-str]),
   :name "print-env",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L797",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/print-env",
   :doc
   "During type checking, print the type environment to *out*,\npreceeded by literal string debug-str.",
   :var-type "function",
   :line 797,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([debug-string frm]),
   :name "print-filterset",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L98",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/print-filterset",
   :doc
   "During type checking, print the filter set attached to form, \npreceeded by literal string debug-string.\nReturns nil.\n\neg. (let [s (seq (get-a-seqable))]\n      (print-filterset \"Here now\" s))",
   :var-type "function",
   :line 98,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([]),
   :name "reset-caches",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L1198",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/reset-caches",
   :doc "Reset internal type caches.",
   :var-type "function",
   :line 1198,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([nsyms]),
   :name "statistics",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L1404",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/statistics",
   :doc
   "Takes a collection of namespace symbols and returns a map mapping the namespace\nsymbols to a map of data",
   :var-type "function",
   :line 1404,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([& body]),
   :name "tc-ignore",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L715",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/tc-ignore",
   :doc "Ignore forms in body during type checking",
   :var-type "macro",
   :line 715,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([& args]),
   :name "typed-deps",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L1011",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/typed-deps",
   :doc
   "Declare namespaces which should be checked before the current namespace.\nAccepts any number of symbols. Only has effect via check-ns.\n\neg. (typed-deps clojure.core.typed.holes\n                myns.types)",
   :var-type "macro",
   :line 1011,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([] [nsyms-or-nsym]),
   :name "var-coverage",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L1429",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/var-coverage",
   :doc
   "Summarises annotated var coverage statistics to *out*\nfor namespaces nsyms, a collection of symbols or a symbol/namespace.\nDefaults to the current namespace if no argument provided.",
   :var-type "function",
   :line 1429,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([]),
   :name "warn-on-unannotated-vars",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L1052",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/warn-on-unannotated-vars",
   :doc
   "Allow unannotated vars in the current namespace. \n\nEmits a warning instead of a type error when checking\na def without a corresponding expected type.\n\neg. (warn-on-unannotated-vars)",
   :var-type "macro",
   :line 1052,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:arglists ([b & body]),
   :name "when-let-fail",
   :namespace "clojure.core.typed",
   :source-url
   "https://github.com/clojure/core.typed/blob/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj#L487",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/5aabbeb1906748719bb9c05327c7d9c9f1e59ebf/src/main/clojure/clojure/core/typed.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed/when-let-fail",
   :doc
   "Like when-let, but fails if the binding yields a false value.",
   :var-type "macro",
   :line 487,
   :file "src/main/clojure/clojure/core/typed.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.async/Buffer",
   :namespace "clojure.core.typed.async",
   :forms [(Buffer t)],
   :var-type "type alias",
   :doc
   "A buffer of type x.\n\n(TFn\n [[x :variance :invariant]]\n (clojure.core.async.impl.protocols/Buffer x))",
   :name "Buffer"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.async/Chan",
   :namespace "clojure.core.typed.async",
   :forms '[(Chan t)],
   :var-type "type alias",
   :doc
   "A core.async channel\n\n(TFn\n [[x :variance :invariant]]\n (Extends\n  [(clojure.core.async.impl.protocols/WritePort x)\n   (clojure.core.async.impl.protocols/ReadPort x)\n   (clojure.core.async.impl.protocols/Channel x x)]))",
   :name "Chan"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.async/Port",
   :namespace "clojure.core.typed.async",
   :forms [(Port t)],
   :var-type "type alias",
   :doc
   "A port that can read and write type x\n\n(TFn\n [[x :variance :invariant]]\n (Extends\n  [(clojure.core.async.impl.protocols/ReadPort x)\n   (clojure.core.async.impl.protocols/WritePort x)]))",
   :name "Port"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.async/ReadOnlyChan",
   :namespace "clojure.core.typed.async",
   :forms '[(ReadOnlyChan t)],
   :var-type "type alias",
   :doc
   "A core.async channel that statically disallows writes.\n\n(TFn\n [[r :variance :covariant]]\n (Extends\n  [(clojure.core.async.impl.protocols/WritePort Nothing)\n   (clojure.core.async.impl.protocols/ReadPort r)\n   (clojure.core.async.impl.protocols/Channel Nothing r)]))",
   :name "ReadOnlyChan"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.async/ReadOnlyPort",
   :namespace "clojure.core.typed.async",
   :forms [(ReadOnlyPort t)],
   :var-type "type alias",
   :doc
   "A read-only port that can read type x\n\n(TFn\n [[r :variance :covariant]]\n (Extends\n  [(clojure.core.async.impl.protocols/ReadPort r)\n   (clojure.core.async.impl.protocols/WritePort Nothing)]))",
   :name "ReadOnlyPort"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.async/TimeoutChan",
   :namespace "clojure.core.typed.async",
   :forms [TimeoutChan],
   :var-type "type alias",
   :doc "A timeout channel\n\n(Chan Any)",
   :name "TimeoutChan"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.async/WriteOnlyPort",
   :namespace "clojure.core.typed.async",
   :forms [(WriteOnlyPort t)],
   :var-type "type alias",
   :doc
   "A write-only port that can write type x\n\n(TFn\n [[x :variance :invariant]]\n (Extends\n  [(clojure.core.async.impl.protocols/ReadPort x)\n   (clojure.core.async.impl.protocols/WritePort x)]))",
   :name "WriteOnlyPort"}
  {:arglists ([t & args]),
   :name "buffer>",
   :namespace "clojure.core.typed.async",
   :source-url
   "https://github.com/clojure/core.typed/blob/8201fe05488acefeb1e8158a8fb413e848657710/src/main/clojure/clojure/core/typed/async.clj#L198",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/8201fe05488acefeb1e8158a8fb413e848657710/src/main/clojure/clojure/core/typed/async.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.async/buffer>",
   :doc
   "A statically typed core.async buffer. \n\n(buffer> t ...) creates a buffer that can read and write type t.\nSubsequent arguments are passed directly to clojure.core.async/buffer.\n\nNote: (buffer> t ...) is the same as ((inst buffer t) ...)",
   :var-type "macro",
   :line 198,
   :file "src/main/clojure/clojure/core/typed/async.clj"}
  {:arglists ([t & args]),
   :name "chan>",
   :namespace "clojure.core.typed.async",
   :source-url
   "https://github.com/clojure/core.typed/blob/8201fe05488acefeb1e8158a8fb413e848657710/src/main/clojure/clojure/core/typed/async.clj#L187",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/8201fe05488acefeb1e8158a8fb413e848657710/src/main/clojure/clojure/core/typed/async.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.async/chan>",
   :doc
   "A statically typed core.async channel. \n\n(chan> t ...) creates a buffer that can read and write type t.\nSubsequent arguments are passed directly to clojure.core.async/chan.\n\nNote: \n(chan> t ...) is the same as ((inst chan t) ...)",
   :var-type "macro",
   :line 187,
   :file "src/main/clojure/clojure/core/typed/async.clj"}
  {:arglists ([t & args]),
   :name "dropping-buffer>",
   :namespace "clojure.core.typed.async",
   :source-url
   "https://github.com/clojure/core.typed/blob/8201fe05488acefeb1e8158a8fb413e848657710/src/main/clojure/clojure/core/typed/async.clj#L218",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/8201fe05488acefeb1e8158a8fb413e848657710/src/main/clojure/clojure/core/typed/async.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.async/dropping-buffer>",
   :doc
   "A statically typed core.async dropping buffer. \n\n(dropping-buffer> t ...) creates a dropping buffer that can read and write type t.\nSubsequent arguments are passed directly to clojure.core.async/dropping-buffer.\n\nNote: (dropping-buffer> t ...) is the same as ((inst dropping-buffer t) ...)",
   :var-type "macro",
   :line 218,
   :file "src/main/clojure/clojure/core/typed/async.clj"}
  {:arglists ([& body]),
   :name "go>",
   :namespace "clojure.core.typed.async",
   :source-url
   "https://github.com/clojure/core.typed/blob/8201fe05488acefeb1e8158a8fb413e848657710/src/main/clojure/clojure/core/typed/async.clj#L161",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/8201fe05488acefeb1e8158a8fb413e848657710/src/main/clojure/clojure/core/typed/async.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.async/go>",
   :doc
   "Asynchronously executes the body, returning immediately to the\ncalling thread. Additionally, any visible calls to <!, >! and alt!/alts!\nchannel operations within the body will block (if necessary) by\n'parking' the calling thread rather than tying up an OS thread (or\nthe only JS thread when in ClojureScript). Upon completion of the\noperation, the body will be resumed.\n\nReturns a channel which will receive the result of the body when\ncompleted",
   :var-type "macro",
   :line 161,
   :file "src/main/clojure/clojure/core/typed/async.clj"}
  {:arglists ([t & args]),
   :name "sliding-buffer>",
   :namespace "clojure.core.typed.async",
   :source-url
   "https://github.com/clojure/core.typed/blob/8201fe05488acefeb1e8158a8fb413e848657710/src/main/clojure/clojure/core/typed/async.clj#L208",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/8201fe05488acefeb1e8158a8fb413e848657710/src/main/clojure/clojure/core/typed/async.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.async/sliding-buffer>",
   :doc
   "A statically typed core.async sliding buffer. \n\n(sliding-buffer> t ...) creates a sliding buffer that can read and write type t.\nSubsequent arguments are passed directly to clojure.core.async/sliding-buffer.\n\nNote: (sliding-buffer> t ...) is the same as ((inst sliding-buffer t) ...)",
   :var-type "macro",
   :line 208,
   :file "src/main/clojure/clojure/core/typed/async.clj"}
  {:arglists ([]),
   :name "->NoisyHole",
   :namespace "clojure.core.typed.hole",
   :source-url
   "https://github.com/clojure/core.typed/blob/6b5231ad882ee07b0ef6c5e978e09c09aed083a6/src/main/clojure/clojure/core/typed/hole.clj#L17",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/6b5231ad882ee07b0ef6c5e978e09c09aed083a6/src/main/clojure/clojure/core/typed/hole.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.hole/->NoisyHole",
   :doc
   "Positional factory function for class clojure.core.typed.hole.NoisyHole.",
   :var-type "function",
   :line 17,
   :file "src/main/clojure/clojure/core/typed/hole.clj"}
  {:arglists ([]),
   :name "noisy-hole",
   :namespace "clojure.core.typed.hole",
   :source-url
   "https://github.com/clojure/core.typed/blob/6b5231ad882ee07b0ef6c5e978e09c09aed083a6/src/main/clojure/clojure/core/typed/hole.clj#L20",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/6b5231ad882ee07b0ef6c5e978e09c09aed083a6/src/main/clojure/clojure/core/typed/hole.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.hole/noisy-hole",
   :doc
   "A noisy hole. The type system will complain when\n(noisy-hole) is used in positions that expect a type\nmore specific than Object or Any.\nUse (noisy-hole) as a placeholder for code.\nThrows an exception when evaluted.",
   :var-type "function",
   :line 20,
   :file "src/main/clojure/clojure/core/typed/hole.clj"}
  {:arglists ([]),
   :name "silent-hole",
   :namespace "clojure.core.typed.hole",
   :source-url
   "https://github.com/clojure/core.typed/blob/6b5231ad882ee07b0ef6c5e978e09c09aed083a6/src/main/clojure/clojure/core/typed/hole.clj#L8",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/6b5231ad882ee07b0ef6c5e978e09c09aed083a6/src/main/clojure/clojure/core/typed/hole.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.hole/silent-hole",
   :doc
   "A silent hole. (silent-hole) passes for any other type\nwhen type checking.\nUse (silent-hole) as a placeholder for code.\nThrows an exception when evaluted.",
   :var-type "function",
   :line 8,
   :file "src/main/clojure/clojure/core/typed/hole.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.hole/NoisyHole",
   :namespace "clojure.core.typed.hole",
   :var-type "type",
   :name "NoisyHole"}
  {:arglists ([& body]),
   :name "with-core-cljs",
   :namespace "clojure.core.typed.util-cljs",
   :source-url
   "https://github.com/clojure/core.typed/blob/048c9ca3dbf7218157423ddf8e18f2a12a48eb9e/src/main/clojure/clojure/core/typed/util_cljs.clj#L12",
   :raw-source-url
   "https://github.com/clojure/core.typed/raw/048c9ca3dbf7218157423ddf8e18f2a12a48eb9e/src/main/clojure/clojure/core/typed/util_cljs.clj",
   :wiki-url
   "http://clojure.github.com/core.typed//clojure.core.typed-api.html#clojure.core.typed.util-cljs/with-core-cljs",
   :doc "Ensure that core.cljs has been loaded.",
   :var-type "macro",
   :line 12,
   :file "src/main/clojure/clojure/core/typed/util_cljs.clj"})}
