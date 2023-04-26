package com.example.aienadminservice.model;

import java.sql.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_master")
public class Customer {
	@Id
	String CUSTOMER_NUMBER;
	String FIRSTNAME;
	String middlename;
	String lastname;
	String CUSTOMER_CITY;
	String CUSTOMER_CONTACT_NO;
	String occupation;
	Date CUSTOMER_DATE_OF_BIRTH;
	public Customer() {
		
	}
	public Customer(String cUSTOMER_NUMBER, String fIRSTNAME, String middlename, String lastname, String cUSTOMER_CITY,
			String cUSTOMER_CONTACT_NO, String occupation, Date cUSTOMER_DATE_OF_BIRTH) {
		super();
		CUSTOMER_NUMBER = cUSTOMER_NUMBER;
		FIRSTNAME = fIRSTNAME;
		this.middlename = middlename;
		this.lastname = lastname;
		CUSTOMER_CITY = cUSTOMER_CITY;
		CUSTOMER_CONTACT_NO = cUSTOMER_CONTACT_NO;
		this.occupation = occupation;
		CUSTOMER_DATE_OF_BIRTH = cUSTOMER_DATE_OF_BIRTH;
	}
	
	public String getCUSTOMER_NUMBER() {
		return CUSTOMER_NUMBER;
	}
	public void setCUSTOMER_NUMBER(String cUSTOMER_NUMBER) {
		CUSTOMER_NUMBER = cUSTOMER_NUMBER;
	}
	public String getFIRSTNAME() {
		return FIRSTNAME;
	}
	public void setFIRSTNAME(String fIRSTNAME) {
		FIRSTNAME = fIRSTNAME;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCUSTOMER_CITY() {
		return CUSTOMER_CITY;
	}
	public void setCUSTOMER_CITY(String cUSTOMER_CITY) {
		CUSTOMER_CITY = cUSTOMER_CITY;
	}
	public String getCUSTOMER_CONTACT_NO() {
		return CUSTOMER_CONTACT_NO;
	}
	public void setCUSTOMER_CONTACT_NO(String cUSTOMER_CONTACT_NO) {
		CUSTOMER_CONTACT_NO = cUSTOMER_CONTACT_NO;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public Date getCUSTOMER_DATE_OF_BIRTH() {
		return CUSTOMER_DATE_OF_BIRTH;
	}
	public void setCUSTOMER_DATE_OF_BIRTH(Date cUSTOMER_DATE_OF_BIRTH) {
		CUSTOMER_DATE_OF_BIRTH = cUSTOMER_DATE_OF_BIRTH;
	}
}
