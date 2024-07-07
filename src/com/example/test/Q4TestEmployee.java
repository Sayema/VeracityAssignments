package com.example.test;

import com.example.pojo.Employee;

public class Q4TestEmployee {

	public static void main(String[] args) {
		//here create object of Employee class and add 101,sam,1000 data into that using constructor
		Employee emp = new Employee(101, "sam", 1000);
		//display that data here
		System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSal());
	}

}
