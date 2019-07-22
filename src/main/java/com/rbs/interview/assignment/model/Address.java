package com.rbs.interview.assignment.model;

/**
 * Address Details Object
 * @author Azad Singh
 *
 */
//@Entity
public class Address {

	/**
	 * addressLine1
	 */
	private String addressLine1;
	
	/**
	 * addressLine2
	 */
	private String addressLine2;
	
	/**
	 * addressLine3
	 */
	private String addressLine3;
	
	/**
	 * city
	 */
	private String city;
	
	/**
	 * state
	 */
	private String state;
	
	/**
	 * country
	 */
	private String country;
	
	/**
	 * pincode (ex. 411036)
	 */
	private String pincode;
	
	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
