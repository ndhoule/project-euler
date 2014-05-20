'use strict';

var path = require('path');

var chai = global.chai = require('chai');
global.expect = chai.expect;
global.sinon = require('sinon');

// Chai plugins
chai.use(require('sinon-chai'));

global.rootRequire = function(dest) {
  return require(path.join('../..', dest));
};
