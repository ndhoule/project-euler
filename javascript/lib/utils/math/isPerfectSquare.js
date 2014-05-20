'use strict';

var R = require('ramda');
R.mixin(require('../../ramda-contrib'));
var square = require('./square');

// Determines whether or not a number is a perfect square.
//
// isPerfectSquare :: number -> boolean
module.exports = function isPerfectSquare(number) {
  return R.compose(R.eq(number), square, Math.floor, Math.sqrt)(number);
};
