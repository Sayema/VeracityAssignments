package com.example.test;

public class Q11TestMethods {

	public static void main(String[] args) {
		// call show method in different ways
		Q11TestMethods.show();
		show();
		
		Q11TestMethods testEmployee = new Q11TestMethods();
		testEmployee.show();
	}

	public static void show() {
		System.out.println("show method");
	}

}
