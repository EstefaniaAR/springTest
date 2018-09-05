package com.example.SpringAngularOracle.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringAngularOracle.domain.Employee;
import com.example.SpringAngularOracle.repository.EmployeeRestRepository;

@RestController
public class EmployeeRestController 
{
	@Autowired
	private EmployeeRestRepository repo;
	
	@GetMapping("/getEmployee")
	public void getEmployee(@RequestParam("id") long id)
	{
		repo.findById(id);
	}
	
	@PostMapping("/setEmployee")
	public void setEmployee(@RequestBody Employee emp )
	{
		repo.save(emp);
	}
	
	@PostMapping("/updateEmployee")
	public ResponseEntity<Object> modifyEmployee(@RequestBody Employee emp)
	{
		if(repo.existsById(emp.getId()))
		{
			repo.save(emp);
			return ResponseEntity.noContent().build();
		}
		else
		{
			return ResponseEntity.notFound().build();
		}
			
	}
	
	@PutMapping("/deleteEmployee")
	public void deleteEmployee(@RequestParam("id") long id)
	{
		repo.deleteById(id);
	}
	

}
