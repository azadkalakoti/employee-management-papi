package com.rbs.interview.assignment.model.core;

import com.rbs.interview.assignment.model.Employee;

/**
 * Response class for Employee Details
 * @author Azad Singh
 *
 */
public class EmployeeDetailsResponse {

	/**
	 * Employee object
	 */
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
