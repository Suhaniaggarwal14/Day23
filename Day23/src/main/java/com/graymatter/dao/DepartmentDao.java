package com.graymatter.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.graymatter.entities.Department;
import com.graymatter.entities.Employee;
import com.graymatter.repositories.DepartmentRepository;
import com.graymatter.repositories.EmployeeRepository;
@Repository
public class DepartmentDao {
	@Autowired
	DepartmentRepository repository;
	public List<Department> getAllDepartments(){
		return repository.findAll();
		
		
	}
	public Department addDepartment(Department departmnent) {
		return repository.save(departmnent);
	}
	
	
	}

