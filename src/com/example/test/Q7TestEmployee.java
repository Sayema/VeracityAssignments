package com.example.test;

import com.example.pojo.Employee;

public class Q7TestEmployee {

	public static void main(String[] args) {
		//here create two objects of Employee class and add  data into that
		Employee employee1 = new Employee(101, "sam", 1000);
		Employee employee2 = new Employee(102, "mary", 3500);
		
		// call show method and pass this two objects to show method
		Q7TestEmployee.show(employee1);
		Q7TestEmployee.show(employee2);
	}

	public static void show(Employee emp) {
		// do required changes to show method and display that data here
		System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSal());
	}
}
