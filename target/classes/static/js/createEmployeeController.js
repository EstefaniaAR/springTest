
app.controller('createEmployee', ['$scope','$http','$location', function($scope,$http,$location) 
{
	var host =  $location.host();
	var endpointCreate = '/createEmployee';
	var endpointReadDepartment='/getDepartments';
	var contextPath = $location.absUrl().split("#")[0];
	
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
		$http.post(resource, data)
		.then(function successCallback(response) 
		{
			alert(JSON.stringify(response.xhrStatus));
			console.log(response);
		  }, function errorCallback(response) 
		  {
		    alert("Error:"+JSON.stringify(response.data));
		    console.log(response);
		  });
	};

}]);

