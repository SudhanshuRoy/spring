package com.masai.usecases;
import java.util.*;

import com.masai.dao.FitnessDao;
import com.masai.dao.FitnessDaoImpl;
import com.masai.model.Gym;

public class _1AddGym {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter gym name : ");
		String name=sc.next();
		System.out.println("Enter gym fee : ");
		double fee=sc.nextDouble();
		
		Gym gym=new Gym();
		gym.setGym_name(name);;
		gym.setMonthly_fee(fee);
		FitnessDao dao=new FitnessDaoImpl();
		dao.addGym(gym);
		System.out.println("Gym added !");
		

	}

}
