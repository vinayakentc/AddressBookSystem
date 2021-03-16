package com.addressbooksystem;

import java.io.Serializable;

public class Contact implements Serializable {
    private static final long serialVersionUID = 1L;
    @CsvBindByPosition(position = 3)
    private String firstName;
    @CsvBindByPosition(position = 4)
    private String lastName;
    @CsvBindByPosition(position = 1)
    private String city;
    @CsvBindByPosition(position = 6)
    private String state;
    @CsvBindByPosition(position = 7)
    private String zipcode;
    @CsvBindByPosition(position = 5)
    private String phNo;
    @CsvBindByPosition(position = 0)
    private String address;
    @CsvBindByPosition(position = 2)
    private String email;


    public Contact(String firstName, String lastName, String city, String state, String zipcode, String phNo,
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

    public Contact() {
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
    public String getZipcode() {
        return zipcode;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    public String getPhNo() {
        return phNo;
    }
    public void setPhNo(String phNo) {
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