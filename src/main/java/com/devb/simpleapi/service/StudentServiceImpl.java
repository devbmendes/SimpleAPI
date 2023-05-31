package com.devb.simpleapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.devb.simpleapi.controller.StudentController;
import com.devb.simpleapi.model.Student;
import com.devb.simpleapi.model.StudentRequest;
import com.devb.simpleapi.repository.StudentRepository;

public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public ResponseEntity<List<Student>> findAllStudent() {
		return ResponseEntity.ok(studentRepository.findAll());
	}

	@Override
	public ResponseEntity<Student> findByEmail(String email) {
		return ResponseEntity.ok(studentRepository.findByEmail(email).get());
	}

	@Override
	public void deletById(Integer id) {
		studentRepository.deleteById(id);

	}

	@Override
	public ResponseEntity<Student> save(StudentRequest studentRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Student> updateById(Integer id, StudentRequest studentRequest) {
		Student student = studentRepository.findById(id).get();
		if (student != null) {
			student.setId(id);
			student.setEmail(studentRequest.getEmail());
			student.setFirstname(studentRequest.getFirstname());
			student.setLastname(studentRequest.getLastname());
			student.setTelefone(studentRequest.getTelefoneString());

			return ResponseEntity.ok(studentRepository.save(student));
		}
		return null;

	}

	@Override
	public ResponseEntity<Student> findById(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Student> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
