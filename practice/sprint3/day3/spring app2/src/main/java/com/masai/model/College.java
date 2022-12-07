package com.masai.model;

import java.util.List;

public class College {
	
	private String collegeName;
	private List<Student> students;
	
	
	public College(String collegeName) {
		super();
		this.collegeName = collegeName;
	}
	
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public String getCollegeName() {
		return collegeName;
	}
	
	public List<Student> getStudents() {
		return students;
	}
	
}
