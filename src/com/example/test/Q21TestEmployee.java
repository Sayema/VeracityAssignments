package com.example.test;

import com.example.pojo.Employee;

public class Q21TestEmployee {

	public static void testEmployee(Employee e) {
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
		// call m1 method from here
		Employee employee = new Employee(10, "Sam", 4000);
		testEmployee(employee);
	}

}
