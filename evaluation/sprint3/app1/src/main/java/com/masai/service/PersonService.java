package com.masai.service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.masai.model.Gym;
import com.masai.model.Person;

@Service
public class PersonService {
	@Autowired
	private Map<Person, Gym>  theMap;
	@Autowired
	private List<Person> theList;
	@Value("${appName}")
	private String appName;

	

	public void printMap(){

	//print all the person's and their gym details from the Map
		Set<Map.Entry<Person,Gym>> set=theMap.entrySet();
		for(Map.Entry<Person,Gym> e:set) {
			System.out.println(e.getKey()+"="+e.getValue());
		}

	}

	public void printList(){

	//sort the List of Person according to the increasing order of the age 

	//print all the sorted Person Details
		Comparator<Person> comp=(p1,p2)->p1.getAge()>p2.getAge()? +1:-1;
		Set<Person> ts=new TreeSet<>(comp);
		ts.addAll(theList);
		ts.forEach(p->System.out.println(p));

	}

	public void printAppName(){

	//print the injected appName
		System.out.println("App Name : "+appName);

	}

}
