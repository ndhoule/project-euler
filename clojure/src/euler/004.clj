; https://projecteuler.net/problem=4

(ns euler.004
  (require [clojure.string :as string]))

(defn palindromic-number? [n]
  "Returns true if a number is palindromic; e.g. 9009 is palindromic, 9008 is not."
  (= n (Integer. (string/reverse (str n)))))

(def three-digit-products
  (for [x (range 100 1000)
        y (range 100 1000)]
    (* x y)))

(def largest-palindromic-product
  (apply max (filter palindromic-number? three-digit-products)))
