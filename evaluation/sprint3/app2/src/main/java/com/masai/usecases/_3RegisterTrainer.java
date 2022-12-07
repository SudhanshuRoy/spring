package com.masai.usecases;

import com.masai.dao.FitnessDao;
import com.masai.dao.FitnessDaoImpl;
import com.masai.model.Trainer;

public class _3RegisterTrainer {

	public static void main(String[] args) {
		Trainer trainer=new Trainer();
		trainer.setTrainer_name("Gaurav");
		trainer.setEmail("g@gamil.com");
		trainer.setYear_of_experience(8);
		FitnessDao dao=new FitnessDaoImpl();
		dao.registerTrainer(trainer);
		System.out.println("done..");

	}

}
