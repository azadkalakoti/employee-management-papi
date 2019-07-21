package com.rbs.interview.assignment.model;

/**
 * Employee object model class
 * @author Azad Singh
 *
 */
//@Entity
public class Employee1 {
	
	/**
	 * EmployeeId
	 */
	//@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private String empId;
	
	/**
	 * Employee's personal details object
	 */
	private PersonalDetails empPersonalDetails;
	
	/**
	 * Employee's professional details object
	 */
	private ProfessionalDetails empProfessionalDetails;

	
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	
	public PersonalDetails getEmpPersonalDetails() {
		return empPersonalDetails;
	}

	public void setEmpPersonalDetails(PersonalDetails empPersonalDetails) {
		this.empPersonalDetails = empPersonalDetails;
	}
	
	public ProfessionalDetails getEmpProfessionalDetails() {
		return empProfessionalDetails;
	}

	public void setEmpProfessionalDetails(ProfessionalDetails empProfessionalDetails) {
		this.empProfessionalDetails = empProfessionalDetails;
	}

}
