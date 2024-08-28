package com.graymatter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graymatter.entities.Department;
import com.graymatter.entities.Employee;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {

}
