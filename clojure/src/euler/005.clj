; https://projecteuler.net/problem=5
;
;
; 2520 is the smallest number that can be divided by each of the numbers from 1
; to 10 without any remainder.
;
; What is the smallest positive number that is evenly divisible by all of the
; numbers from 1 to 20?

(ns euler.005)

(defn gcd [a b]
  "Returns the greatest common denominator of two numbers."
  (if (zero? b)
    a
    (recur b (mod a b))))

(defn lcm [a b]
  "Returns the least common multiple of two numbers."
  (/ (* a b) (gcd a b)))

(def solution
  ; "Smallest possible number evenly divisible by all numbers" rephrased is
  ; "Least common multiple of all numbers"
  ;
  ; Iterate through the range, finding in turn the LCM of each number and an
  ; accumulator (the common LCM so far)
  (reduce lcm (range 1 21)))
