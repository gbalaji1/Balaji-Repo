package com.example.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class RoleBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long rid;
	private String roleName;

	@ManyToMany(mappedBy = "roles")
	private List<UserBean> users = new ArrayList<>();

	public RoleBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoleBean(Long rid, String roleName, List<UserBean> users) {
		super();
		this.rid = rid;
		this.roleName = roleName;
		this.users = users;
	}

	public Long getRid() {
		return rid;
	}

	public void setRid(Long rid) {
		this.rid = rid;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<UserBean> getUsers() {
		return users;
	}

	public void setUsers(List<UserBean> users) {
		this.users = users;
	}

}
