var app = angular.module('app', ['ngRoute']);

app.controller('MainController', ['$scope','$http', function($scope,$http) 
{
	$scope.urlJava="img/java.png";
	$scope.urlAngular="img/angular.png";
	$scope.urlSpring = "img/spring.png";
	
	$scope.urlHeader ='template/header.html'; 
	$scope.urlSideBar ='template/sideBar.html';
	$scope.urlContent ='template/content.html';
	$scope.urlNavBar ='template/navBar.html';
	
	
	$scope.openNav = function()
	{
		document.getElementById("mySidenav").style.width = "250px";
	};
	$scope.closeNav=function()
	{
		document.getElementById("mySidenav").style.width = "0";
	};
	
	$scope.getNav=function()
	{
		$(".button-collapse").sideNav();
		// SideNav Scrollbar Initialization
		var sideNavScrollbar = document.querySelector('.custom-scrollbar');
		Ps.initialize(sideNavScrollbar);
	}
	$scope.openDrop=function()
	{
		alert("working");
		 document.getElementById("hide-menu").classList.toggle("show");
		 
	};
}]);
app.config(function($routeProvider) 
{
    $routeProvider
    .when("/", 
    {
        templateUrl : "index.html"
    })
    .when("/create_employee", 
    {
        templateUrl : "enterprise/create_employee.html"
    })
    .when("/delete_employee", 
    {
        templateUrl : "enterprise/delete_employee.html"
    })
    .when("/read_employee", 
    {
        templateUrl : "enterprise/read_employee.html"
    })
    .when("/update_employee", 
    {
        templateUrl : "enterprise/update_employee.html"
    })
    ;
});




	