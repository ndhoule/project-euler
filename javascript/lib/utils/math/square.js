'use strict';

var R = require('ramda');
R.mixin(require('../../ramda-contrib'));

// Squares a number.
//
// square :: number -> number
module.exports = R.flip(Math.pow)(2);
