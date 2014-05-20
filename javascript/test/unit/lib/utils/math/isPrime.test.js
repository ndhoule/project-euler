'use strict';

var R = require('ramda');
R.mixin(rootRequire('lib/ramda-contrib'));
var isPrime = rootRequire('lib/utils').math.isPrime;

describe('utils.isPrime', function() {
  /**
   * Setup
   */

  var primes, notPrimes;

  before(function() {
    primes = rootRequire('lib/data/1000primes.json');
    notPrimes = R.difference(R.range(0, R.last(primes)), primes);
  });

  /**
   * Tests
   */

  // TODO: Profile against iterative version

  it('should return true for any prime number', function() {
    R.each(function(prime) {
      expect(isPrime(prime)).to.be.true;
    }, primes);
  });

  it('should return false for any non-prime number', function() {

    R.each(function(notPrime) {
      expect(isPrime(notPrime)).to.be.false;
    }, notPrimes);
  });
});
