package com.example.test;

import com.example.pojo.Employee;

public class Q10TestEmployee {

	public static void main(String[] args) {
		//create Employee object with 101,sam,1000 data
		Employee emp = new Employee(101, "sam", 1000);

		Q10TestEmployee testEmployee = new Q10TestEmployee();
				
		//display this object data by passing to show method
		testEmployee.show(emp);
		
		//add 100 bonus in salary 
		emp.setSal(emp.getSal() + 100);
		
		//display this object data by passing to show method
		testEmployee.show(emp);
	}

	public void show(Employee ex) {
		System.out.println(ex.getId() + " " + ex.getName() + " " + ex.getSal());
	}

}
