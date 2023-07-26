package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserBean;
import com.example.demo.repo.UserRepository;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public UserBean save(UserBean userBean) {
		userBean.setPassword(passwordEncoder.encode(userBean.getPassword()));
		return userRepository.save(userBean);
	}

}
