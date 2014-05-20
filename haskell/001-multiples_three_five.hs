#!/usr/bin/env ghci

import Data.List (union)

sumOfMultiplesOfThreeAndFive :: Int
sumOfMultiplesOfThreeAndFive = sum $ union [3, 6..999] [5, 10..999]

main :: IO ()
main = print sumOfMultiplesOfThreeAndFive
