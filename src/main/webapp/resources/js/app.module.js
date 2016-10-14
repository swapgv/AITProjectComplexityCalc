var crashlab = angular.module('crashlab', [ 'ngRoute', 'crashlabControllers',
    'crashlabConfig' ]);

crashlab.config(function($routeProvider, config) {
  $routeProvider.when('/', {
      templateUrl : config.base_url + '/partials/home.html',
      controller : 'HomeController',
      title : 'home'
  }).when('/formDemo', {
      templateUrl :  config.base_url + '/partials/formDemo.html',
      controller : 'formDemoCtrl',
      title : 'formDemo'
  }).when('/filterDemo', {
      templateUrl :  config.base_url + '/partials/filterDemo.html',
      controller : 'filterDemoCtrl',
      title : 'filterDemo'
  }).when('/tables', {
	templateUrl : config.base_url + '/partials/tables.html',
	controller : 'TablesController'
  }).when('/buttons', {
	templateUrl : config.base_url + '/partials/buttons.html',
	controller : 'ButtonsController'
  }).when('/typography', {
	templateUrl : config.base_url + '/partials/typography.html',
	controller : 'TypographyController'
  }).when('/forms', {
	templateUrl : config.base_url + '/partials/forms.html',
	controller : 'FormsController'
  }).when('/navigations', {
	templateUrl : config.base_url + '/partials/navigations.html',
	controller : 'NavigationsController'
  }).when('/tabDemo', {
      templateUrl :  config.base_url + '/partials/tabDemo.html',
      controller : 'tabDemoCtrl',
      title : 'tabDemo'
  }).when('/tableDemo', {
      templateUrl :  config.base_url + '/partials/tableDemo.html',
      title : 'tableDemo'
  }).when('/widgets', {
      templateUrl : config.base_url + '/partials/widgets.html',
      controller : 'WidgetsController',
      title : 'widgets'
  }).otherwise({
      redirectTo : '/'
  });
});

crashlab.run(function($rootScope) {
  $rootScope.$on('$routeChangeStart', function(event, next) {

  });
});