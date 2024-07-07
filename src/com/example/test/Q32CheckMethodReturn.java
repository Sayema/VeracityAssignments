package com.example.test;

public class Q32CheckMethodReturn {

	public static int squareValue(int i){
		return i*i;
	}
	public static void main(String[] args) {
		//call m1 method from here in different ways
		
		//without catching returned value
		squareValue(10);
		
		//catching returned value
		int sq = squareValue(5);
		
		//call from expression	
		int cube = squareValue(5) * 5;
		int val = (5 < 10) ? squareValue(sq) : 0;
		
		System.out.println(squareValue(2));
	}

}
