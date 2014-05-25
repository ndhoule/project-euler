'use strict';

var R = require('ramda');
R.mixin(rootRequire('lib/ramda-contrib'));
var isFib = rootRequire('lib/utils/math/isFib');

describe('utils.isFib', function() {
  var fibs, nonFibs;

  before(function() {
    fibs = [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765];
    nonFibs = R.difference(R.range(0, R.last(fibs)), fibs);
  });

  /**
   * Tests
   */

  it('should return true if the number is a fibonacci number', function() {
    R.each(function(fib) {
      expect(isFib(fib)).to.be.true;
    }, fibs);
  });

  it('should return false if the number is not a fibonacci number', function() {
    R.each(function(nonFib) {
      expect(isFib(nonFib)).to.be.false;
    }, nonFibs);
  });
});
