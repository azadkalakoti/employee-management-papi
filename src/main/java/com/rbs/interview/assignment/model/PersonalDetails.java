package com.rbs.interview.assignment.model;

import java.util.Date;

import javax.persistence.Entity;

/**
 * Model class for Employee's Persona details
 * @author Azad Singh
 *
 */
//@Entity
public class PersonalDetails {

	/**
	 * First name of employee
	 */
	private String firstName;

	/**
	 * First name of employee
	 */
	private String lastName;
	
	/**
	 * Date of birth
	 */
	private Date dob;
	
	/**
	 * Gender(Male/Female)
	 */
	private Gender gender;
	
	/**
	 * Contact details of employee
	 */
	private ContactDetails contactDetails;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}

}
