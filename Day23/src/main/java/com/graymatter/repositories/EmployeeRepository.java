package com.graymatter.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.graymatter.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	
	public List<Employee> findByCity(String city);
	
	//@Query(value="select * from project23employee e where e.dept_id=?",nativeQuery=true)
     public List<Employee> findByDepartmentDeptId(int id);
	
	//@Query(value="select * from project23employee e where emp_name like ?%",nativeQuery=true);
	//public List<Employee> findAllEmployeesStartWith(@Param("Letter")String letter);
	//@Query("select e from Employee e where epName like :?1%")
   //public List<Employee> findAllEmployeesStartWith(@Param("Letter")String letter);
 	
}
