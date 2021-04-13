package com.fv.studenttracker.app;

public class Student {

	// Fields
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	
	// Constructor
	public Student(int id, String firstName, String lastName, String email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	// Getters
	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	} 
	
	public String getLastName() {
		return lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	// Setters
	public void setId(int id) {
		this.id = id;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	//Overriding the toString method for debugging
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
}
