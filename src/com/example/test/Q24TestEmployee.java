package com.example.test;

import com.example.pojo.Employee;

public class Q24TestEmployee {

	public static void printEmployee(Employee e) {
		// display data here
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
	}

	public static void main(String[] args) {
		// call m1 method from here
		printEmployee(new Employee(101, "James Bond", 7000));
	}

}
