module.exports= function(grunt, constants){
	grunt.registerTask('serve',
			['auto_install','clean:dev','copy:dev',
			 'wiredep:dev','app_bower:dev',
			 'connect:livereload','watch']);

	grunt.registerTask('app_bower','',function(target){
		var src_base= constants.tmp_folder;
		if (target==='dev'){
			src_base=constants.tmp_folder;
		} else if (target === 'dist'){
			src_base= constants.dist_folder;
		}
		require('wiredep')({
			src: src_base + "/**/*.html",
			bowerJson: require('../'+constants.app_bower_file),
			includeSelf: true,
			ignorePath: /(\.\.\/){1,2}app\//,
			fileTypes: {
				html: {
			      block: /(([ \t]*)<!--\s*app_bower:*(\S*)\s*-->)(\n|\r|.)*?(<!--\s*endbower\s*-->)/gi,
			    },
			}
		});
	});
}