var crashlabControllers= angular.module('crashlabControllers',[]);

crashlabControllers.controller('HomeController',function($rootScope,$scope){
  $rootScope.menu="home";
});

crashlabControllers.controller('WidgetsController',function($rootScope,$scope){
  $rootScope.menu="widgets";
});

