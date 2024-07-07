package com.example.test;

public class Q29CheckReturnMethod {

	public static float squareValue(int i) {
		System.out.println("squareValue called");
		return i*i;
	}

	public static void main(String[] args) {
		//call m1 method and pass some number
		int total = (int) (100 + squareValue(5));
		System.out.println(total);

	}

}
