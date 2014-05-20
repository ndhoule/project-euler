(function(root) {
  'use strict';

  var R = root.R || require('ramda');


  /**
   * Utility functions
   */

  R.identity = function identity(val) {
    return val;
  };

  R.existy = function existy(val) {
    return val !== null && val !== undefined;
  };

  R.truthy = function truthy(val) {
    return val !== false && existy(val);
  };

  R.falsy = function falsy(val) {
    return !R.truthy(val);
  };


  /**
   * Math
   */

  R.mod = R.curry(function mod(x, y) {
    return x % y;
  });


  /**
   * Lists
   */

  R.last = function last(array) {
    return array[array.length - 1];
  };

  R.compact = function compact(array) {
    return R.reject(R.identity, array);
  };

  R.isEmpty = function isEmpty(array) {
    return array.length === 0;
  };

  /**
   * Comparators
   */

  R.tern = R.curry(function tern(cond, x, y) {
    return cond ? x : y;
  });


  /**
   * Functions
   */

  R.fork = R.curry(function fork(then, f, g, x) {
    return then(f(x), g(x));
  });

  return R;
}(this));
