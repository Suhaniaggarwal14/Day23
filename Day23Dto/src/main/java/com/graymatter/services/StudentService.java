package com.graymatter.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;
import com.graymatter.dto.StudentMapper;
import com.graymatter.dto.StudentDto;
import com.graymatter.entities.Student;
import com.graymatter.repository.StudentRepository;

@Service
//@Profile(value="dev")
public class StudentService {
	
	@Autowired
	StudentRepository repository;
	@Autowired
	StudentMapper mapper;
	
	public List<StudentDto> getaAllStudents(){
	List<Student> slist=repository.findAll();
	
	return repository.findAll().stream().map((s)->mapper.mapToStudentDto(s)).collect(Collectors.toList());

}
	public StudentDto addStudent(StudentDto studentDto) {
		return mapper.mapToStudentDto(repository.save(mapper.mapToStudent(studentDto)));
	}
}
