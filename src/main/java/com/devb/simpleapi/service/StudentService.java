package com.devb.simpleapi.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.devb.simpleapi.model.Student;

public interface StudentService {
	
	public ResponseEntity<List<Student>> findAllStudent();
	
	public ResponseEntity<Student> findById(Integer id);
	
	public ResponseEntity<Student> updateByEmai(String email);
	
	public void deletById(Integer id);
}
