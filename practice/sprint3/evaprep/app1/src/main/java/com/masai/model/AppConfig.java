package com.masai.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="com.masai")
@PropertySource("a1.properties")
public class AppConfig {
	@Bean
	public Map<Student, Course> getMap(){
		Map<Student,Course> map=new HashMap<>();
		Student s1=new Student(01,"Raja","Chhapki","r@gamil.com",500);
		Student s2=new Student(02,"Ram","Ayodhya","ram@gamil.com",800);
		Student s3=new Student(03,"Anshu","Baghi","anshu@gamil.com",700);
		
		Course c1=new Course(01,"Java",6,2.5);
		Course c2=new Course(02,"Spring",9,4);
		map.put(s1, c1);
		map.put(s2, c2);
		map.put(s3, c2);
		
		return map;
	}
	@Bean
	public List<Student> getList(){
		List<Student> students=new ArrayList<>();
		Student s1=new Student(01,"Raja","Chhapki","r@gamil.com",500);
		Student s2=new Student(02,"Ram","Ayodhya","ram@gamil.com",800);
		Student s3=new Student(03,"Anshu","Baghi","anshu@gamil.com",700);
		Student s4=new Student(04,"Ram","Ayodhya","ram@gamil.com",900);
		Student s5=new Student(05,"Anshu","Baghi","anshu@gamil.com",600);
		students.add(s1);students.add(s2);students.add(s3);students.add(s4);students.add(s5);
		
		return students;
	}

}
