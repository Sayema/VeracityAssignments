package com.example.test;

import com.example.pojo.Employee;

public class Q31TestEmployeeObject {

	public static Object createEmployee() {
		// create Employee object here and return
		Employee emp = new Employee(101, "Samantha", 5000);
		
		// don’t change m1 method prototype i.e return type or access specifier
		return emp;
	}

	public static void main(String[] args) {
		// call m1 method and catch returned employee object here
		Employee emp = (Employee) createEmployee();
		
		// display returned employee data here
		System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSal());
	}

}
