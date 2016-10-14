module.exports= function(grunt, constants){
	return {
		livereload: {
			options: {
				livereload: '<%= connect.livereload.options.livereload %>'
			},
			files: [
			  constants.app_folder + '/**'
			]
		},
		dev: {
			files:[constants.app_folder+ '/**'],
			tasks: ['clean:dev','copy:dev', 'wiredep','app_bower']
		}
	}
}
