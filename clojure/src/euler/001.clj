; https://projecteuler.net/problem=1

(ns euler.001
  (require [clojure.set :refer :all]
           [clojure.test :refer [is]]))

(defn multiple-of-n? [n, num]
  (zero? (mod num n)))

(defn multiple-of-3-or-5? [n]
  (or (multiple-of-n? 3 n)
      (multiple-of-n? 5 n)))

; Produce the entire range of numbers and then filter it down
(defn multiples-3-and-5-sol1 [min max]
  (reduce + (filter multiple-of-3-or-5? (range min max))))

(is (= 233168 (multiples-3-and-5-sol1 0 1000)))


; Use `distinct` instead
(defn multiples-3-and-5-sol2 [min max]
  (reduce + (distinct (concat (range min max 3)
                              (range min max 5)))))

(is (= 233168 (multiples-3-and-5-sol2 0 1000)))


; Produce two ranges and convert to `set` to deduplicate the range
; Apparently slightly more performant (but who cares)
(defn multiples-3-and-5-sol3 [min max]
  (reduce + (set (concat (range min max 3)
                         (range min max 5)))))

(is (= 233168 (multiples-3-and-5-sol3 0 1000)))
