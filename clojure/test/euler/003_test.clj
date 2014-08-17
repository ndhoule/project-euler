(ns euler.003-test
  (:require [clojure.test :refer :all]
            [euler.003 :refer :all]))

(deftest euler-003
  (testing "solution"
    (is (= 6857 (biggest-prime-divisor-of-n 600851475143)))))
