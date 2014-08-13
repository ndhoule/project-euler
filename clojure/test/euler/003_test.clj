(ns euler.003-test
  (:require [clojure.test :refer :all]
            [euler.003 :refer :all]))

(deftest euler-003
  (testing "isPrime"
    (is (false? (is-prime? -5)))
    (is (false? (is-prime? 0)))
    (is (false? (is-prime? 1)))
    (is (false? (is-prime? 6)))
    (is (false? (is-prime? 12)))
    (is (false? (is-prime? 25)))
    (is (true? (is-prime? 11)))
    (is (true? (is-prime? 2)))
    (is (true? (is-prime? 3)))
    (is (true? (is-prime? 5)))
    (is (true? (is-prime? 7))))

  (testing "primes"
    (let [first-10-primes '(2 3 5 7 11 13 17 19 23 29)]
      (is (= first-10-primes (take 10 primes)))))

  (testing "prime-divisors-of-n"
    (let [prime-divisors-of-13195 '(5 7 13 29)]
      (is (= prime-divisors-of-13195 (prime-divisors-of-n 13195)))))

  (testing "solution"
    (is (= 6857 solution))))
