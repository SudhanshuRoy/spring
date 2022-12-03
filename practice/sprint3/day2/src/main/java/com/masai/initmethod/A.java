package com.masai.initmethod;

public class A {
	
	int age;
	String name;
	
	
	
	public A() {
		super();
		System.out.println("Inside constructor age is "+age);
		System.out.println("Inside constructor name is "+name);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void mySetup() {
	System.out.println("inside mySetup method to write any initialization logic...");
	System.out.println("Inside mySetup age is "+age);
	System.out.println("Inside mySetup name is "+name);
	
	}
	public void funA() {
	System.out.println("inside funA of A");
	}

}
