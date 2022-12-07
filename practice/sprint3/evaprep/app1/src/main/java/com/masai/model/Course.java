package com.masai.model;

import java.util.Objects;

public class Course {
	
	private int courseId;
	private String name;
	private double duration;
	private double fee;
	
	
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Course(int courseId, String name, double duration, double fee) {
		super();
		this.courseId = courseId;
		this.name = name;
		this.duration = duration;
		this.fee = fee;
	}



	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public int hashCode() {
		return Objects.hash(courseId, duration, fee, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return courseId == other.courseId
				&& Double.doubleToLongBits(duration) == Double.doubleToLongBits(other.duration)
				&& Double.doubleToLongBits(fee) == Double.doubleToLongBits(other.fee)
				&& Objects.equals(name, other.name);
	}



	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", name=" + name + ", duration=" + duration + ", fee=" + fee + "]";
	}
	
	
	

}


