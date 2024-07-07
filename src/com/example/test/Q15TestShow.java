package com.example.test;

//There can not be more than one public class in a Java file
class Q15Show {
	public static void show(){
		System.out.println("Hello world");
	}

}

public class Q15TestShow {
	public static void main(String[] args) {
		//call show method of Test class from here
		Q15Show.show();
	}
}
