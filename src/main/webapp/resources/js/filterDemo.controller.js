(function() {

  'use strict';

  angular.module('crashlab').controller('filterDemoCtrl', filterDemoCtrl);

  filterDemoCtrl.$inject = [ '$scope' ];

  function filterDemoCtrl($scope) {

    $scope.sizeFilterCriteria = {
       XL: true,
       L: true,
       S: true,
       XS: true
    }

    $scope.results = [{title: 'Child Restraint', desc: 'Super Comfortable Child Restraint Unit', size: 'XL'},
                      {title: 'Seat Belt Clips', desc: 'Set of easy to fit seat belt clips for extra protection', size: 'L'},
                      {title: 'Restraint Car Bolt', desc: 'Bolt to connect child car seat to car', size: 'S'},
                      {title: 'Child Restraint', desc: 'Super Comfortable Child Restraint Unit', size: 'S'},
                      {title: 'Child Restraint', desc: 'Super Comfortable Child Restraint Unit', size: 'XS'}];

  }

})();
