package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class UserBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	@Column(nullable=false, unique=true)
	private String uname;
	
	private String email;
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_roles",
            joinColumns = { @JoinColumn(name = "user_id", referencedColumnName = "userId") },
            inverseJoinColumns = { @JoinColumn(name = "role_id", referencedColumnName = "rid") }
    )
	private List<RoleBean> roles;

	public UserBean(Long userId, String uname, String email, String password, List<RoleBean> roles) {
		super();
		this.userId = userId;
		this.uname = uname;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}

	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<RoleBean> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleBean> roles) {
		this.roles = roles;
	}
	
	
	

	

}
