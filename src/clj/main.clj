(use 'clojure.core.matrix)
(use 'clojure.core.matrix.operators)
(require '[prolin :as p])
(require '[prolin.protocols :as pp])
(require '[prolin.commons-math :as cm])

;(def a
;  [[1 2 3] [0 1 0] [-1 1 1]])
;
;(def b
;  [[0 1 0] [6 7 -1] [-2 0 -1]])
;
;(println (- b a))

;(println
;  (p/maximize (cm/solver) "z" #{
;                                "z = 25x + 20y",
;                                "9x + 6y <= 756",
;                                "6x + 8y <= 720",
;                                "0.05x + 0.05y <= 4.5",
;                                })
;)
