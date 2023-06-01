package com.devb.simpleapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devb.simpleapi.model.Student;
import com.devb.simpleapi.repository.StudentRepository;
import com.devb.simpleapi.service.StudentService;

@SpringBootApplication
public class SimpleApiApplication implements CommandLineRunner {

	@Autowired
	StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(SimpleApiApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student(null, "Balduino", "Mendes", "baldhuino@gmail.com", "933018608");
		Student student2 = new Student(null, "Helton", "Soares", "helton@gmail.com", "934982608");
		studentRepository.save(student1);
		studentRepository.save(student2);
	}

}
