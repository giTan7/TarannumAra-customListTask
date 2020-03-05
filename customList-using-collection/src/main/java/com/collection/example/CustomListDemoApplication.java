package com.collection.example;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Application to interact with Customized list
 * 
 * @author Tarannum Ara
 */
public class CustomListDemoApplication {

	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
		int empno; String empname; float salary; int choice=1;
		ArrayList<EmployeeDetails> list=new ArrayList<EmployeeDetails>();

		while(choice == 1) {
			System.out.println("1:add\n2:remove\n3:fetch");
			int ch = sc.nextInt();
			Mylist custom = new Mylist();

			switch(ch) {
			case 1:
				System.out.println("provide the employee details-----");
				System.out.println("emp no:");
				empno = sc.nextInt();
				System.out.println("emp name:");
				empname = sc.next();
				System.out.println("emp salary");
				salary = sc.nextFloat();

				custom.addValues(list, empno, empname, salary);
				break;
			}

			if(ch == 2) {
				System.out.println("index:");
				int n = sc.nextInt();
				custom.removeValues(list,n);
			}

			if(ch == 3) {
				System.out.println("index:");
				int n = sc.nextInt();
				custom.searchValue(list,n);
			}


			System.out.println("want to continue? ");
			choice = sc.nextInt();
		}
		sc.close();
	}
}
