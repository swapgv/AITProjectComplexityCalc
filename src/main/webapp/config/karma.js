module.exports= function(grunt,constants){
	return {
		options: {
			files: [
		        'node_modules/angular/angular.js',
		        'node_modules/angular-mocks/angular-mocks.js',
		        'node_modules/angular-route/angular-route.js',
		        'app/**/*.js',
		        'test/**/*Spec.js'
		      ],
			runnerPort: 9999,
			browsers: ['Chrome'],
			logLevel: 'INFO',
			frameworks: ['jasmine'],
			coverageReporter: {
				  type : 'lcov',
				  dir : 'coverage/',
				  file : 'lcov.info'
			},
			reporters: ['progress', 'coverage'],
			preprocessors: {
		    	'app/**/*.js': ['coverage']
		    }
		},
		dev: {
			singleRun: false,
			autoWatch: true
		},
		dist: {
			singleRun: true
		}
	}
}