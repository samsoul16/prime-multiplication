# Prime Multiplication

[Clojure](https://clojure.org/) Program to print the Prime Multiplication Table for first `n` Prime Numbers

## Specifications

Make sure you have these installed :
1. [Java](https://www.java.com/en/download/)
2. [Leiningen](http://leiningen.org)

## Usage

Navigate to project root directory

### Using Java

For Multiplication Table of 10 prime numbers : 10 is default value

` $ java -jar prime-multiplication.jar `

For Multiplication Table of n prime numbers : n is any natural number

` $ java -jar prime-multiplication.jar n `

### Using Leiningen

For Multiplication Table of 10 prime numbers : 10 is default value

` $ lein run `

For Multiplication Table of n prime numbers : n is any natural number

` $ lein run 15 `

## Examples

### Java

```
$ java -jar prime-multiplication.jar 5

|  1 |  2 |  3 |  5 |  7 |  11 |
|----|----|----|----|----|-----|
|  2 |  4 |  6 | 10 | 14 |  22 |
|  3 |  6 |  9 | 15 | 21 |  33 |
|  5 | 10 | 15 | 25 | 35 |  55 |
|  7 | 14 | 21 | 35 | 49 |  77 |
| 11 | 22 | 33 | 55 | 77 | 121 |
```

### Leiningen

```
$ lein run

|  1 |  2 |  3 |   5 |   7 |  11 |  13 |  17 |  19 |  23 |  29 |
|----|----|----|-----|-----|-----|-----|-----|-----|-----|-----|
|  2 |  4 |  6 |  10 |  14 |  22 |  26 |  34 |  38 |  46 |  58 |
|  3 |  6 |  9 |  15 |  21 |  33 |  39 |  51 |  57 |  69 |  87 |
|  5 | 10 | 15 |  25 |  35 |  55 |  65 |  85 |  95 | 115 | 145 |
|  7 | 14 | 21 |  35 |  49 |  77 |  91 | 119 | 133 | 161 | 203 |
| 11 | 22 | 33 |  55 |  77 | 121 | 143 | 187 | 209 | 253 | 319 |
| 13 | 26 | 39 |  65 |  91 | 143 | 169 | 221 | 247 | 299 | 377 |
| 17 | 34 | 51 |  85 | 119 | 187 | 221 | 289 | 323 | 391 | 493 |
| 19 | 38 | 57 |  95 | 133 | 209 | 247 | 323 | 361 | 437 | 551 |
| 23 | 46 | 69 | 115 | 161 | 253 | 299 | 391 | 437 | 529 | 667 |
| 29 | 58 | 87 | 145 | 203 | 319 | 377 | 493 | 551 | 667 | 841 |
```

## Test

The test suite can be run with lein

` $ lein test `

## Build

To build the standalone JAR file, use :

` $ lein uberjar`

## Project Dependencies

[Numeric Tower](https://github.com/clojure/math.numeric-tower)

## License

Copyright © 2019 sam16

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
