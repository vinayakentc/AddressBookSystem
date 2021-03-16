package com.addressbooksystem;

import java.io.Serializable;

public class Contact implements Serializable{
	private static final long serialVersionUID = 1L;
	private String firstName, lastName, city, state;
	private int zipcode, phNo;
	private String address, email;
	
	
	public Contact(String firstName, String lastName, String city, String state, int zipcode, int phNo,
			String address, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.phNo = phNo;
		this.address = address;
		this.email = email;
	}	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastname) {
		this.lastName = lastname;
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
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public int getPhNo() {
		return phNo;
	}
	public void setPhNo(int phNo) {
		this.phNo = phNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public boolean equals(Object o) {
		Contact contact = (Contact) o;
		if((this.firstName.compareToIgnoreCase(contact.getFirstName()) == 0) && (this.lastName.compareToIgnoreCase(contact.getLastName()) == 0))
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		return this.firstName + " " + this.lastName + " | " + this.address + " | " + this.city + " | " + this.state + " | " + this.zipcode
				+ " | " + this.phNo + " | " + this.email;
	}
}