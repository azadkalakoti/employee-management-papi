package com.rbs.interview.assignment.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Department Model class
 * @author Azad Singh
 *
 */
@Entity
public class Department {

	/**
	 * Name of department
	 */
	private String departmentName;
	
	/**
	 * Department code
	 */
	@Id
	private String departmentCode;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	
}
