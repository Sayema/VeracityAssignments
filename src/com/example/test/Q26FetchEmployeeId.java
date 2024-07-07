package com.example.test;

import com.example.pojo.Employee;

public class Q26FetchEmployeeId {

	public static void printEmployeeId(int i) {
		System.out.println(i);
	}

	public static void main(String[] args) {
		// create Employee object here with 101,sam,1000 data
		Employee employee = new Employee(101, "sam", 1000);
		
		// call m1 method and pass employee id as parameter
		printEmployeeId(employee.getId());
	}

}
