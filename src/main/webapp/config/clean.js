module.exports=function(grunt, constants){
	return {
	  dev: [constants.tmp_folder+ '/**'],
	  dist: [constants.dist_folder+ '/**']
	}
}