; https://projecteuler.net/problem=7

(ns euler.007
  (:require [euler.util :as util]))

(defn n-primes [n]
  "Returns the first n primes."
  (take n util/primes))

(def solution
  (last (n-primes 10001)))
