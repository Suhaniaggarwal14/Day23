package com.graymatter.services;

import java.util.List;

import com.graymatter.entities.Department;

public interface DepartmentInterface {
	
	public List<Department> getAllDepartments();
	public Department addDepartment(Department department);
	

}
