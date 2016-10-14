'use strict';

var constants= require('./constants.js');

module.exports= function(grunt){

	var configs = require('load-grunt-configs')(grunt, constants);
	grunt.initConfig(configs);

	require('load-grunt-tasks')(grunt);

	grunt.file.expand(constants.tasks_folder+'/**/*.js').forEach(function(path){
		require(path)(grunt,constants);
	});
}