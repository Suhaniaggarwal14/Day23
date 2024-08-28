package com.graymatter.services;

import java.util.List;

import com.graymatter.entities.Employee;

public interface EmployeeServiceInterface {
	
	public List<Employee> getAllEmployees();
	public Employee addEmployee(Employee employee);
	public List<Employee> getAllEmployeesByCity(String city);
	public Employee getEmployeeById(int id);
	

}
