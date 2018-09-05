package com.example.SpringAngularOracle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringAngularOracle.domain.Employee;

@Repository
public interface EmployeeRestRepository extends JpaRepository<Employee,Long>
{
	public Employee findById(long id);

}
