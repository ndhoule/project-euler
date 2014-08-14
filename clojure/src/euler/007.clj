; https://projecteuler.net/problem=7

(ns euler.007
  (:require [clojure.math.numeric-tower :as math]))

(def infinity
  "Shortcut to infinity"
  Double/POSITIVE_INFINITY)

(defmulti prime?
  "Returns `true` if a number is divisible only by itself and 1, and `false` otherwise."
  (fn [x] (cond
            (> 2 x) :not
            (= 2 x) :is)))

(defmethod prime? :not [_] false)

(defmethod prime? :is [_] true)

(defmethod prime? :default [x]
  (empty? (filter #(zero? (mod x %))
                  (range 2 (inc (math/sqrt x))))))

(def primes
  "A lazy seq of all primes. (Mildly inefficient; should use `clojure.contrib.lazy-seq` instead.)"
  (concat
    [2 3 5 7]
    (filter prime? (range 11 infinity 2))))

(defn n-primes [n]
  "Returns the first n primes."
  (take n primes))

(def solution
  (last (n-primes 10001)))
