package com.vidvaan.constructor;

import java.io.ObjectInputStream.GetField;

public class TestClass {

	public static void main(String[] args) {
		Constructor c1 = new Constructor();
		c1.setId(1001);
		c1.setName("rizwan");
		System.out.println("name..." + c1.getName());
		System.out.println("id.." + c1.getId());
		c1.setId(1002);
		c1.setName("mahesh");
		System.out.println("name.." + c1.getId());
		System.out.println("id.." + c1.getName());
		Constructor c2 = new Constructor();
		c2.setId(1003);
		c2.setName("pavan");
		System.out.println("name..." + c2.getName());
		System.out.println("id..." + c2.getId());

	}

}
