(ns euler.003-test
  (:require [clojure.test :refer :all]
            [euler.003 :refer :all]))

(deftest euler-003
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

  (testing "solution"
    (is (= 6857 (biggest-prime-divisor-of-n 600851475143)))))
