(ns prime-multiplication.core
  (:gen-class)
  (:require [clojure.math.numeric-tower :refer [sqrt]] ;; Using Square-root function from Numeric Tower Library
            [clojure.pprint :refer [print-table]])) ;; Using print-table to print output in table format

(defn prime?
  "Checks Whether the number is a Prime No. or Not.
  => Prime Test Used :
    1. The num should be greater than 1
    2. The num should not be an even number except 2
    3. Check num's divisibility only in increments of 2 i.e only for odd Nos as even Nos are divisible by 2
    4. Iterate Only till the square root of the given number to reduce the number of iterations"
  ([num] (if (and (> num 1) (or (odd? num) (= 2 num)))
           (prime? num 3)
           false)) ;; NOTE: Manually return `false` for consistency, Could use `when` but then change tests to check for `nil?` instead of `false?`
  ([num i] (if (> i (sqrt num)) ;; Used square-root function form Numeric Tower Library
             true
             (if (zero? (mod num i)) ;; Divisibility Check
               false
               (recur num (+ 2 i))))))

(defn get-primes
  "Returns the First n prime Numbers"
  [n]
  (vec (cons 2 ;; Manually assoc 2 at the start as is the only even prime
             (take (dec n)
                   (filter prime?
                           (iterate (partial + 2) 3)))))) ;; check only for odd numbers

(defn prime-mx-table
  "Create the Prime Multiplication Table for n numbers
  => Output format :
    - The list of maps to be consumed by clojure.pprint/print-table
  => NOTE: Manually Insert 1st element as {1 PrimeNo} for table format"
  [n]
  (let [primes (get-primes n)]
    (mapv (fn [x]
            (into (sorted-map) ;; Convert list to map
                  (cons {1 x} ;; Insert {1 PrimeNo} to print actual Prime No in 1st row and col
                        (map #(hash-map % (* % x)) ;; For every cell create {Col Multiplication} eg : {2 4}
                             primes))))
          primes)))

(defn -main
  "Print the Prime Numbers Multiplication Table up for the first n(given input) prime numbers or prints for the first 10 prime numbers by default"
  [& args]
  (let [n (try (Integer/parseInt (first args))
               (catch Exception e 10))]
    (print-table (prime-mx-table n)))) ;; Print using the print-table function of clojure.pprint
