'use strict';

var isPerfectSquare = require('./isPerfectSquare');

/**
 * Determines whether or not a number is a fibonacci number. (A number is a
 * fibonacci number if either `5 * n * n + 4` or `5 * n * n + 4` is a perfect
 * square.)
 *
 * @param {number} n The number to verify.
 * @return {boolean} Whether or not the number is a fibonacci number.
 */
module.exports = function isFib(n) {
  return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
};
