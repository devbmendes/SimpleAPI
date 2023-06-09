package com.devb.simpleapi.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class StudentRequest {

	private Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@NotEmpty(message = "Firstname should not be empty")
	@NotBlank
	@NotNull
	private String firstname;

	@NotEmpty(message = "Lastname should not be empty")
	@NotBlank
	private String lastname;

	@Email(message = "Enter a valid email")
	private String email;

	@NotEmpty
	@Pattern(regexp = "^\\d{9}$",message = "Enter a valid phone number")
	private String telefone;

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefoneString) {
		this.telefone = telefoneString;
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
		this.telefone = telefone;
	}

	public StudentRequest() {

	}

}
