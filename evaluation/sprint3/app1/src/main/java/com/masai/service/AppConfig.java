package com.masai.service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.masai.model.Gym;
import com.masai.model.Person;

@Configuration
@ComponentScan
@PropertySource("a1.properties")
public class AppConfig {
	@Bean
	public Map<Person, Gym> getMap(){
    	Map<Person,Gym> map=new HashMap<>();
    	Person p1=new Person(01,"Sudhanshu","s@gmail.com",24,"7979099677");
    	Person p2=new Person(02,"Raj","r@gmail.com",28,"789699677");
    	Person p3=new Person(03,"Gaurav","g@gmail.com",18,"8581073132");
    	Gym g1=new Gym(01,"fitness",3000);
    	Gym g2=new Gym(02,"Budybuilding",5000);

    	map.put(p1,g1);
    	map.put(p2, g2);
    	map.put(p3, g2);
    	return map;
    	
    }
	@Bean
	public List<Person> getPerson(){
		List<Person> persons=new ArrayList<>();
		Person p1=new Person(01,"Sudhanshu","s@gmail.com",24,"7979099677");
    	Person p2=new Person(02,"Raj","r@gmail.com",28,"789699677");
    	Person p3=new Person(8,"Gaurav","g@gmail.com",18,"8581073132");
    	Person p4=new Person(10,"Suraj","su@gmail.com",35,"987699677");
    	Person p5=new Person(5,"Nitu","n@gmail.com",68,"8258073132");
    	persons.add(p1);
    	persons.add(p2);
    	persons.add(p3);
    	persons.add(p4);
    	persons.add(p5);
    	
		return persons;
	}

}
