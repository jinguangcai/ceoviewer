var serviceModule = angular.module("serviceModule", ['ngResource']);

serviceModule.service("SaleService", ['$resource', '$q', function ($resource, $q) {
    var resource = $resource('', {}, {
        findSale: {
            method: 'GET',
            isArray: true,
            url: '/sales'
        }

    });

    return {
        findSale: function (house, offset) {
            var d = $q.defer();
            resource.findSale({
                                  house: house,
                                  offset: offset
                              }, function (result) {
                d.resolve(result);
            }, function (result) {
                d.reject(result);
            });
            return d.promise;
        }
    }
}]);

var saleModule = angular.module('sale', ['serviceModule']);

saleModule.controller("saleController", ['$scope', '$location', 'SaleService', controller]);

function controller($scope, $location, SaleService) {
    $scope.sales = [];

    $scope.query = function () {
        if (!$scope.house) {
            alert("请输入楼盘名称");
            return;
        }
        if (!$scope.offset) {
            alert("请输入查询最近几天的数据");
            return; 
        }
        
        SaleService.findSale($scope.house, $scope.offset)
            .then(function (result) {
                $scope.sales = result;
            })
        
    };



}












