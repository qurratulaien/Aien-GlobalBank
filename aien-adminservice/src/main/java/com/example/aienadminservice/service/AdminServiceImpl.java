package com.example.aienadminservice.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aienadminservice.dao.AccountDao;
import com.example.aienadminservice.dao.BranchDao;
import com.example.aienadminservice.dao.CustomerDao;
import com.example.aienadminservice.dao.LoanDao;
import com.example.aienadminservice.dao.TransactionDao;
import com.example.aienadminservice.model.Account;
import com.example.aienadminservice.model.Branch;
import com.example.aienadminservice.model.Customer;
import com.example.aienadminservice.model.Loan;
import com.example.aienadminservice.model.Transaction;


@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	CustomerDao customerdao;
	@Autowired
	AccountDao accountdao;
	@Autowired
	BranchDao branchdao;
	@Autowired
	LoanDao loandao;
	@Autowired
	TransactionDao transactiondao;
	@Override
	public String deleteCustomer(String CUSTOMER_NUMBER) {
		customerdao.deleteById(CUSTOMER_NUMBER);
		return "customer is deleted";
	}
	
	@Override
	public Branch addBranch(Branch branch) {
		return branchdao.save(branch);
	}
	
	@Override
	public String deleteBranch(String branch_id) {
		branchdao.deleteById(branch_id);
		return "branch is deleted";
	}
	
	@Override
	public Account createAccount(Account account) {
		return accountdao.save(account);
	}
	
	@Override
	public String deleteAccount(String account_number) {
		accountdao.deleteById(account_number);
		return "account is deleted";
	}
	@Override
	public List<Customer> showAllCustomers(){
		return customerdao.findAll();
	}
	@Override
	public List<Branch> showAllBranches(){
		return branchdao.findAll();	
	}
	@Override
	public List<Loan> showAllLoans(){
		return loandao.findAll();
	}
	@Override
	public Loan applyLoan(Loan loan) {
		return loandao.save(loan);
	}
	@Override
	public Transaction doTransaction(Transaction transaction) {
		return transactiondao.save(transaction);
	}
	@Override
	public List<Transaction> searchByAccountNumber(String account_number){
		return transactiondao.searchByAccountNumber(account_number);
	}
}
