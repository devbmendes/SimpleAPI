package com.devb.simpleapi.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devb.simpleapi.model.Student;
import com.devb.simpleapi.model.StudentRequest;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
	
	
	@GetMapping("/all")
	public ResponseEntity<List<Student>> findAllStudent(){
		return null;
	}

	@GetMapping("/{email}")
	public ResponseEntity<Student> findByEmail(@PathVariable String email){
		return null;
	}
	
	public ResponseEntity<Student> save(@RequestBody StudentRequest studentRequest ){
		return null;
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Integer id) {
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<Student> update(@PathVariable("id") Integer id, @RequestBody StudentRequest st){
		return null;
	}
}
