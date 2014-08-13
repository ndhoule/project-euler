; https://projecteuler.net/problem=3

(ns euler.003
  (:require [clojure.math.numeric-tower :as math]))

(def infinity
  "Shortcut to infinity."
  Double/POSITIVE_INFINITY)

(defmulti is-prime?
  "Returns true if a number is divisible by only 1 and itself, false otherwise."
  (fn [n] (cond
            (> 2 n) :lt2
            (= 2 n) :is2)))

(defmethod is-prime? :lt2 [_] false)

(defmethod is-prime? :is2 [_] true)

(defmethod is-prime? :default [n]
  (zero? (count (filter #(zero? (mod n %))
                     (range 2 (+ 1 (math/sqrt n)))))))


(def primes
  "Generates an infinite seq of prime numbers."
  ; Add 2 to the head of the list so we can easily skip all even possibilities
  (filter is-prime? (cons 2 (range 3 infinity 2))))

(defn prime-divisors-of-n [n]
  (filter #(zero? (mod n %)) (take-while #(<= % (math/sqrt n)) primes)))

(def solution
  (last (prime-divisors-of-n 600851475143)))

(println solution)
