package com.masai;

public class Travel{
	
	Vehical v;
	private int noOfPerson;
	
	
	
		
		
	
	public Travel(Vehical v, int noOfPerson) {
		super();
		this.v = v;
		this.noOfPerson = noOfPerson;
	}



//	public void setV(Vehical v) {
//		this.v = v;
//	}
//	
//	
//
//
//
//	public void setNoOfPerson(int noOfPerson) {
//		this.noOfPerson = noOfPerson;
//	}





	public void journey() {
		v.go();
		System.out.println("Jounrney started...");
		System.out.println("NoOfPerson : "+noOfPerson);
		}
}
