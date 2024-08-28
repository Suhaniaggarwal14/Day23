package com.graymatter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.graymatter.dto.StudentDto;
import com.graymatter.entities.Student;
import com.graymatter.services.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService services;
	
	@GetMapping("/dto")
	public List<StudentDto> getAllStudents(){
		return services.getaAllStudents();
	}
	@PostMapping("/dto")
	public StudentDto addStudent(@RequestBody StudentDto studentDto) {
		return studentDto;
		

}}
