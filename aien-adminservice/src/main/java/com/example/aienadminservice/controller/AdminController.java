package com.example.aienadminservice.controller;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aienadminservice.model.Account;
import com.example.aienadminservice.model.Branch;
import com.example.aienadminservice.model.Customer;
import com.example.aienadminservice.model.Loan;
import com.example.aienadminservice.model.Transaction;
import com.example.aienadminservice.service.AdminServiceImpl;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/Admin")
public class AdminController {
	@Autowired
	AdminServiceImpl service;
	
	@DeleteMapping("/deletecustomer/{CUSTOMER_NUMBER}")
	public String deleteCustomer(@PathVariable("CUSTOMER_NUMBER") String CUSTOMER_NUMBER) {
		return service.deleteCustomer(CUSTOMER_NUMBER);
	}
	@PostMapping("/addbranch")
	public Branch addBranch(@RequestBody Branch branch) {
		return service.addBranch(branch);
	}
	@DeleteMapping("/deletebranch/{branch-id}")
	public String deleteBranch(@PathVariable("branch_id") String branch_id) {
		return service.deleteBranch(branch_id);
	}
	@PostMapping("/addaccount")
	public Account addAccount(@RequestBody Account account) {
		return service.createAccount(account);
	}
	@DeleteMapping("deleteaccount/{account_number}")
	public String deleteAccount(@PathVariable("account_number") String account_number) {
		return service.deleteAccount(account_number);
	}
	@GetMapping("/showallcustomers")
	public List<Customer> showAllCustomers(){
		return service.showAllCustomers();
	}
	@GetMapping("/showallbranches")
	public List<Branch> showAllBranches(){
		return service.showAllBranches();
	}
	@GetMapping("/showallloans")
	public List<Loan> showAllLoans(){
		return service.showAllLoans();
	}
	@PostMapping("/applyloan")
	public Loan applyLoan(@RequestBody Loan loan) {
		return service.applyLoan(loan);
	}
	@PostMapping("/doTransaction")
	public Transaction doTransaction(@RequestBody Transaction transaction) {
		return service.doTransaction(transaction);
	}
	@GetMapping("/searchbyaccountnumber/{account_number}")
	public List<Transaction> searchByAccountNumber(@PathVariable("account_number") String account_number) {
		// TODO Auto-generated method stub
		return service.searchByAccountNumber( account_number);
	}
	
	
	
}
