package com.example.spring.Proj1Spring;

public class JavaTeacher {

	int teacher_id;
	String teacher_name;
	public JavaTeacher(int teacher_id, String teacher_name) {
		super();
		this.teacher_id = teacher_id;
		this.teacher_name = teacher_name;
	}
	public JavaTeacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	@Override
	public String toString() {
		return "JavaTeacher [teacher_id=" + teacher_id + ", teacher_name=" + teacher_name + "]";
	}
	
}
