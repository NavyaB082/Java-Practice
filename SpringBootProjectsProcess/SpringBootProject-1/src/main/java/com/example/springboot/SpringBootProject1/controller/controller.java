package com.example.springboot.SpringBootProject1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class controller {
	@GetMapping("hello")
	public String welcomeUser() {
		return "I am learning SpringBoot";
	}
	@GetMapping("Java")
	public String program() {
		return "I am a java developer";
	}
	@GetMapping("python")
	public String program1() {
		return "I am python developer";
	}
	
	@GetMapping("Web")
	public String program2(){
		return "I am web developer";
	}
	

	



}
