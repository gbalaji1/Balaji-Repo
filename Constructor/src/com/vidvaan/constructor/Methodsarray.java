package com.vidvaan.constructor;

public class Methodsarray {
	int a[] = { 78, 596, 25, 654, 786, 111 };
	int min = a[0];
	int max = a[0];
	{
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			} else if (a[i] >max ) {
				max = a[i];

			}
		}

	}

	public void display() {

		System.out.println("the minium value is ::::-->" + min);
		System.out.println("the maxium value is ::::-->" + max);
	}

	public static void main(String[] args) {
		Methodsarray m1 = new Methodsarray();
		m1.display();
	}
}
