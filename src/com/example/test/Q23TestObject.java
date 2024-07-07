package com.example.test;

public class Q23TestObject {
	
	public static void testObject(Object o) {
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
		// call m1 method from here
		testObject(new Object());
	}

}
