package com.devb.simpleapi.service;

import java.util.List;

import com.devb.simpleapi.model.Student;
import com.devb.simpleapi.model.StudentRequest;

public interface StudentService {

	public List<Student> findAllStudent();

	public Student findById(Integer id);

	public Student updateStudent(StudentRequest studentRequest);

	public void deletById(Integer id);

	public Student findByEmail(String email);

	public Student save(StudentRequest studentRequest);

}
