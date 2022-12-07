package com.masai.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.Copies;

@Configuration
@ComponentScan(basePackages="com.masai")
@PropertySource("a1.properties")
public class AppConfig {
	
	@Bean
	public List<String> getCities(){
		List<String> cities=new ArrayList<>();
		cities.add("Delhi");
		cities.add("Kolkata");
		cities.add("Gao");
		cities.add("Pune");
		cities.add("Patna");
		return cities;
	}
	
	@Bean(value="names")
	public List<String> getNames(){
		List<String> names=new ArrayList<>();
		names.add("Sudhnashu");
		names.add("Ram");
		names.add("Pankaj");
		names.add("Hari");
		names.add("Sonu");
		return names;
	}
	@Bean
	public Student getStudent() {
		Student s=new Student(01,"Sudhanshu",500);
		return s;
	}

}
