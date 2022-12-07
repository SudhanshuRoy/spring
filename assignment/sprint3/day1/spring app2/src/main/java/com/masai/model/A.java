package com.masai.model;
import java.util.List;

public class A {
	private List<String> names;
	
	public void setNames(List<String> names) {
		this.names = names;
	}

	public void showA() {
		System.out.println("I am inside showA ");
		System.out.println(names);
	}

}
