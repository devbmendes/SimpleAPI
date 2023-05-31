package com.devb.simpleapi.model;

public class StudentRequest {
	
	private String firstname;
	private String lastname;
	private String email;
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
