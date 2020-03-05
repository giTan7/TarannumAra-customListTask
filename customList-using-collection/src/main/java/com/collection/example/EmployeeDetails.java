package com.collection.example;

public class EmployeeDetails {
	int empno;
	String empname;
	float salary;

	//default constructor
	EmployeeDetails() {
		
	}

	//parameterized constructor
	EmployeeDetails(int empno, String empname, float salary){
		this.empno = empno;
		this.empname = empname;
		this.salary = salary;
	}
}
