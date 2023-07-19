package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PassWordEncodeerTest {
	@Test	
	public void passwordEncode() {
		System.out.println(new BCryptPasswordEncoder().encode("balaji1218"));
	}

}
