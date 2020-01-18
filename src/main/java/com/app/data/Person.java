package com.app.data;

public class Person {
	
	private String id;
	private String name;
	private String email;
	private String State;
	public Person() {
		
	}
	public Person(String id, String name, String email, String state) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		State = state;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	
	

}
