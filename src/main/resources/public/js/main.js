var app = angular.module("springDemo", []);

app.controller("AppCtrl", function ($scope, $http) {
    $scope.blogs = [];

    $http.get("/api/blogs").then(function (response) {
        $scope.blogs = response.data;
    }, function (error) {
        alert("Error");
    });

});