
app.controller('createEmployee', ['$scope','$http','$location', function($scope,$http,$location) 
{
	var host =  $location.host();
	var endpointCreate = '/createEmployee';
	var endpointReadDepartment='/getDepartments';
	var contextPath = $location.absUrl().split("#")[0];
	var endpointRead = '/getEmployees';
	var endpointReadById = '/getEmployee/';
	
	$scope.readDepartments = function()
	{
		var resource = contextPath + endpointReadDepartment;
		$http.get(resource)
			.then(function successCallback(response) 
			{
			    $scope.departments = response.data;
			  }, function errorCallback(response) 
			  {
			    alert("Error:"+JSON.stringify(response.data));
			    console.log(response);
			  });
	};
	
	$scope.createEmployee= function()
	{

		var resource = contextPath + endpointCreate;
		data = $scope.employee;
		console.log(data);
		$scope.employee.department = $scope.department; 
		$http.post(resource, data)
		.then(function successCallback(response) 
		{
			alert("Employee successfully Created");
			console.log(response);
		  }, function errorCallback(response) 
		  {
		    alert("Error:"+JSON.stringify(response.data));
		    console.log(response);
		  });
	};
	
	$scope.readEmployees = function()
	{
		var resource = contextPath + endpointRead;
		$http.get(resource)
			.then(function successCallback(response) 
			{
			    $scope.employees = response.data;
			  }, function errorCallback(response) 
			  {
			    alert("Error:"+JSON.stringify(response.data));
			    console.log(response);
			  });
	};
	
	$scope.readEmployee = function()
	{
		var resource = contextPath + endpointReadById+ +$scope.id;

		$http.get(resource)
			.then(function successCallback(response) 
			{
			    $scope.employee = response.data;
			    $scope.found = true;
			  }, function errorCallback(response) 
			  {
			    alert("Error:"+JSON.stringify(response.data));
			    console.log(response);
			  });
	};

}]);

