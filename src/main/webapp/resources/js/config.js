var config= angular.module('crashlabConfig',[]);

config.constant('config',{
	'base_url': window.location.origin+window.location.pathname,
});
