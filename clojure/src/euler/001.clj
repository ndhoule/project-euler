; https://projecteuler.net/problem=1

(ns euler.001
  (require [euler.util :as util]
           [clojure.set :refer :all]))

(defn multiple-of-3-or-5? [n]
  (or (util/multiple-of? 3 n)
      (util/multiple-of? 5 n)))

; Produce the entire range of numbers and then filter it down
(defn multiples-3-and-5-sol1 [min max]
  (reduce + (filter multiple-of-3-or-5? (range min max))))

; Use `distinct` and range stepping instead
(defn multiples-3-and-5-sol2 [min max]
  (reduce + (distinct (concat (range min max 3)
                              (range min max 5)))))

; Produce two ranges and convert to `set` to deduplicate the range
; Apparently slightly more performant (but who cares)
(defn multiples-3-and-5-sol3 [min max]
  (reduce + (set (concat (range min max 3)
                         (range min max 5)))))
