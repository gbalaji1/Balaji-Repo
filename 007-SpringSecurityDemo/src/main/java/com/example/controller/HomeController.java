package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    //Accessed by any logged in user	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

	//Accessed by all with out login	
	@GetMapping("/public")
	public String all() {
		return "public";
	}

	//Accessed by logged in user who has ROLE USER
	@GetMapping("/user")
	public String user() {
		return "User";
	}

	//Accessed by logged in user who has ROLE ADMIN
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
	
	
	
		@GetMapping("/signuUp")
		public String signUp() {
			return "admin";
		}


}
