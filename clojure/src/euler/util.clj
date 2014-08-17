(ns euler.util
  (:require [clojure.math.numeric-tower :as math]))

(def infinity
  "Shortcut to infinity"
  Double/POSITIVE_INFINITY)

(defn square
  "Returns a number raised to the second power."
  [x]
  (* x x))

(defn multiple-of?
  "Returns true if `num` is a multiple of `n`, false otherwise."
  [n, num]
  (zero? (mod num n)))

(defmulti prime?
  "Returns true if a number is divisible by only 1 and itself, false otherwise."
  (fn [n] (cond
            (> 2 n) :not
            (= 2 n) :is)))

(defmethod prime? :not [_] false)

(defmethod prime? :is [_] true)

(defmethod prime? :default [n]
  (empty? (filter #(zero? (mod n %))
                  (range 2 (inc (math/sqrt n))))))

(defn gcd
  "Returns the greatest common denominator of two numbers."
  [a b]
  (if (zero? b)
    a
    (recur b (mod a b))))

(defn lcm
  "Returns the least common multiple of two numbers."
  [a b]
  (/ (* a b) (gcd a b)))

;; Seqs

(def fibs
  "A lazy seq of all fibonacci numbers."
  (lazy-cat [0 1] (map + fibs (rest fibs))))

(def primes
  ; TODO: Refactor this to use Sieve of Eratosthenes
  "A lazy seq of all primes. (Inefficient; should use `clojure.contrib.lazy-seq` instead.)"
  (concat
    ; Seed primes
    [2 3 5 7]
    (filter prime? (range 11 infinity 2))))
