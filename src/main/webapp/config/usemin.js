module.exports= function(grunt,constants){
	return {
		html: constants.dist_folder+'/**/*.html',
		options: {
		  assetsDirs: [constants.dist_folder]
		}
	}
}