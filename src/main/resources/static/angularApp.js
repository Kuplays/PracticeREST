angular.module('angular-app', []).
controller('data-handler', function($scope, $http) {
    $http.get('http://localhost:9999/all').
      then(function(response) {
          $scope.data = response.data;
      });
});