package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.FitnessDao;
import com.masai.dao.FitnessDaoImpl;
import com.masai.exception.GymException;
import com.masai.model.Person;

public class _2RegisterPerson {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter gym Id : ");
		int gym_Id=sc.nextInt();
		
		
		Person p1=new Person();
		p1.setName("Sudhanshu");
		p1.setAge(25);
		p1.setEmail("s@gmail.com");
		p1.setMobile("7979099677");
		
		FitnessDao dao=new FitnessDaoImpl();
		try {
			dao.registerPerson(p1, gym_Id);
			System.out.println("Preson registered");
			
		} catch (GymException e) {
			
			e.printStackTrace();
		}


	}

}
