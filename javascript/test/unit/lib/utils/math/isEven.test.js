'use strict';

var R = require('ramda');
R.mixin(rootRequire('lib/ramda-contrib'));
var isEven = rootRequire('lib/utils').math.isEven;

describe('utils.isEven', function() {
  /**
   * Setup
   */

  var odds, evens;

  before(function() {
    odds = R.filter(function(num) {
      return num % 2 !== 0;
    }, R.range(2, 101));

    evens = R.filter(function(num) {
      return num % 2 === 0;
    }, R.range(2, 101));
  });

  /**
   * Tests
   */

  it('should return true for any even number', function() {
    R.each(function(even) {
      expect(isEven(even)).to.be.true;
    }, evens);
  });

  it('should return false for any odd number', function() {
    R.each(function(odd) {
      expect(isEven(odd)).to.be.false;
    }, odds);
  });
});
