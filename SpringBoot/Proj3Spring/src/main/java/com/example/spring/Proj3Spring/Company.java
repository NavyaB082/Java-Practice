package com.example.spring.Proj3Spring;

public class Company {
	Employee e;

	public Company(Employee e) {
		super();
		this.e = e;
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee getE() {
		return e;
	}

	public void setE(Employee e) {
		this.e = e;
	}

	@Override
	public String toString() {
		return "Company [e=" + e + "]";
	}
	

}
