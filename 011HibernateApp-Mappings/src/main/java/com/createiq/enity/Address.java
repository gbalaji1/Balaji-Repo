package com.createiq.enity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Address implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer aid;
	private String aloc;
	private String pincode;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(Integer aid, String aloc, String pincode) {
		super();
		this.aid = aid;
		this.aloc = aloc;
		this.pincode = pincode;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAloc() {
		return aloc;
	}

	public void setAloc(String aloc) {
		this.aloc = aloc;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", aloc=" + aloc + ", pincode=" + pincode + "]";
	}

}
