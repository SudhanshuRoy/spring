package com.masai.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.exception.GymException;
import com.masai.exception.TrainerException;
import com.masai.model.Gym;
import com.masai.model.Person;
import com.masai.model.Trainer;
import com.masai.utility.EMUtil;

public class FitnessDaoImpl implements FitnessDao{

	@Override
	public void addGym(Gym gym) {
		EntityManager em=EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		em.persist(gym);
		em.getTransaction().commit();
		
		em.close();
		
	}

	@Override
	public void registerPerson(Person person, int gym_id) throws GymException {
		EntityManager em=EMUtil.provideEntityManager();
		Gym gym=em.find(Gym.class, gym_id);
		if(gym!=null) {
			em.getTransaction().begin();
			gym.getPersons().add(person);
			em.getTransaction().commit();
			
		}
		else throw new GymException("Invalid Gym_Id");
		em.close();
		
	}

	@Override
	public void registerTrainer(Trainer trainer) {
		EntityManager em=EMUtil.provideEntityManager();
		em.getTransaction().begin();
		em.persist(trainer);
		em.getTransaction().commit();
		
		em.close();
		
	}

	@Override
	public void assignTrainerWithGym(int trainer_id, int gym_id) throws TrainerException, GymException {
		EntityManager em=EMUtil.provideEntityManager();
		Trainer trainer=em.find(Trainer.class, trainer_id);
		if(trainer!=null) {
			Gym gym=em.find(Gym.class, gym_id);
			if(gym!=null) {
				
				em.getTransaction().begin();
				gym.setTrainer(trainer);
				trainer.getGyms().add(gym);
				em.getTransaction().commit();
				
			}else throw new GymException("Invalid gym id");
			
		}else throw new TrainerException("Invalid trainer id");
		em.close();
		
	}

	@Override
	public List<Person> getAllthePersonByGymName(String gym_name) throws GymException {
		EntityManager em=EMUtil.provideEntityManager();
		List<Person> persons=new ArrayList<>();
		
		String jpql="from Gym where gym_name=?1";
		
		TypedQuery<Gym> q=em.createNamedQuery(jpql,Gym.class);
		q.setParameter(1, gym_name);
		
		List<Gym> gyms=q.getResultList();
		if(gyms==null) throw new GymException("Gym name not found !");
		persons=gyms.get(0).getPersons();
		
		em.close();
		return persons;
	}

}
