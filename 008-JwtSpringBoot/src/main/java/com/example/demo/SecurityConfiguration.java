package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.demo.jwt.JwtAuthenticationEntryPoint;
import com.example.demo.jwt.JwtRequestFilter;

@Configuration
public class SecurityConfiguration {
//	@Bean
//	public UserDetailsService userDetailsServices() {
//		UserDetails user = User.builder().username("user").password(passwordEncoder().encode("user")).roles("USER")
//				.build();
//		UserDetails admin = User.builder().username("admin").password(passwordEncoder().encode("admin")).roles("ADMIN")
//				.build();
//		return new InMemoryUserDetailsManager(user, admin);
//	}

	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private JwtRequestFilter jwtRequestFilter;
	
	
	@Autowired
	private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;
	

	@Autowired 
	private PasswordEncoder passwordEncoder;
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http.csrf((csrf) -> csrf.disable());
		http.authorizeHttpRequests((authorizeHttpRequests) ->{
			authorizeHttpRequests.requestMatchers("/signIn","/signUp").permitAll();
			authorizeHttpRequests.requestMatchers("/hello").authenticated();
			authorizeHttpRequests.requestMatchers("/user").hasRole("USER");
			authorizeHttpRequests.requestMatchers("/admin").hasRole("ADMIN");
		});
		
		//http.formLogin(Customizer.withDefaults());
		
		http.exceptionHandling().authenticationEntryPoint(jwtAuthenticationEntryPoint).and().sessionManagement()
		.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		
		http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
		
		return http.build();
	}
	
	
	@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder);
    }
	
	@Bean
	public AuthenticationManager authenticationManager(HttpSecurity http) throws Exception {
	    return http.getSharedObject(AuthenticationManagerBuilder.class)
	            .build();
	}

}