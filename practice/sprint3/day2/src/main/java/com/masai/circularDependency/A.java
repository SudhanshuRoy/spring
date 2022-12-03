package com.masai.circularDependency;

public class A {
	B b1;

//	public A(B b1) {
//		super();
//		this.b1 = b1;
//	}
	
	
	
	public void showA()
	{
		System.out.println("Inside the showA of A");
		System.out.println("b1 : "+b1);
	}

	public void setB1(B b1) {
		this.b1 = b1;
	}

}
