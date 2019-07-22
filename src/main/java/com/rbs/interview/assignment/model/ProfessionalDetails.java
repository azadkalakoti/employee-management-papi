package com.rbs.interview.assignment.model;

import java.util.Date;

/**
 * Model class for Employee's Personal details
 * @author Azad Singh
 *
 */
//@Entity
public class ProfessionalDetails {

	/**
	 * DEpartment details of employee
	 */
	private Department department;
	
	
	/**
	 * Salary of employee
	 */
	private double salary;
	
	/**
	 * Hiring date/date of joing of Emmployee
	 */
	private Date doj;
	
	/**
	 * Total Years of experience
	 */
	private double totalYearOfExperience;
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public double getTotalYearOfExperience() {
		return totalYearOfExperience;
	}

	public void setTotalYearOfExperience(double totalYearOfExperience) {
		this.totalYearOfExperience = totalYearOfExperience;
	}
}
