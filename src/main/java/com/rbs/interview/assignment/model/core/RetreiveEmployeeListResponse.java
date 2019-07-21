package com.rbs.interview.assignment.model.core;

import java.util.List;

import com.rbs.interview.assignment.model.Employee;

/**
 * Employee Details Service response class
 * @author Azad Singh
 *
 */
public class RetreiveEmployeeListResponse {

	private List<Employee> empList;

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
}
