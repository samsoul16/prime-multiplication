(ns prime-multiplication.core-test
  (:require [clojure.test :refer :all]
            [prime-multiplication.core :refer :all]))

(deftest test-prime?
  (testing "Check Prime? Function"
    (is (false? (prime? 1)))
    (is (true? (prime? 2)))
    (is (true? (prime? 3)))
    (is (false? (prime? 4)))
    (is (true? (prime? 113)))
    (is (false? (prime? 225)))
    (is (true? (prime? 227)))))

(def expected-primes [  2   3   5   7  11  13  17  19  23  29
                       31  37  41  43  47  53  59  61  67  71
                       73  79  83  89  97 101 103 107 109 113
                      127 131 137 139 149 151 157 163 167 173
                      179 181 191 193 197 199 211 223 227 229])

(deftest test-get-primes
  (testing "Check the retrieval of Prime Numbers"
    (is (= (take 2 expected-primes) (get-primes 2)))
    (is (= (take 5 expected-primes) (get-primes 5)))
    (is (= (take 10 expected-primes) (get-primes 10)))
    (is (= (take 25 expected-primes) (get-primes 25)))))

(deftest test-prime-mx-table
  (testing "Check Prime Multiplication table is returned in proper format to be consumed by print-table"
    (is (= (prime-mx-table 3) [{1 2, 2 4, 3 6, 5 10}
                               {1 3, 2 6, 3 9, 5 15}
                               {1 5, 2 10, 3 15, 5 25}]))
    (is (= (prime-mx-table 5) [{1 2, 2 4, 3 6, 5 10, 7 14, 11 22}
                               {1 3, 2 6, 3 9, 5 15, 7 21, 11 33}
                               {1 5, 2 10, 3 15, 5 25, 7 35, 11 55}
                               {1 7, 2 14, 3 21, 5 35, 7 49, 11 77}
                               {1 11, 2 22, 3 33, 5 55, 7 77, 11 121}]))
    (is (= (prime-mx-table 7) [{1 2, 2 4, 3 6, 5 10, 7 14, 11 22, 13 26, 17 34}
                               {1 3, 2 6, 3 9, 5 15, 7 21, 11 33, 13 39, 17 51}
                               {1 5, 2 10, 3 15, 5 25, 7 35, 11 55, 13 65, 17 85}
                               {1 7, 2 14, 3 21, 5 35, 7 49, 11 77, 13 91, 17 119}
                               {1 11, 2 22, 3 33, 5 55, 7 77, 11 121, 13 143, 17 187}
                               {1 13, 2 26, 3 39, 5 65, 7 91, 11 143, 13 169, 17 221}
                               {1 17, 2 34, 3 51, 5 85, 7 119, 11 187, 13 221, 17 289}]))
    (is (= (prime-mx-table 10) [{1 2, 2 4, 3 6, 5 10, 7 14, 11 22, 13 26, 17 34, 19 38, 23 46, 29 58}
                                {1 3, 2 6, 3 9, 5 15, 7 21, 11 33, 13 39, 17 51, 19 57, 23 69, 29 87}
                                {1 5, 2 10, 3 15, 5 25, 7 35, 11 55, 13 65, 17 85, 19 95, 23 115, 29 145}
                                {1 7, 2 14, 3 21, 5 35, 7 49, 11 77, 13 91, 17 119, 19 133, 23 161, 29 203}
                                {1 11, 2 22, 3 33, 5 55, 7 77, 11 121, 13 143, 17 187, 19 209, 23 253, 29 319}
                                {1 13, 2 26, 3 39, 5 65, 7 91, 11 143, 13 169, 17 221, 19 247, 23 299, 29 377}
                                {1 17, 2 34, 3 51, 5 85, 7 119, 11 187, 13 221, 17 289, 19 323, 23 391, 29 493}
                                {1 19, 2 38, 3 57, 5 95, 7 133, 11 209, 13 247, 17 323, 19 361, 23 437, 29 551}
                                {1 23, 2 46, 3 69, 5 115, 7 161, 11 253, 13 299, 17 391, 19 437, 23 529, 29 667}
                                {1 29, 2 58, 3 87, 5 145, 7 203, 11 319, 13 377, 17 493, 19 551, 23 667, 29 841}
                                ]))))