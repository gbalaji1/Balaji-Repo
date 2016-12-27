package com.vidvaan.constructor;

public class Reversearray {
	
		
	
	int a[]=new int[]{1,2,3,4,5,6,7};
     
	int b[];
	public void display(){
		for (int i = a.length-1; i >=0 ; i--) {
		
		System.out.print(a[i]+",");
			
		}
	}
public static void main(String[] args) {
	Reversearray d=new Reversearray();
	d.display();
}
   }


