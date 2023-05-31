package com.devb.simpleapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devb.simpleapi.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	public Optional<Student> findByEmail(String email);

}
