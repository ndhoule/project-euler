; https://projecteuler.net/problem=2

(ns euler.002
  (require [clojure.test :refer [is]]))

(def fibs
  (lazy-cat [1 2] (map + fibs (rest fibs))))

(defn even-fibs-sum [max]
  (reduce + (filter even? (take-while #(< % max) fibs))))
