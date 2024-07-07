package com.example.test;

public class Q17TestMethod {
	
	static String a = "Hello";
	
	public void printVariable(){
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
		//call m1 method from here
		Q17TestMethod testMethod = new Q17TestMethod();
		testMethod.printVariable();
	}

}
