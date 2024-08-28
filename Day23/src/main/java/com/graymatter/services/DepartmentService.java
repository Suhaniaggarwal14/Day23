package com.graymatter.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.dao.DepartmentDao;
import com.graymatter.entities.Department;
@Service
public class DepartmentService implements DepartmentInterface{
	@Autowired
	
	DepartmentDao dao;

	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		return dao.getAllDepartments();
	}

	@Override
	public Department addDepartment(Department department) {
		// TODO Auto-generated method stub
		return dao.addDepartment(department);
	}

	
	
	
	
	

}
