package com.devb.simpleapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devb.simpleapi.model.Student;
import com.devb.simpleapi.model.StudentRequest;
import com.devb.simpleapi.repository.StudentRepository;
import com.devb.simpleapi.service.exceptions.ObjectNotFoundException;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> findAllStudent() {
		return studentRepository.findAll();
	}

	@Override
	public Student findByEmail(String email) {
		Optional<Student> student = studentRepository.findByEmail(email);
		return student.orElseThrow(()-> 
		new ObjectNotFoundException("Object with EMAIL : "+email+" not found"));
	}

	@Override
	public void deletById(Integer id) {
		studentRepository.deleteById(id);

	}

	@Override
	public Student save(StudentRequest studentRequest) {
		Optional<Student> st = studentRepository.findByEmail(studentRequest.getEmail());
		if(st!= null) {
			throw new RuntimeException("Email already exists");
		}
		Student student = new Student();
		student.setEmail(studentRequest.getEmail());
		student.setFirstname(studentRequest.getFirstname());
		student.setLastname(studentRequest.getLastname());
		student.setTelefone(studentRequest.getTelefone());
		return studentRepository.save(student);
	}

	@Override
	public Student updateById(Integer id, StudentRequest studentRequest) {
		Student student = this.findById(id);
			student.setId(id);
			student.setEmail(studentRequest.getEmail());
			student.setFirstname(studentRequest.getFirstname());
			student.setLastname(studentRequest.getLastname());
			student.setTelefone(studentRequest.getTelefone());

			return studentRepository.save(student);
		
	}

	@Override
	public Student findById(Integer id) {
		Optional<Student> student = studentRepository.findById(id);

		return student.orElseThrow(() -> new ObjectNotFoundException("Object with ID :" + id + " not found"));

	}

}
