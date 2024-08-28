package com.graymatter.entities;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="project23Department")
public class Department {
	private String deptName;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int deptId;
	@OneToMany(mappedBy="department",cascade=CascadeType.ALL ,orphanRemoval=true)
	//@JsonIgnore
	private List<Employee> empList=new ArrayList<Employee>();
	public Department() {
		super();
	}
	public Department(String deptName, int deptId, List<Employee> empList) {
		super();
		this.deptName = deptName;
		this.deptId = deptId;
		this.empList = empList;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", deptId=" + deptId + ", empList=" + empList + "]";
	}
	
	

}
