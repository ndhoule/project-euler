; https://projecteuler.net/problem=2

(ns euler.002
  (:require [euler.util :as util]))

(defn even-fibs-sum [max]
  (reduce + (filter even? (take-while #(< % max) util/fibs))))
