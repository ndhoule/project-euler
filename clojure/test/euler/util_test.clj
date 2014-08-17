(ns euler.util-test
  (:require [clojure.test :refer :all]
            [euler.util :refer :all]))

(deftest euler-util

  (testing "square"
    (is (= 4 (square -2)))
    (is (= 4 (square 2)))
    (is (= 64 (square 8))))

  (testing "isPrime"
    (is (false? (prime? -5)))
    (is (false? (prime? 0)))
    (is (false? (prime? 1)))
    (is (false? (prime? 6)))
    (is (false? (prime? 12)))
    (is (false? (prime? 25)))
    (is (true? (prime? 11)))
    (is (true? (prime? 2)))
    (is (true? (prime? 3)))
    (is (true? (prime? 5)))
    (is (true? (prime? 7))))

  (testing "gcd"
    (is (= 21 (gcd 1071 462)))
    (is (= 6 (gcd 54 24)))
    (is (= 14 (gcd 42 56))))

  (testing "lcm"
    (is (= 25 (lcm 25 25)))
    (is (= 25 (lcm 5 25)))
    (is (= 2 (lcm 1 2)))
    (is (= 12 (lcm 4 6)))))
