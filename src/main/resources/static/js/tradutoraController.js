var app = angular.module('app');

app.factory('Tradutora', function (SERVER, $http) {
	return {
		traduzir: function(letra) {
			return $http.get('/lebraile-web/tradutora/letra?letra='+letra) ;
		}
	}
});

app.controller('TradutoraController', function ($scope, $sce, $compile, $interval, Tradutora) {
	$scope.palavraAnterior = '';
	$scope.letrasTraduzidas = [];

	//método que realiza a chamada para a tradutora e coloca na lista das letras traduzidas percorrida na 
	//tela para montar o painel de letras em braille
	$scope.traduzir = function(palavra) {
		Tradutora.traduzir(palavra[palavra.length-1]).success(function(data){
			$scope.letrasTraduzidas.push(data);
		});
	};
});
