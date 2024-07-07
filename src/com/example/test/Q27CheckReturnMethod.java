package com.example.test;

public class Q27CheckReturnMethod {

	public static int squareValue(int i) {
		System.out.println("squareValue called");
		return i*i;
	}

	public static void main(String[] args) {
		//call m1 method and pass some number
		System.out.println(squareValue(10));
	}

}
