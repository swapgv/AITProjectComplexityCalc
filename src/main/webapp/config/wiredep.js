module.exports= function(grunt,constants){
	return {

	  dev: {
	    src: [
	      constants.tmp_folder + '/**/*.html'
	    ],
	    exclude: [ /bootstrap\/dist\/css\/bootstrap.css/ ],
        ignorePath: /(\.\.\/){1,2}/
	  },
	  dist: {
		    src: [
			      constants.dist_folder + '/**/*.html'
			    ],
		    exclude: [ /bootstrap\/dist\/css\/bootstrap.css/ ],
	        ignorePath: /(\.\.\/){1,2}/
	  },
	}
}