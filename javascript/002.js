#!/usr/bin/env node

/**
 * Author: Nathan Houle
 *
 * https://projecteuler.net/problem=2
 */

'use strict';

var r = require('ramda');
r.mixin(require('./lib/ramda-contrib'));
var _ = require('lodash');
_.mixin(require('lodash-contrib'));
var utils = require('./lib/utils');
var isEven = utils.math.isEven;
var isFib = utils.math.isFib;

/**
 * functionalEvenFibSum
 *
 * Returns the sum of all even fibonacci numbers whose value does not exceed `max`.
 *
 * Doesn't do memoization and suffers from performance problems related to
 * calling filter functions repeatedly (up to two calls per number).
 *
 * @param {number} The maximum value of any given fibonacci number.
 * @return {number} The sum of all fibonacci numbers whose value is between 0 and `max`.
 */
var functionalEvenFibSum = r.compose(
  r.sum,
  r.filter(r.andFn(isEven, isFib)),
  r.range(0),
  // `range`'s second argument is exclusive
  r.add(1)
);

/**
 * stackFib
 *
 * Returns the nth fibonacci number. Memoizes previously computed results and
 * lazily calculates new fibonacci numbers.
 *
 * @param {number} n The nth fibonacci number
 * @return {number} The value of the nth fibonacci number
 */
var stackFib = (function() {
  var fibs = [0, 1];

  return function stackFib(n) {
    var i;

    if (!fibs.hasOwnProperty(n)) {
      for (i = fibs.length; i <= n; i++) {
        fibs[i] = fibs[i - 1] + fibs[i - 2];
      }
    }

    return fibs[n];
  };
}());

/**
 * fibSum
 *
 * Returns the sum of all even fibonacci numbers whose value does not exceed `max`.
 *
 * @param {number} max The maximum value of any given fibonacci number.
 * @return {number} The sum of all fibonacci numbers whose value is between 0 and `max`.
 */
var evenFibSum = function fibSum(max) {
  var i;
  var current = 0;
  var total = 0;

  for (i = 2; current <= max; i += 1) {
    current = stackFib(i);

    if (current % 2 === 0) {
      total += current;
    }
  }

  return total;
};

//console.log(functionalEvenFibSum(4000000));
console.log(evenFibSum(4000000));
