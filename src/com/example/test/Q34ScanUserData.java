package com.example.test;

import java.util.Scanner;

import com.example.pojo.Employee;

public class Q34ScanUserData {

	public static void main(String[] args) {
		// take data id,name,salary from user using scanner and display that data in
		Scanner scan = new Scanner(System.in);
		
		Employee emp = new Employee();
		System.out.println("Enter Id");
		emp.setId(scan.nextInt());
		scan.nextLine();
		System.out.println("Enter Name");
		emp.setName(scan.nextLine());
		System.out.println("Enter Salary");
		emp.setSal(scan.nextInt());
		scan.close();
		
		// show method
		Q34ScanUserData scanData = new Q34ScanUserData();
		scanData.show(emp);
	}

	public void show(Employee emp) {
		// display data here by doing required changes
		System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getSal());
	}

}
