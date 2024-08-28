package com.graymatter.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.dao.EmployeeDao;
import com.graymatter.entities.Employee;
import com.graymatter.exception.ResourceNotFoundException;

@Service
public class EmployeeService implements EmployeeServiceInterface {
	@Autowired
	EmployeeDao dao;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return dao.addEmployee(employee);
	}

	public List<Employee> getAllEmployeesByCity(String city) {
		// TODO Auto-generated method stub
		return dao.getAllEmployeeByCity(city);
	}

	public Employee getEmployeesById(int id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return dao.getEmployeeById(id);
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> getAllEmployeesByDepartmentId(int id) {
		// TODO Auto-generated method stub
		return dao.getAllEmployeesByDepartmentId(id);
	}
	
	
	
	

}
