package com.example.test;

import com.example.pojo.Employee;

public class Q25TestEmployee {
	
	public static void printEmployee(Object o){
		//display employee data here
		if(o instanceof Employee) {
			Employee sampleEmployee = (Employee) o;
			System.out.println(sampleEmployee.getId()+" "+sampleEmployee.getName()+" "+sampleEmployee.getSal());
		}
	}
	public static void main(String[] args) {
		//create Employee object here with 101,sam,1000 data
		Employee employee = new Employee(101, "sam", 1000);
		
		//call m1 method by passing this Employee object
		printEmployee(employee);
	}

}
