package com.vidvaan.constructor;

public class Student {
	private int idno;
	private String name;

	public void display() {
		System.out.println("idno  " + idno);
		System.out.println("Name  " + name);
	}

	public Student() {
		this(10, "v");
	}

	public Student(int idno, String name) {

		this.idno = idno;
		this.name = name;
	}

	public void setId(int idno) { 
		this.idno = idno;
	}

	public int getIdno() {
		return idno;
	}

	public void setString(String name) {
		this.name = name;
	}

	public String getString() {
		return name;
	}
}
