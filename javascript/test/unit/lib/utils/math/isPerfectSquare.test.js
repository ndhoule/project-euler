'use strict';

var R = require('ramda');
R.mixin(rootRequire('lib/ramda-contrib'));
var isPerfectSquare = rootRequire('lib/utils').math.isPerfectSquare;

describe('utils.isPerfectSquare', function() {
  /**
   * Tests
   */

  it('should return true if the number is a perfect square', function() {
    expect(isPerfectSquare(1)).to.be.true;
    expect(isPerfectSquare(4)).to.be.true;
    expect(isPerfectSquare(9)).to.be.true;
    expect(isPerfectSquare(16)).to.be.true;
  });

  it('should return false if the number is not a perfect square', function() {
    expect(isPerfectSquare(2)).to.be.false;
    expect(isPerfectSquare(3)).to.be.false;
    expect(isPerfectSquare(5)).to.be.false;
    expect(isPerfectSquare(6)).to.be.false;
    expect(isPerfectSquare(76)).to.be.false;
    expect(isPerfectSquare(84)).to.be.false;
    expect(isPerfectSquare(1.5)).to.be.false;
    expect(isPerfectSquare(9.001)).to.be.false;
  });
});
