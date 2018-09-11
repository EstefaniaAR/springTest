package com.example.SpringAngularOracle.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringAngularOracle.domain.Department;
import com.example.SpringAngularOracle.repository.DepartmentRestRepository;

@RestController
public class DepartmentRestController 
{
	@Autowired
	private DepartmentRestRepository repo;
	
	@GetMapping("/getDepartments")
	public List<Department> getDepartments()
	{
		return repo.findAll();
	}

}
