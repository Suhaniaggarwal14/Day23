package com.graymatter.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity

@Table(name="project23Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empid;
	private String empName;
	private double empSal;
	private String city;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="deptartmentId" ,referencedColumnName="deptId")
	//@JsonBackReference
	private Department department;
	public Employee() {
		super();
	}
	public Employee(int empid, String empName, double empSal, String city, Department department) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empSal = empSal;
		this.city = city;
		this.department = department;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empSal=" + empSal + ", city=" + city
				+ ", department=" + department + "]";
	}
	

}
