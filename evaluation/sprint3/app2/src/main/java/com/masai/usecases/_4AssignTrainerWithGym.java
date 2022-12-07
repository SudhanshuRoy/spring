package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.FitnessDao;
import com.masai.dao.FitnessDaoImpl;
import com.masai.exception.GymException;
import com.masai.exception.TrainerException;

public class _4AssignTrainerWithGym {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter trainer Id ");
		int tid=sc.nextInt();
		System.out.println("Enter  gym Id ");
		int gid=sc.nextInt();
		
		FitnessDao dao=new FitnessDaoImpl();
		
		try {
			dao.assignTrainerWithGym(tid, gid);
		} catch (TrainerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (GymException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Trainer assigned");

	}

}
