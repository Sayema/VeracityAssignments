package com.example.test;

import com.example.pojo.Employee;

public class Q9TestEmployee {

	public static void main(String[] args) {
		//create Employee object with 101,sam,1000 data
		Employee emp = new Employee(101, "sam", 1000);

		//display this object data by passing to show method
		Q9TestEmployee.show(emp);
		
		//add 100 bonus in salary 
		emp.setSal(emp.getSal() + 100);
		
		//display this object data by passing to show method
		Q9TestEmployee.show(emp);
	}

	public static void show(Employee ex) {
		System.out.println(ex.getId() + " " + ex.getName() + " " + ex.getSal());
	}

}
