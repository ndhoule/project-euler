(ns euler.006-test
  (:require [clojure.test :refer :all]
            [euler.006 :refer :all]))

(deftest euler-006
  (testing "square"
    (is (= 4 (square -2)))
    (is (= 4 (square 2)))
    (is (= 64 (square 8))))

  (testing "sum-of-range-squares"
    (is (= 0 (sum-of-range-squares 0 -11)))
    (is (= 0 (sum-of-range-squares 0 1)))
    (is (= 13 (sum-of-range-squares 2 4)))
    (is (= 13 (sum-of-range-squares 2 4)))
    (is (= 285 (sum-of-range-squares 1 10))))

  (testing "square-of-range-sum"
    (is (= 0 (sum-of-range-squares 0 -11)))
    (is (= 0 (sum-of-range-squares 0 1)))
    (is (= 225 (square-of-range-sum 1 6)))
    (is (= 3025 (square-of-range-sum 1 11))))

  (testing "difference-of-square-sums"
    (is (= 0 (difference-of-square-sums 1 -10)))
    (is (= 0 (difference-of-square-sums 1 1)))
    (is (= 25164150 (difference-of-square-sums 1 101))))

  (testing "solution"
    (is (= 25164150 solution))))
