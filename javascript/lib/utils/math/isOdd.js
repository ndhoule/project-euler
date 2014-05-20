'use strict';

var R = require('ramda');
R.mixin(require('../../ramda-contrib'));
var isEven = require('./isEven');

// Determines whether or not a number is odd.
//
// isOdd :: number -> boolean
module.exports = R.compose(R.not, isEven);
