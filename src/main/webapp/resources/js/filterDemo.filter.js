(function() {

  'use strict';

  angular.module('crashlab').filter('sizeFilter', sizeFilter);

  function sizeFilter() {

    return resultFilter;

    function resultFilter(results, filterCriteria) {
        var filteredList = [];
        for (var i = 0; i < results.length; i ++) {
          for (var prop in filterCriteria) {
            if (filterCriteria[prop]) {
              if (results[i].size === prop) {
                filteredList.push(results[i]);
                break;
              }
            }
          }
        }
        return filteredList;
      }
  };

})();
