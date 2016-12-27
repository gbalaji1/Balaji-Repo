package com.vidvaan.constructor;

public class Math {
	int a;
	int b;
	int c;

	public void display() {
		System.out.println("sum  " + (a + b + c));

	}

	public Math() {

	}

	public Math(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;

	}
}
