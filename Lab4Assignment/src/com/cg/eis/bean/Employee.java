package com.cg.eis.bean;
/**
 * This Employee Component is used as a data traveler object from layer to layer
 * @author MANASA KAITHA
 *
 */
public class Employee {
	/**   id of the employee
	 */
	private int id;
	/**
	 *  name of the Employee
	 */
	private String name;
	/**
	 *  designation of the Employee must be either analyst,trainer or manager
	 */
	private String designation;
	/**
	 *  Insurance scheme of the Employee
	 */
	private String insuranceScheme;
	/**
	 *  salary of the Employee
	 */
	private double salary;
	public Employee(int id, String name, String designation,  double salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	
	public Employee() {
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	 
}
