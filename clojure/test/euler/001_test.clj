(ns euler.001-test
  (:require [clojure.test :refer :all]
            [euler.001 :refer :all]))

(deftest euler-001
  (testing "solution 1"
    (let [sol (multiples-3-and-5-sol1 0 1000)]
      (is (= 233168 sol))))

  (testing "solution 2"
    (let [sol (multiples-3-and-5-sol2 0 1000)]
      (is (= 233168 sol))))

  (testing "solution 3"
    (let [sol (multiples-3-and-5-sol3 0 1000)]
      (is (= 233168 sol)))))
