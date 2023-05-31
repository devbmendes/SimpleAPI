package com.devb.simpleapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.devb.simpleapi.controller.StudentController;
import com.devb.simpleapi.model.Student;
import com.devb.simpleapi.model.StudentRequest;

public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentController studentController;

	@Override
	public ResponseEntity<List<Student>> findAllStudent() {
		return  ResponseEntity.ok(studentController.findAllStudent()).getBody();
	}

	@Override
	public ResponseEntity<Student> findByEmail(String email) {
		return ResponseEntity.ok(studentController.findByEmail(email)).getBody();
	}

	@Override
	public ResponseEntity<Student> updateByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ResponseEntity<Student> findById(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Student> save(StudentRequest studentRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
