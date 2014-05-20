'use strict';

// Determines whether or not a number is a natural number. A natural number is
// any positive integer (here excluding 0, though some definitions include it).
//
// isOdd :: number -> boolean
module.exports = function isNatural(n) {
  return n > 0 && n % 1 === 0;
};
