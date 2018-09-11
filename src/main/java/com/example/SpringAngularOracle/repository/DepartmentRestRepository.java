package com.example.SpringAngularOracle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringAngularOracle.domain.Department;

@Repository
public interface DepartmentRestRepository extends JpaRepository<Department, Long> 
{

}
