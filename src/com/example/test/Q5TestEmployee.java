package com.example.test;

import com.example.pojo.Employee;

public class Q5TestEmployee {

	public static void main(String[] args) {
		// here create object of Employee class and add 101,sam,1000 data into that
		Employee emp = new Employee(101, "sam", 1000);

		// call show method and pass this created object to show method
		show(emp);
	}

	public static void show(Employee emp) {
		// do required changes to show method and display that data here
		System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSal());
	}

}
