(function() {

  'use strict';

  angular.module('crashlab').controller('menuCtrl', menuCtrl);

  menuCtrl.$inject = [ '$scope', '$route'];

  function menuCtrl($scope, $route) {

    $scope.isRoute = isRoute;
    $scope.help_click = helpClick;

    function isRoute(r) {
      if (!$route.current.title === 'undefined') {
        return $route.current.title.substr(0, r.length) === r;
      }
    }

    function helpClick() {
      BootstrapDialog.show({
        title : 'More dialog sizes',
        message : 'Hi Apple!',
        buttons : [ {
          label : 'Normal',
          action : function(dialog) {
            dialog.setTitle('Normal');
            dialog.setSize(BootstrapDialog.SIZE_NORMAL);
          }
        }, {
          label : 'Small',
          action : function(dialog) {
            dialog.setTitle('Small');
            dialog.setSize(BootstrapDialog.SIZE_SMALL);
          }
        }, {
          label : 'Wide',
          action : function(dialog) {
            dialog.setTitle('Wide');
            dialog.setSize(BootstrapDialog.SIZE_WIDE);
          }
        }, {
          label : 'Large',
          action : function(dialog) {
            dialog.setTitle('Large');
            dialog.setSize(BootstrapDialog.SIZE_LARGE);
          }
        } ]
      });
    }

  }

})();
