package com.masai.model;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private Map<Student, Course> theMap;
	@Autowired
	private List<Student> theList;
	@Value("${appName}")
	private String appName;
	

	
	public void printMap(){
		//print all the student's and their course details from theMap
		Set<Map.Entry<Student,Course>> set=theMap.entrySet();
		for(Map.Entry<Student, Course> kv:set) {
			System.out.println(kv.getKey()+" "+kv.getValue());
		}
		}
		public void printList(){
		//sort the List of Student according to the marks (make use of Lamda
		//expression).
		//print all the sorted Student Details
			Comparator<Student> comp=(s1,s2)->s1.getMarks()>s2.getMarks()? +1:-1;
			TreeSet<Student> sortedSet=new TreeSet<>(comp);
			sortedSet.addAll(theList);
			sortedSet.forEach(s->System.out.println(s));
			
		}
			
		
		public void printAppName(){
		//print the injected appName
			System.out.println("appName : "+appName);
		}
	

}
