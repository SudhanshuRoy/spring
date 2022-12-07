package com.masai.model;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service(value="a")
public class A {
	
//	@Value("${id}")
//	private int eid;
//	@Value("${name}")
//	private String ename;
//	@Value("${salary}")
//	private int salary;
	
	@Autowired
	private Environment env;
	
	@Autowired(required=false)
//	@Qualifier(value="b12")
	private B b1;
	
	@Autowired
	@Qualifier(value="getCities")
	List<String> cities;
	
	@Autowired
	List<String> names;
	@Autowired
	Student s1;
	
	@PostConstruct
	public void setUp() {
		System.out.println("Inside the setUp method");
		
	}
	
	@PreDestroy
	public void distroy() {
		System.out.println("Inside the distroy method");
	
	}
	
	public void funA() {
		System.out.println("inside funA of A");
//		System.out.println("b1 : "+b1);
		System.out.println(cities);
		System.out.println(names);
		System.out.println(s1);
		System.out.println("eid is : "+env.getProperty("id"));
		System.out.println("ename is : "+env.getProperty("name"));
		System.out.println("salary is : "+env.getProperty("salary"));

		}

}
