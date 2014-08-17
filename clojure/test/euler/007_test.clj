(ns euler.007-test
  (:require [clojure.test :refer :all]
            [euler.007 :refer :all]))

(deftest euler-007
  (testing "n-primes"
    (is (= '(2 3 5 7 11 13 17 19 23 29) (n-primes 10))))

  (testing "solution"
    (is (= 104743 solution))))
