package com.example.test;

import com.example.pojo.Employee;

public class Q30TestEmployee {

	public static Employee createEmployee() {
		// create Employee object here and return
		Employee employee = new Employee(101, "Samantha", 3000);
		
		// do required changes in m1 method to do this task
		return employee;
	}

	public static void main(String[] args) {
		// call m1 method and catch returned employee object here
		Employee emp = createEmployee();
		
		// display returned employee data here
		System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSal());
	}

}
