package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.FitnessDao;
import com.masai.dao.FitnessDaoImpl;
import com.masai.exception.GymException;
import com.masai.model.Person;

import java.util.*;

public class _5GetAllthePersonByGymName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter gym name : ");
		String gname=sc.next();
		FitnessDao dao=new FitnessDaoImpl();
		try {
		List<Person> persons=	dao.getAllthePersonByGymName(gname);
		persons.forEach(p->System.out.println(p));
		} catch (GymException e) {
			
			e.printStackTrace();
		}

	}

}
