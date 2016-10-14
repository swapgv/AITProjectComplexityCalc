module.exports= function(grunt, constants){
	return {
		options: {
	      instance: {
	        hostUrl : 'http://localhost:9000/sonar',
	        jdbcUrl : 'jdbc:mysql://localhost:3306/sonar',
	        jdbcUsername: 'sonar',
	        jdbcPassword: 'sonar',
	        language: 'js'
	      }
	    },
	    dist: {
	      project: {
	        key: 'crashlab-frontend',
	        name: 'Crashlab',
	        version: '1.0.0'
	      },
	      sources: [
			{
				path: 'app',
				coverageReport: 'coverage/**/lcov.info',
			}
          ]
	    }
	}
}