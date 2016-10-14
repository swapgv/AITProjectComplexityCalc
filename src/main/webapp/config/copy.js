module.exports= function(grunt, constants){
	return {
	  dev: {
		    files: [
		      // makes all src relative to cwd
		      {expand: true, cwd: constants.app_folder, src: ['**'], dest: constants.tmp_folder},
		    ],
	  },
	  dist: {
		    files: [
		      // makes all src relative to cwd
		      {expand: true, cwd: constants.app_folder, src: ['**'], dest: constants.dist_folder},
		    ],
	  },
	}
}