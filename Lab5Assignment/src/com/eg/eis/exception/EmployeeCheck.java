/**
 * To check whether the employee salary is more than 3000 or not.
 *@author MANASA KAITHA
 */
 package com.eg.eis.exception;
import java.util.Scanner;
public class EmployeeCheck {
	//TODO auto generated method stub
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//entering the employee name and salary details
		System.out.println("Enter the employee name:");
		String name=sc.nextLine();
		System.out.println("Enter the employee salary:");
		double salary=sc.nextDouble();
		// try block for EmployeeCheck.
		try {
			if(salary<3000)
				//if salary is less than 3000 then throw the exception
				throw new EmpException("Employee Salary is less than 3000 hence not eligible");
			else
				System.out.println(name+" your eligible");

		}
		/**
		 * catch block to handle the exception clause by try block.
		 */
		catch (EmpException e) {
			System.out.println(e.toString());
		}
	}
}
