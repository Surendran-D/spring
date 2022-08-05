package com.project1;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.sql.ordering.antlr.GeneratedOrderByFragmentRendererTokenTypes;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private int roll;
	private String name;
	private String dept;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
	
	

}
