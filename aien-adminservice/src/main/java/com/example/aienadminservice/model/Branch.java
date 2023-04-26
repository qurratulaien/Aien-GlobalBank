package com.example.aienadminservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="branch_master")
public class Branch {
	@Id
	String branch_id;
	String branch_name;
	String branch_city;
	public Branch() {
		
	}
	public Branch(String branch_id, String branch_name, String branch_city) {
		super();
		this.branch_id = branch_id;
		this.branch_name = branch_name;
		this.branch_city = branch_city;
	}
	public String getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getBranch_city() {
		return branch_city;
	}
	public void setBranch_city(String branch_city) {
		this.branch_city = branch_city;
	}
	
}
