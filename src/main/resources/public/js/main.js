var app = angular.module("springDemo", []);

app.controller("AppCtrl", function ($scope, $http) {
    $scope.blogs = [];
    $scope.page = 0;

    $http.get("/api/blogs?page="+$scope.page).then(function (response) {
        $scope.blogs = response.data.content;
    });

});