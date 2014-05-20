'use strict';

var R = require('ramda');
R.mixin(rootRequire('lib/ramda-contrib'));
var isNatural = rootRequire('lib/utils').math.isNatural;

describe('utils.isNatural', function() {
  /**
   * Tests
   */

  it('should return true for any natural number', function() {
    expect(isNatural(1)).to.be.true;
    expect(isNatural(3)).to.be.true;
    expect(isNatural(4)).to.be.true;
    expect(isNatural(100000)).to.be.true;
  });

  it('should return false for any non-natural number', function() {
    expect(isNatural(0)).to.be.false;
    expect(isNatural(9.1)).to.be.false;
    expect(isNatural(16.4)).to.be.false;
    expect(isNatural(-1)).to.be.false;
  });
});
