'use strict';

var R = require('ramda');
R.mixin(require('../../ramda-contrib'));
var isNatural = require('./isNatural');

module.exports = function isPrime(n) {
  // If `n` is:
  // - Not a number
  // - Is not finite
  // - Not a natural number
  // - Is less than 2 (cannot be prime)
  if (isNaN(n) || !isFinite(n) || !isNatural(n) || n < 2) {
    return false;
  }

  var possibleFactors = R.filter(
    function(num) {
    return num === 2 || num === 3 || num === 5 || num === 7 || num % 2 !== 0;
    },
    // Generate a range of numbers <= sqrt(n)
    R.range(2, Math.floor(Math.sqrt(n)) + 1)
  );

  // TODO: Can I remove the null check here?
  return R.isEmpty(possibleFactors) || R.all(function(num) {
    return n % num !== 0;
  }, possibleFactors);
};

