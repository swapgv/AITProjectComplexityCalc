module.exports= function(grunt,constants){
	return {
		html: constants.dist_folder+ '/**/*.html',
	    options: {
	    	root: '.',
	    	dest: constants.dist_folder
	    }
	}
}