package com.masai.garbageCollection;

public class Demo {
	public Demo() {
		System.out.println("Object created..");
	}
	
	

	
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("Object dies..");
	}



	public static void main(String[] args) {
		
		Demo d1=new Demo();
		d1=null;
		System.gc();

	}

}
