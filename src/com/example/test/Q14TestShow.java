package com.example.test;

//There can not be more than one public class in a Java file
class Q14Show {
	public void show(){
		System.out.println("Hello world");
	}
}

public class Q14TestShow {
	public static void main(String[] args) {
		//call show method of Test class from here
		Q14Show sh = new Q14Show();
		sh.show();
	}
}