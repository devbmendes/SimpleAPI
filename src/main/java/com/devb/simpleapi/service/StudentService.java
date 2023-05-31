package com.devb.simpleapi.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.devb.simpleapi.model.Student;
import com.devb.simpleapi.model.StudentRequest;

public interface StudentService {
	
	public ResponseEntity<List<Student>> findAllStudent();
	
	public ResponseEntity<Student> findById(Integer id);
	
	public ResponseEntity<Student> updateById(Integer id, StudentRequest studentRequest);
	
	public void deletById(Integer id);

	public ResponseEntity<Student> findByEmail(String email);
	
	public ResponseEntity<Student> save(StudentRequest studentRequest);

	
}
