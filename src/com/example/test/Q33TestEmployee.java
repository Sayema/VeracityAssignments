package com.example.test;

import com.example.pojo.Employee;

public class Q33TestEmployee {

	public static void show(Employee emp) {
		System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSal());
	}

	public static Employee process(Employee emp) {
		emp.setId(101);
		emp.setName("Samantha");
		emp.setSal(3500);
		
		return emp;
	}

	public static void main(String[] args) {
		// do required changes in main,process and show method
		// create empty employee object here
		Employee employee = new Employee();
		
		// add data into that empty object using process method
		employee = process(employee);
		
		// display employee object with data in show method
		show(employee);
	}

}
