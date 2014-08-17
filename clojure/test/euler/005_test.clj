(ns euler.005-test
  (:require [clojure.test :refer :all]
            [euler.005 :refer :all]))

(deftest euler-005
  (testing "solution"
    (is (= 232792560 solution))))
