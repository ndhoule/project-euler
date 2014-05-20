#!/usr/bin/env node

/**
 * Author: Nathan Houle
 *
 * https://projecteuler.net/problem=1
 */

'use strict';

var R = require('ramda');
var isMultipleOf = require('./lib/utils').math.isMultipleOf;

var sumOfMultiplesOfThreeAndFive = R.compose(
  R.sum,
  R.filter(R.orFn(
    isMultipleOf(3),
    isMultipleOf(5)
  )),
  R.range
)(1, 1000);

console.log('Solution: %d', sumOfMultiplesOfThreeAndFive);
