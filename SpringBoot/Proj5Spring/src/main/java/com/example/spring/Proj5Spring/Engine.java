package com.example.spring.Proj5Spring;

public class Engine {
	int eng_no;
	String eng_type;
	public Engine(int eng_no, String eng_type) {
		super();
		this.eng_no = eng_no;
		this.eng_type = eng_type;
	}
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEng_no() {
		return eng_no;
	}
	public void setEng_no(int eng_no) {
		this.eng_no = eng_no;
	}
	public String getEng_type() {
		return eng_type;
	}
	public void setEng_type(String eng_type) {
		this.eng_type = eng_type;
	}
	@Override
	public String toString() {
		return "Engine [eng_no=" + eng_no + ", eng_type=" + eng_type + "]";
	}
	

}
