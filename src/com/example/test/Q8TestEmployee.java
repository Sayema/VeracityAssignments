package com.example.test;

import com.example.pojo.Employee;

public class Q8TestEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee(101, "sam", 1000);
		Q8TestEmployee.show(emp);
		System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSal());
	}

	public static void show(Employee ex) {
		System.out.println(ex.getId() + " " + ex.getName() + " " + ex.getSal());
		ex.setId(102);
	}

}
