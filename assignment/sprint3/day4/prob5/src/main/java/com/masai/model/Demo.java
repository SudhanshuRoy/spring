package com.masai.model;

import java.util.Map;
import java.util.Set;

public class Demo {
	
	private Map<Department, Employee> theMap;
	//use setter injection to inject theMap;
	
	public void setTheMap(Map<Department, Employee> theMap) {
		this.theMap = theMap;
	}
	
	public void myInit(){
	System.out.println("inside myInit method");
	}
	
	public void cleanUp(){
	System.out.println("inside cleanUp method");
	}
	public void showDetails(){
	System.out.println("inside showDetails of Demo class");
	//print all the details of all the employees department-wise.
	Set<Map.Entry<Department,Employee>> set=theMap.entrySet();
	
	for(Map.Entry<Department,Employee> kv:set)
	{
		System.out.println(kv.getKey()+" = "+kv.getValue());
	}


	
	}

}
