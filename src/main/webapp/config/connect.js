module.exports= function(grunt,constants){
	return {
		livereload: {
			options:{
				port: 9200,
				hostname: 'localhost',
				open: true,
				livereload:9999,
				middleware: function(connect){
					return [
					        connect.static('.'),
					        connect.static(constants.tmp_folder),
			        ];
				}
			}
	    },
	    server:{
	    	options:{
				port: 9300,
				hostname: 'localhost',
				open: false,
				keepalive:true,
				middleware: [
		             function myMiddleware(req, res, next) {
		            	 if(req.url==='/login') res.end('login. method='+req.method);
		            	 if(req.url==='/hello') res.end('hello');
		            	 if(req.url==='/json') res.end(JSON.stringify({'p1':'p1'}));
		             }
		        ],
			}
	    }
	}
}
