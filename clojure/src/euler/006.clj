; https://projecteuler.net/problem=6

(ns euler.006)

(defn square [x]
  (* x x))

(defn sum-of-range-squares [min max]
  "Returns the sum of min^2...max^2, where min is inclusive and max is exclusive"
  (reduce + (map square (range min max))))

(defn square-of-range-sum [min max]
  "Returns the square of the sum of min...max, where min is inclusive and max is exclusive"
  (square (reduce + (range min max))))

(defn difference-of-square-sums [min max]
  (- (square-of-range-sum min max) (sum-of-range-squares min max)))

(def solution
  (difference-of-square-sums 1 101))
