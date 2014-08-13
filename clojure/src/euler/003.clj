; https://projecteuler.net/problem=3

(ns euler.003
  (:require [clojure.math.numeric-tower :as math]))

(defmulti prime?
  "Returns true if a number is divisible by only 1 and itself, false otherwise."
  (fn [n] (cond
            (> 2 n) :not
            (= 2 n) :is)))

(defmethod prime? :not [_] false)

(defmethod prime? :is [_] true)

(defmethod prime? :default [n]
  (empty? (filter #(zero? (mod n %))
                  (range 2 (+ 1 (math/sqrt n))))))

(defn primes-below [n]
  "Returns a lazy seq of all possible primes less than n."
  ; Use `int` to cast and floor n, subtract 1 so it's exclusive of `n`
  (filter prime? (range (dec (int n)) 1 -1)))

(defn possible-prime-factors-of [n]
  "Returns a lazy seq of all possible prime factors of n in order of largest to smallest."
  ; Add 1 so `primes-below` results includes `sqrt(n)`
  (primes-below (inc (math/floor (math/sqrt n)))))

(defn biggest-prime-divisor-of-n [n]
  "Returns the first prime divisor of n, or `nil` if ."
  (let [possible-primes (possible-prime-factors-of n)]
    (first (drop-while #(not (zero? (mod n %)))
                       possible-primes))))
