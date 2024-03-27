package com.learn.hibernate.HibernateProject1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Bike {
	@Id
	int b_no;
	String b_name;
	int b_cost;
	@OneToOne
	@JoinColumn(name = "b_id")
	Person p;
	
	public Bike(int b_no, String b_name, int b_cost, Person p) {
		super();
		this.b_no = b_no;
		this.b_name = b_name;
		this.b_cost = b_cost;
		this.p = p;
	}

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getB_no() {
		return b_no;
	}

	public void setB_no(int b_no) {
		this.b_no = b_no;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public int getB_cost() {
		return b_cost;
	}

	public void setB_cost(int b_cost) {
		this.b_cost = b_cost;
	}

	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "Bike [b_no=" + b_no + ", b_name=" + b_name + ", b_cost=" + b_cost + ", p=" + p + "]";
	}
	
	
	
	
	

}
