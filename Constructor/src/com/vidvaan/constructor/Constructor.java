package com.vidvaan.constructor;

public class Constructor {
	int id;
	String name;

	public Constructor() {

	}

	public void constructor(int idd, String ename) {
		idd = id;
		ename = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int iid) {
		id = iid;
	}

	public String getName() {
		return name;
	}

	public void setName(String ename) {
		this.name = ename;
	}

}
