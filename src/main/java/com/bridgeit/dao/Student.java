package com.bridgeit.dao;

public class Student {
private String name,id,dept,Number;

public Student(String name, String id, String dept, String number) {
	super();
	this.name = name;
	this.id = id;
	this.dept = dept;
	Number = number;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}

public String getNumber() {
	return Number;
}

public void setNumber(String number) {
	Number = number;
}

}
