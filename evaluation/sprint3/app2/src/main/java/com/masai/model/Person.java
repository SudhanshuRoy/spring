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
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private	int person_id;
	private String name; 
	private String email;
	private	int	age;
	private String	mobile;
	@ManyToMany(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Gym> gyms;
	
	
	
	
	public List<Gym> getGyms() {
		return gyms;
	}
	public void setGyms(List<Gym> gyms) {
		this.gyms = gyms;
	}
	public Person() { 
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int person_id, String name, String email, int age, String mobile) {
		super();
		this.person_id = person_id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.mobile = mobile;
	}
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", name=" + name + ", email=" + email + ", age=" + age + ", mobile="
				+ mobile + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, email, mobile, name, person_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(email, other.email) && Objects.equals(mobile, other.mobile)
				&& Objects.equals(name, other.name) && person_id == other.person_id;
	}
	
	

}
