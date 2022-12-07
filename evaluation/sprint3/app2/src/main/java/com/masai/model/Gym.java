package com.masai.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class Gym {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int gym_id;
	private String gym_name; 
	private double monthly_fee;
	@ManyToMany(cascade=CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "gyms")
	private List<Person> persons;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	
	Trainer trainer;
	
	
	public List<Person> getPersons() {
		return persons;
	}
	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	
	

	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	public Gym() {
		super();
		
	}
	public Gym(int gym_id, String gym_name, double monthly_fee) {
		super();
		this.gym_id = gym_id;
		this.gym_name = gym_name;
		this.monthly_fee = monthly_fee;
	}
	public int getGym_id() {
		return gym_id;
	}
	public void setGym_id(int gym_id) {
		this.gym_id = gym_id;
	}
	public String getGym_name() {
		return gym_name;
	}
	public void setGym_name(String gym_name) {
		this.gym_name = gym_name;
	}
	public double getMonthly_fee() {
		return monthly_fee;
	}
	public void setMonthly_fee(double monthly_fee) {
		this.monthly_fee = monthly_fee;
	}
	@Override
	public String toString() {
		return "Gym [gym_id=" + gym_id + ", gym_name=" + gym_name + ", monthly_fee=" + monthly_fee + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(gym_id, gym_name, monthly_fee);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gym other = (Gym) obj;
		return gym_id == other.gym_id && Objects.equals(gym_name, other.gym_name)
				&& Double.doubleToLongBits(monthly_fee) == Double.doubleToLongBits(other.monthly_fee);
	}
	
	
	
}
