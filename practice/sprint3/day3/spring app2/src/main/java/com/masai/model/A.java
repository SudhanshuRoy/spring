package com.masai.model;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class A {
//	private List<String> names;
//	
//	public void setNames(List<String> names) {
//		this.names = names;
//	}
	
//	private String[] names;
//	
//	public void setNames(String[] names) {
//	this.names = names;
//	}
	
	private Map<Student, String> theMap;

	public void setTheMap(Map<Student, String> theMap) {
		this.theMap = theMap;
	}

	public void showA() {
	System.out.println("inside showA of A ");
	System.out.println(theMap);
	}

	

}
