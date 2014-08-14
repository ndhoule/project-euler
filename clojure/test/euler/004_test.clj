(ns euler.004-test
  (:require [clojure.test :refer :all]
            [euler.004 :refer :all]))

(deftest euler-004
  (testing "palindromic-number?"
    (is (false? (palindromic-number? 10)))
    (is (false? (palindromic-number? 102)))
    (is (false? (palindromic-number? 9008)))
    (is (true? (palindromic-number? 1)))
    (is (true? (palindromic-number? 11)))
    (is (true? (palindromic-number? 101)))
    (is (true? (palindromic-number? 9009))))

  (testing "solution"
    (is (= 906609 largest-palindromic-product))))
