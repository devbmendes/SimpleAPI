package com.devb.simpleapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devb.simpleapi.model.Student;
import com.devb.simpleapi.model.StudentRequest;
import com.devb.simpleapi.repository.StudentRepository;
import com.devb.simpleapi.service.exceptions.DataIntegratyViolationException;
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
		return student.orElseThrow(() -> new ObjectNotFoundException("Object with EMAIL : " + email + " not found"));
	}

	@Override
	public void deletById(Integer id) {
		findById(id);
		studentRepository.deleteById(id);

	}

	public Student checkEmail(StudentRequest studentRequest) {
		Optional<Student> st = studentRepository.findByEmail(studentRequest.getEmail());
		if (st.isPresent() && !st.get().getId().equals(studentRequest.getId())) {
			throw new DataIntegratyViolationException("Email already exists in DB");
		}
		return st.get();
	}

	@Override
	public Student save(StudentRequest studentRequest) {
		Optional<Student> st = studentRepository.findByEmail(studentRequest.getEmail());
		if (st.isPresent()) {
			throw new DataIntegratyViolationException("Email already exists in DB");
		}

		Student student = new Student();
		student.setEmail(studentRequest.getEmail());
		student.setFirstname(studentRequest.getFirstname());
		student.setLastname(studentRequest.getLastname());
		student.setTelefone(studentRequest.getTelefone());
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(StudentRequest studentRequest) {
		Student student = new Student();
		checkEmail(studentRequest);
		student.setId(studentRequest.getId());
		student.setId(studentRequest.getId());
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
