package com.masai.circularDependency;

public class B {
	
	A a1;

	public B(A a1) {
		super();
		this.a1 = a1;
	}
	
	public void showB()
	{
		System.out.println("Inside the showA of B");
		System.out.println("a1 : "+a1);
	}

}
