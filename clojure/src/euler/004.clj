; https://projecteuler.net/problem=4

(ns euler.004
  (require [clojure.math.combinatorics :as comb]
           [clojure.string :as string]))

(defn palindromic-number? [n]
  "Returns true if a number is palindromic; e.g. 9009 is palindromic, 9008 is not."
  (= n (Integer. (string/reverse (str n)))))

(def three-digit-combs
  "A lazy seq of all possible combinations of numbers from 999-100 (in reverse order)"
  (comb/cartesian-product (range 999 99 -1)
                          (range 999 99 -1)))

(def largest-palindromic-product
  (reduce * (first (drop-while #(not (palindromic-number? (reduce * %)))
                               three-digit-combs))))
