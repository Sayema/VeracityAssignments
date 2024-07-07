package com.example.test;

import com.example.pojo.Employee;

public class Q3TestEmployee {

	public static void main(String[] args) {
		//here create object of Employee class and add 101,sam,1000 data into that using setter method
		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("sam");
		emp.setSal(1000);
		//display that data here
		System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSal());
	}

}
