package com.devb.simpleapi.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public class StudentRequest {
	
	@NotEmpty(message = "Firstname should not be empty")
	@Min(value = 3, message = "MIN 3 Letters")
	@Max(value = 30, message = "MAX 3 0Letters")
	private String firstname;
	
	@Min(value = 3, message = "MIN 3 Letters")
	@Max(value = 30, message = "MAX 3 0Letters")
	@NotEmpty(message = "Lastname should not be empty")
	private String lastname;
	
	@Email(message = "Enter a valid email")
	private String email;
	
	@NotEmpty
	@Pattern(regexp = "^\\\\d{9}$")
	private String telefoneString;
	
	
	public String getTelefoneString() {
		return telefoneString;
	}
	public void setTelefoneString(String telefoneString) {
		this.telefoneString = telefoneString;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public StudentRequest(String firstname, String lastname, String email, String telefone) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.telefoneString = telefone;
	}
	
	public StudentRequest () {
		
	}

}
