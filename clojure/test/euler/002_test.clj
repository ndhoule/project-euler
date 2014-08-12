(ns euler.002-test
  (:require [clojure.test :refer :all]
            [euler.002 :refer :all]))

(deftest euler-002
  (testing "solution"
    (let [sol (even-fibs-sum 4000000)]
      (is (= sol 4613732)))))
