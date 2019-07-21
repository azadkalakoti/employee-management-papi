package com.rbs.interview.assignment.model.core;

import java.util.List;

import com.rbs.interview.assignment.model.Employee;

/**
 * Request class for Save Employee request
 * @author Azad Singh
 *
 */
public class SaveEmployeeListRequest {

	private List<Employee> empList;

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	
}
