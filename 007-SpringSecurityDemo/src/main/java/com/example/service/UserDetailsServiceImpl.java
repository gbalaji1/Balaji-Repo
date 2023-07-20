package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.entity.UserBean;
import com.example.repo.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

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
