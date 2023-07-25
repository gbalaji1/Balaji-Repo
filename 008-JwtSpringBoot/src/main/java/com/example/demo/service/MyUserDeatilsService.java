package com.example.demo.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class MyUserDeatilsService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		if(!"balaji".equals(username)) {
			throw new UsernameNotFoundException("");
		}
		
		UserDetails userDetails = User.builder().username("balaji").password("$2a$10$iN3PT4lPz.eA9AIrrkwr1OHIZZHuRyCwUsTjSpszgDe1xiEgFiOK6")
				.roles("ADMIN","USER").build();
		return userDetails;
		
		
	}

}
