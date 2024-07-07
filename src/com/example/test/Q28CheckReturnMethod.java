package com.example.test;

public class Q28CheckReturnMethod {

	public static int squareValue(int i) {
		System.out.println("squareValue called");
		return i*i;
	}

	public static void main(String[] args) {
		//call m1 method and pass some number
		int total = 100 + squareValue(5);
		System.out.println(total);

	}

}
