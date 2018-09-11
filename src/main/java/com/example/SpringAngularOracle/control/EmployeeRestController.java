package com.example.SpringAngularOracle.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringAngularOracle.domain.Employee;
import com.example.SpringAngularOracle.repository.EmployeeRestRepository;

@RestController
public class EmployeeRestController 
{
	@Autowired
	private EmployeeRestRepository repo;
	
	@GetMapping("/getEmployee/{id}")
	public Employee getEmployee(@PathVariable("id") long id)
	{
		return repo.findById(id);
	}
	
	@GetMapping("/getEmployees")
	public List<Employee> getEmployees()
	{
		return repo.findAll();
	}
	
	@PostMapping(path="/createEmployee" , produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> setEmployee(@RequestBody Employee emp )
	{
		repo.save(emp);
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("/updateEmployee")
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
	
	@DeleteMapping("/deleteEmployee/{id}")
	public ResponseEntity<Object> deleteEmployee(@PathVariable("id") long id)
	{
		if(repo.existsById(id))
		{
			repo.deleteById(id);
			return ResponseEntity.noContent().build();
		}
		else
		{
			return ResponseEntity.notFound().build();
		}
	}
	

}
