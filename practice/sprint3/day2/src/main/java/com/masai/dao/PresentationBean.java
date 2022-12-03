package com.masai.dao;

public class PresentationBean {
	
	private ServiceBean service;
	
//	public void setService(ServiceBean service) {
//	this.service = service;
//	}
	
	public PresentationBean(ServiceBean service) {
		super();
		this.service = service;
	}
	
	public void present() {
	service.calculateInterest();
	System.out.println("Pesenting the calculated interesest in PL");
	}



}
