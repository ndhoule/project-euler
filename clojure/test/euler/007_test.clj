(ns euler.007-test
  (:require [clojure.test :refer :all]
            [euler.007 :refer :all]))

(deftest euler-007
  (testing "prime?"
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

  (testing "n-primes"
    (is (= '(2 3 5 7 11 13 17 19 23 29) (n-primes 10))))

  (testing "solution"
    (is (= 104743 solution))))
