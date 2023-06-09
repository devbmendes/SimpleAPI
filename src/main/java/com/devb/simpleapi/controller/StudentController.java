package com.devb.simpleapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devb.simpleapi.model.Student;
import com.devb.simpleapi.model.StudentRequest;
import com.devb.simpleapi.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/student")
@CrossOrigin("**")
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("/all")
	public ResponseEntity<List<Student>> findAllStudent() {
		return ResponseEntity.ok(studentService.findAllStudent());
	}

	@GetMapping
	public ResponseEntity<Student> findByEmail(@RequestParam(value = "email") String email) {
		return ResponseEntity.ok(studentService.findByEmail(email));
	}

	@GetMapping("/{id}")
	public ResponseEntity<Student> findById(@PathVariable Integer id) {
		Student student = studentService.findById(id);
		return ResponseEntity.ok(student);
	}

	@PostMapping
	public ResponseEntity<Student> save(@RequestBody @Valid StudentRequest studentRequest) {
		return ResponseEntity.ok( studentService.save(studentRequest));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteById(@PathVariable Integer id) {
		studentService.deletById(id);
		
		return ResponseEntity.noContent().build();
	}

	@PutMapping
	public ResponseEntity<Student> update(@RequestBody StudentRequest st) {
		return ResponseEntity.ok(studentService.updateStudent(st));
	}

}
