(require '[prolin :as p])
(require '[prolin.protocols :as pp])
(require '[prolin.commons-math :as cm])

; Quiz. 1
;(println
;  (p/maximize (cm/solver) "z" #{
;                                "z = 3a + 5b",
;                                "1a + 0b <= 4",
;                                "0a + 2b <= 12",
;                                "3a + 2b <= 18",
;                                "a >= 0",
;                                "b >= 0",
;                                })
;  )

; Quiz. 2
;(println
;  (p/maximize (cm/solver) "z" #{
;                                "z = 8a + 6b"
;                                "z = 5c + 12d"
;                                "z = 10e + 4f"
;                                "8a + 5c + 10e <= 100",
;                                "6b + 12d + 4f <= 80",
;                                "8a + 6b >= z",
;                                "5c + 12d >= z",
;                                "10e + 4f >= z",
;                                "a >= 0"
;                                "b >= 0"
;                                "c >= 0"
;                                "d >= 0"
;                                "e >= 0"
;                                "f >= 0"
;                                })
;  )

; Quiz. 3
;(println
;  (p/minimize (cm/solver) "z" #{
;                                "z = 2a + 3b + 4c + 6d + 7e + 5f + 7g + 8h + 9i + 9j + 8k + 9l",
;                                "a + d + g + j >= 1",
;                                "b + e + h + k >= 1",
;                                "c + f + i + l >= 1",
;                                "d + g + i + j + l >= 1",
;                                "a + f + j + k >= 1",
;                                "d + e + i >= 1",
;                                "g + h + j + k + l >= 1",
;                                "b + d + e + i >= 1",
;                                "e + h + k >= 1",
;                                "c + g + h + l >= 1",
;                                "f + i + j + k + l >= 1",
;                                "a + b + c + d + e + f + g + h + i + j + k + l = 3",
;                                "a >= 0"
;                                "b >= 0"
;                                "c >= 0"
;                                "d >= 0"
;                                "e >= 0"
;                                "f >= 0"
;                                "g >= 0"
;                                "h >= 0"
;                                "i >= 0"
;                                "j >= 0"
;                                "k >= 0"
;                                "l >= 0"
;                                })
;  )

; Quiz. 4
;(println
;  (p/maximize (cm/solver) "z" #{
;                                "z = 3a + 5b + 6c + 7d + 5e + 5f + 6g + 9h + 2i + 4j + 7k + 8l + 6m + 7n + 9o + 9p",
;                                "a + 2b + 3c + 4d + e + 2f + 3g + 4h + i + 2j + 3k + 4l + m + 2n + 3o + 4p <= 7",
;                                "a + b + c + d = 1",
;                                "e + f + g + h = 1",
;                                "i + j + k + l = 1",
;                                "m + n + o + p = 1",
;                                "a >= 0"
;                                "a <= 1"
;                                "b >= 0"
;                                "b <= 1"
;                                "c >= 0"
;                                "c <= 1"
;                                "d >= 0"
;                                "d <= 1"
;                                "e >= 0"
;                                "e <= 1"
;                                "f >= 0"
;                                "f <= 1"
;                                "g >= 0"
;                                "g <= 1"
;                                "h >= 0"
;                                "h <= 1"
;                                "i >= 0"
;                                "i <= 1"
;                                "j >= 0"
;                                "j <= 1"
;                                "k >= 0"
;                                "k <= 1"
;                                "l >= 0"
;                                "l <= 1"
;                                "m >= 0"
;                                "m <= 1"
;                                "n >= 0"
;                                "n <= 1"
;                                "o >= 0"
;                                "o <= 1"
;                                "p >= 0"
;                                "p <= 1"
;                                })
;  )

; Quiz 5.
; TODO. fix
;(println
;  (p/maximize (cm/solver) "z" #{
;                                "z = 70a + 60b + 90c + 80d - 50000e - 40000f - 70000g - 60000h"
;                                "i(5ae + 3bf + 6cg + 4dh) <= 6000i",
;                                "j(4ae + 6bf + 3cg + 5dh) <= 6000j",
;                                "e + f >= 1"
;                                "e + f + g + h = 2"
;                                "i + j = 1"
;                                "a >= 0",
;                                "b >= 0",
;                                "c >= 0",
;                                "d >= 0",
;                                "e >= 0",
;                                "e <= 1",
;                                "f >= 0",
;                                "f <= 1",
;                                "g >= 0",
;                                "g <= 1",
;                                "h >= 0",
;                                "h <= 1",
;                                "i >= 0",
;                                "i <= 1",
;                                "j >= 0",
;                                "j <= 1",
;                                })
;  )
