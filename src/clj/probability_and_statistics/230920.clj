(def vec
  ;[572, 572, 573, 568, 569, 575, 565, 570]
  [23, 60, 79, 32, 57, 74, 52, 70, 82, 36, 80, 77, 81, 95, 41, 65, 92, 85, 55, 79, 52, 10, 64, 75, 78, 25, 80, 98, 81, 67, 41, 71, 83, 54, 64, 72]
  )

(defn exp [x n]
  (reduce * (repeat n x)))

; 벡터의 평균
(defn average [vec]
  (float (/ (reduce + vec) (count vec)))
  )

; 벡터의 중앙값
(defn median [vec]
  (let [sorted (sort vec) len (count vec)]
    (if (even? len)
      (float (/ (+ (nth sorted (/ len 2)) (nth sorted (- (/ len 2) 1))) 2))
      (nth sorted (/ len 2))
      )
    )
  )

; 벡터의 분산
(defn standard-variance [vec]
  (/ (reduce + (map #(exp (- % (average vec)) 2) vec)) (- (count vec) 1))
  )

; 벡터의 표준편차
(defn standard-deviation [vec]
  (Math/sqrt (standard-variance vec))
  )

; 벡터의 범위
(defn standard-range [vec]
  (- (reduce max vec) (reduce min vec))
  )

; 최소값과 최대값 사이에 존재하는 벡터
(defn between [vec, min, max]
  (filter #(and (>= % min) (<= % max)) vec)
  )

(println (str "평균: " (average vec)))
(println (str "중앙값: " (median vec)))
(println (str "분산: " (standard-variance vec)))
(println (str "표준편차: " (standard-deviation vec)))
(println (str "범위: " (standard-range vec)))

(println (map #(sort (between vec % (+ % 14))) (map #(+ (* % 15) 10) (range 6))))
(println (map #(/ (count (between vec % (+ % 14))) (count vec)) (map #(+ (* % 15) 10) (range 6))))
