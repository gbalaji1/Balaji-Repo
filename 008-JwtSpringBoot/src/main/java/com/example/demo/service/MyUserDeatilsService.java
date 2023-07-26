package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserBean;
import com.example.demo.repo.UserRepository;
@Service
public class MyUserDeatilsService implements UserDetailsService{

//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		
//		if(!"balaji".equals(username)) {
//			throw new UsernameNotFoundException("");
//		}
//		
//		UserDetails userDetails = User.builder().username("balaji").password("$2a$10$iN3PT4lPz.eA9AIrrkwr1OHIZZHuRyCwUsTjSpszgDe1xiEgFiOK6")
//				.roles("ADMIN","USER").build();
//		return userDetails;
//		
//		
//	}
	
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserBean userBean = userRepository.findByUname(username);
		
		if(userBean == null) {
			throw new UsernameNotFoundException("Invalid Username or Password");
		}
		
		String[] roles = userBean.getRoles().stream().map(r -> r.getRoleName()).toArray(String[]::new);
		UserDetails userDetails = User.builder().username(userBean.getUname()).password(userBean.getPassword())
				.roles(roles).build();
		return userDetails;
	}

}
