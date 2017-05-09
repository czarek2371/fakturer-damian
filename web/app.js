var app = angular.module('app', ['ngMaterial']);


app.controller("DemoController", function ($scope, $mdSidenav) {
    $scope.helloworld = 'Hello World';
    $scope.clickSide = function (dir) {
        $mdSidenav(dir).toggle();
    };
});
