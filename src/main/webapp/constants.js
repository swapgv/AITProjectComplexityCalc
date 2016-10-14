module.exports= {
	app_folder: './app',
	app_js_folder: function(){ return this.app_folder + '/js'},
	app_js_module_folder:  function(){ return this.js_folder + '/modules'},
	tmp_folder: './.tmp',
	tasks_folder: './tasks',
	app_bower_file: 'app_bower.json',
	dist_folder: './dist',
	dist_js_folder: function(){return this.dist_folder + '/js'}
};