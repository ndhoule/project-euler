(ns euler.005-test
  (:require [clojure.test :refer :all]
            [euler.005 :refer :all]))

(deftest euler-005
  (testing "gcd"
    (is (= 21 (gcd 1071 462)))
    (is (= 6 (gcd 54 24)))
    (is (= 14 (gcd 42 56))))

  (testing "lcm"
    (is (= 25 (lcm 25 25)))
    (is (= 25 (lcm 5 25)))
    (is (= 2 (lcm 1 2)))
    (is (= 12 (lcm 4 6))))

  (testing "solution"
    (is (= 232792560 solution))))
