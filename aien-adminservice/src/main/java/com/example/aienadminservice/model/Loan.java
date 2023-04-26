package com.example.aienadminservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="loan_details")
public class Loan {
	@Id
	String customer_number;
	String branch_id;
	int loan_amount;
	public Loan() {
		
	}
	public Loan(String customer_number, String branch_id, int loan_amount) {
		super();
		this.customer_number = customer_number;
		this.branch_id = branch_id;
		this.loan_amount = loan_amount;
	}
	public String getCustomer_number() {
		return customer_number;
	}
	public void setCustomer_number(String customer_number) {
		this.customer_number = customer_number;
	}
	public String getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
	}
	public int getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(int loan_amount) {
		this.loan_amount = loan_amount;
	}
	
}
