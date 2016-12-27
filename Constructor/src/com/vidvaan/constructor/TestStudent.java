package com.vidvaan.constructor;

public class TestStudent {
	public static void main(String[] args) {
		Student s1=new Student();
		//s.idno=1001;
		//s.name="Rizwan";
		//s.display();
	
	//Student s1=new Student(1002,"abc");
	s1.display();
	s1.setId(1003);
	System.out.println("idno  "+s1.getIdno());
	s1.setString("xyz");
	System.out.println("String  "+s1.getString());
}
	


}
