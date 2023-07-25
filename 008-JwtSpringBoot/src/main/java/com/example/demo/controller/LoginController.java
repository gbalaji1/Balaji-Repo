package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.LoginReqBean;
import com.example.demo.bean.LoginResBean;
import com.example.demo.service.MyUserDeatilsService;
import com.example.demo.util.JwtTokenUtil;

@RestController
public class LoginController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private MyUserDeatilsService userDeatilsService;

	@PostMapping("/signIn")
	public ResponseEntity<?> login(@RequestBody LoginReqBean loginReqBean) {
		try {
			authenticate(loginReqBean.getUsername(), loginReqBean.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
		UserDetails userDetails = userDeatilsService.loadUserByUsername(loginReqBean.getUsername());
		String token = jwtTokenUtil.generateToken(userDetails);
		LoginResBean loginResBean = new LoginResBean(token , loginReqBean.getUsername());
		return ResponseEntity.ok(loginResBean);
	}
	
	
	private void authenticate(String username, String password) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}
}
