(ns euler.008-test
  (:require [clojure.test :refer :all]
            [euler.008 :refer :all]))

(deftest euler-008
  (testing "num-to-seq"
    (is (= '(1 2 3) (num-to-seq 123)))
    (is (= '(9 2 3 5 8) (num-to-seq 92358))))

  (testing "max-product-of-n-adjacent-digits"
    (is (= 6 (max-product-of-n-adjacent-digits 3 123)))
    (is (= 24 (max-product-of-n-adjacent-digits 3 1234)))
    (is (= 8 (max-product-of-n-adjacent-digits 3 3214))))

  (testing "solution"
    (is (= 23514624000 solution))))
