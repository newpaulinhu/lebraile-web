var app = angular.module('app', ['ngRoute','ngResource','ngSanitize', 'ui.mask']);
app.config(function($routeProvider){
    $routeProvider
        .when('/acao',{
            templateUrl: '/lebraile-web/views/acao.html',
            controller: 'TradutoraController'
        })
        .when('/',{ templateUrl: 'home.html'}
        );
});

app.constant('SERVER', {
	url: document.location.origin,
});