package com.rbs.interview.assignment.model;

/**
 * Contact details object
 * @author Azad Singh
 *
 */
public class ContactDetails {

	/**
	 * personal mobile number
	 */
	//@Id
	private String mobileNumber;
	
	/**
	 * office desk phone number
	 */
	private String officeLine;
	
	/**
	 * home mobile number
	 */
	private String homeMobileNumber;
	
	/**
	 * Present residence address details
	 */
	private Address presentAddress;
	
	/**
	 * Permanent residence address details
	 */
	private Address permanentAddress;
	
	/**
	 * Office address details
	 */
	private Address officeAddress;

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getOfficeLine() {
		return officeLine;
	}

	public void setOfficeLine(String officeLine) {
		this.officeLine = officeLine;
	}

	public String getHomeMobileNumber() {
		return homeMobileNumber;
	}

	public void setHomeMobileNumber(String homeMobileNumber) {
		this.homeMobileNumber = homeMobileNumber;
	}

	public Address getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(Address presentAddress) {
		this.presentAddress = presentAddress;
	}

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
}
