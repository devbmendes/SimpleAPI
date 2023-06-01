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
	public ResponseEntity<List<Student>> findAllStudent() {
		return new ResponseEntity<>(studentRepository.findAll(),HttpStatus.OK);
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
		Student student = new Student();
		student.setEmail(studentRequest.getEmail());
		student.setFirstname(studentRequest.getFirstname());
		student.setLastname(studentRequest.getLastname());
		student.setTelefone(studentRequest.getTelefone());
		return new ResponseEntity<>(studentRepository.save(student), HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<Student> updateById(Integer id, StudentRequest studentRequest) {
		Student student = studentRepository.findById(id).get();
		if (student != null) {
			student.setId(id);
			student.setEmail(studentRequest.getEmail());
			student.setFirstname(studentRequest.getFirstname());
			student.setLastname(studentRequest.getLastname());
			student.setTelefone(studentRequest.getTelefone());

			return ResponseEntity.ok(studentRepository.save(student));
		}
		return null;

	}

	@Override
	public Student findById(Integer id) {
		Optional<Student> student = studentRepository.findById(id);
	
		return  student.orElseThrow(()-> new ObjectNotFoundException("Object with ID :"+id+" not found"));
			
	}

}
