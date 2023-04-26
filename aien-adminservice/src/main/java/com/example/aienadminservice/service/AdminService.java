package com.example.aienadminservice.service;

import java.util.List;

import com.example.aienadminservice.model.Account;
import com.example.aienadminservice.model.Branch;
import com.example.aienadminservice.model.Customer;
import com.example.aienadminservice.model.Loan;
import com.example.aienadminservice.model.Transaction;

public interface AdminService {
	public String deleteCustomer(String CUSTOMER_NUMBER);
	public Branch addBranch(Branch branch);
	public String deleteBranch(String branch_id);
	public Account createAccount(Account account);
	public String deleteAccount(String account_number);
	public List<Customer> showAllCustomers();
	public List<Branch> showAllBranches();
	public List<Loan> showAllLoans();
	
	public Loan applyLoan(Loan loan);
	public Transaction doTransaction(Transaction transaction);
	public List<Transaction> searchByAccountNumber(String account_number);
}
