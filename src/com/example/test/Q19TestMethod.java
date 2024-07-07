package com.example.test;

public class Q19TestMethod {
	
	public void printFloat(float data){
		System.out.println(data);
	}

	public static void main(String[] args) {
		//call m1 method from here
		float sampleData = 10.5f;
		
		Q19TestMethod testMethod = new Q19TestMethod();
		testMethod.printFloat(sampleData);
	}

}
