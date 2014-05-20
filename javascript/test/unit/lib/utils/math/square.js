'use strict';

var R = require('ramda');
R.mixin(rootRequire('lib/ramda-contrib'));
var square = rootRequire('lib/utils').math.square;

describe('utils.square', function() {
  /**
   * Tests
   */

  it('should return the square of a given input', function() {
    expect(square(1)).to.equal(1);
    expect(square(2)).to.equal(4);
    expect(square(4)).to.equal(16);
  });
});
