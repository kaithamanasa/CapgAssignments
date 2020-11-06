package com.cg.eis.service;
import java.util.*;
import com.cg.eis.bean.Employee;

public class EmployeeImplementation implements EmployeeService {
    Scanner sc=new Scanner(System.in);
	@Override
	public Employee getDetails() {
		System.out.println("Enter the employee id");
		int id =sc.nextInt();
		System.out.println("Enter the employee name");
		String name=sc.next();
		System.out.println("Enter the employee designation (anaylst,trainer,manager)");
		String designation=sc.next();
		System.out.println("Enter the employee salary");
		double salary=sc.nextDouble();
		Employee e=new Employee(id,name,designation,salary);
		return e;
	}

	@Override
	public String getScheme(double salary, String designation) {
		if(salary>=10000 && salary<=15000 && designation.equalsIgnoreCase("analyst"))
			return "Health insurance";
		else if(salary>=15000 && salary<=25000 && designation.equalsIgnoreCase("trainer"))
			return "liability insurance";
		else if(salary>=25000 && salary<=40000 && designation.equalsIgnoreCase("manager"))
			return "wealth insurance";
		else
			return "No Scheme available";
			
	}

	@Override
	public void DisplayDetails(Employee e) {
	    System.out.println("-----------Employee Details---------");
	    System.out.println("ID: "+e.getId());
		System.out.println("NAME: "+e.getName());
		System.out.println("DESIGNATION: "+e.getDesignation());
		System.out.println("SALARY: "+e.getSalary());
		System.out.println("Insurance Scheme: "+e.getInsuranceScheme());
	}
}
