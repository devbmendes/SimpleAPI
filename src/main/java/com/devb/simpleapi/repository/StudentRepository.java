package com.devb.simpleapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devb.simpleapi.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
