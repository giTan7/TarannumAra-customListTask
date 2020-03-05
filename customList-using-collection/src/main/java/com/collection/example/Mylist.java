package com.collection.example;

import java.util.ArrayList;

public class Mylist {

	/**
	 * Add element to the provided list
	 * @param list
	 * @param empno
	 * @param empname
	 * @param salary
	 */
	public void addValues(ArrayList<EmployeeDetails> list,int empno, String empname, float salary) {
		list.add(new EmployeeDetails(empno, empname, salary));
		printValues(list);	
	}

	/**
	 * Remove element based on the given index 
	 * @param list
	 * @param n
	 * @throws IndexOutOfBoundsException
	 */
	public void removeValues(ArrayList<EmployeeDetails> list,int n) throws IndexOutOfBoundsException{
		try {
			list.remove(list.get(n-1));
			printValues(list);
		}catch(Exception e) {
			System.out.println("ERROR! -> index is not there");
		}
	}

	/**
	 * Search element based on provided index
	 * @param list
	 * @param n - Index
	 * @throws Exception when element not found in the list
	 */
	public void searchValue(ArrayList<EmployeeDetails> list,int n) throws Exception{
		try {
			EmployeeDetails data = list.get(n-1);
			System.out.println("Employee Number: " + data.empno);
			System.out.println("Employee Name: " + data.empname);
			System.out.println("Employee salary: "+data.salary);

		}catch(Exception e) {
			System.out.println("ERROR! ->employee is not present!");
		}
	} 

	/**
	 * Print all elements of the list
	 * @param list
	 */
	public void printValues(ArrayList<EmployeeDetails> list) {
		for (int i = 0; i < list.size(); i++) {
			EmployeeDetails e = list.get(i);
			System.out.println("S.No - "+i+1);
			System.out.println("\tEmployee Number: " + e.empno);
			System.out.println("\tEmployee Name: " + e.empname);
			System.out.println("\tEmployee salary: "+e.salary);
		}
	}
}
