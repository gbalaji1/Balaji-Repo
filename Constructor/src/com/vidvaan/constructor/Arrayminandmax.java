package com.vidvaan.constructor;

public class Arrayminandmax {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int min = a[0];
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];

			} else if (a[i] > max) {
				max = a[i];

			}
		}

		System.out.println("the minium value is---->" + min);
		System.out.println("the maxium value is---->" + max);
	}

}
