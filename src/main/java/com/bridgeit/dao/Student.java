package com.bridgeit.dao;

public class Student {
	int number;
	String name,dept,id;
	public Student(String name, String dept, String id, int number) {
		super();
		this.name = name;
		this.dept = dept;
		this.id = id;
		this.number = number;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	

}
