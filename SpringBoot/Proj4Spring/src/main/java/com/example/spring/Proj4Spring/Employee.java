package com.example.spring.Proj4Spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	List<String>technologies;
	Set<String>projects;
	Map<String,String>Companies;
	public Employee(List<String> technologies, Set<String> projects, Map<String, String> companies) {
		super();
		this.technologies = technologies;
		this.projects = projects;
		Companies = companies;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}
	public Set<String> getProjects() {
		return projects;
	}
	public void setProjects(Set<String> projects) {
		this.projects = projects;
	}
	public Map<String, String> getCompanies() {
		return Companies;
	}
	public void setCompanies(Map<String, String> companies) {
		Companies = companies;
	}
	@Override
	public String toString() {
		return "Employee [technologies=" + technologies + ", projects=" + projects + ", Companies=" + Companies + "]";
	}
	

}
