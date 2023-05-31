package com.devb.simpleapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devb.simpleapi.model.Student;

@SpringBootApplication
public class SimpleApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SimpleApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student(null,"Balduino","Mendes","baldhuino@gmail.com","933018608");
		
	}

}
