package com.graymatter.dto;

public class StudentDto {
	private String name;
	private int id;
	public StudentDto() {
		super();
	}
	public StudentDto(String name, int id) {
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
		return "StudentDto [name=" + name + ", id=" + id + "]";
	}
	
	

}
