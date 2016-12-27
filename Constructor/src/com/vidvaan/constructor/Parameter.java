package com.vidvaan.constructor;

public class Parameter {

	int a;
	int b;
	int c;

	public int sum() {
		int sum = a + b + c;
		return sum;

	}

	public Parameter(int x, int y, int z) {
		a = x;
		b = y;
		c = z;

	}

	public static void main(String[] args) {
		Parameter parameter = new Parameter(20, 10, 25);
		
		int sum=parameter.sum();
		System.out.println(sum);

	}

}
