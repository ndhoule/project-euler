'use strict';

var R = require('ramda');
R.mixin(require('../../ramda-contrib'));

// Determines whether a number is a multiple of another number.
//
// isMultipleOf :: number -> boolean
module.exports = R.curry(function(x, y) {
  return y % x === 0;
});
