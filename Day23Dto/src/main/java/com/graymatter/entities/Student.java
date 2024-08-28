package com.graymatter.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student {
	private String name;
	@Id
	private int id;
	public Student() {
		super();
	}
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	

}
