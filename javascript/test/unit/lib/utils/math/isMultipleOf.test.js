'use strict';

var R = require('ramda');
R.mixin(rootRequire('lib/ramda-contrib'));
var isMultipleOf = rootRequire('lib/utils').math.isMultipleOf;

describe('utils.isMultipleOf', function() {
  /**
   * Tests
   */

  it('should return true when the first argument is a multiple of the second', function() {
    expect(isMultipleOf(1)(1)).to.be.true;
    expect(isMultipleOf(2)(4)).to.be.true;
    expect(isMultipleOf(5)(25)).to.be.true;
    expect(isMultipleOf(4)(16)).to.be.true;
  });

  it('should return false when the first argument is not a multiple of the second', function() {
    expect(isMultipleOf(0)(1)).to.be.false;
    expect(isMultipleOf(7)(4)).to.be.false;
    expect(isMultipleOf(2)(25)).to.be.false;
    expect(isMultipleOf(3)(16)).to.be.false;
  });
});
