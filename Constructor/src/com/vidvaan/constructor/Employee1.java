package com.vidvaan.constructor;

public class Employee1 {

	int id;
	String name;

	public Employee1(int a, String b) {
		id = a;
		name = b;

	}

	public void cl() {
		System.out.println(id + "  " + name);

	}

	public static void main(String[] args) {
		Employee1 sc = new Employee1(1234, "sandeep");
		sc.cl();

	}

}
