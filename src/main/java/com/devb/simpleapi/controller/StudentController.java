package com.devb.simpleapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devb.simpleapi.exception.StudentNotFoundException;
import com.devb.simpleapi.model.Student;
import com.devb.simpleapi.model.StudentRequest;
import com.devb.simpleapi.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	
	@GetMapping("/all")
	public ResponseEntity<List<Student>> findAllStudent(){
		return studentService.findAllStudent();
	}

	@GetMapping
	public ResponseEntity<Student> findByEmail(@RequestParam(value = "email") String email){
		return studentService.findByEmail(email);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> findById(@PathVariable Integer id) throws StudentNotFoundException{
		return studentService.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<Student> save(@RequestBody @Valid StudentRequest studentRequest ){
		return studentService.save(studentRequest);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Integer id) {
		studentService.deletById(id);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Student> update(@PathVariable("id") Integer id, @RequestBody StudentRequest st){
		return studentService.updateById(id, st);
	}
	
}
