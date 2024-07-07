package com.example.test;

public class Q12TestVariables {

	private static int total = 10;
	
	public static void main(String[] args) {
		//print total in different ways
		
		System.out.println(total);
		System.out.println(Q12TestVariables.total);
		
		Q12TestVariables testEmployee = new Q12TestVariables();
		System.out.println(testEmployee.total);
	}

}
