package com.example.aienuserservice.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.aienuserservice.dao.CustomerDao;
import com.example.aienuserservice.model.Customer;
import com.example.aienuserservice.model.LoanDto;
import com.example.aienuserservice.model.Proxy;
import com.example.aienuserservice.model.TransactionDto;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	CustomerDao customerdao;
	@Autowired
	Proxy proxy;
	
	@Override
	public Customer registerCustomer(Customer customer) {
		return customerdao.save(customer);
	}
	
	@Override
	public LoanDto applyLoan(LoanDto loan) {
		return proxy.applyLoan(loan);
	}
	
	@Override
	public TransactionDto doTransaction(TransactionDto transactiondto) {
		return proxy.doTransaction(transactiondto);
	}
	
	@Override
	public Optional<TransactionDto> searchByAccountNumberandDate(String account_number,Date date_of_transaction){
		return proxy.searchByAccountNumberandDate(account_number,date_of_transaction);
	}
	
	@Override
	public List<TransactionDto> showAllTransactions(){
		return proxy.showAllTransactions();
	}
	
	@Override
	public List<TransactionDto> searchByAccountNumber(String account_number){
		return proxy.searchByAccountNumber(account_number);
	}
	@Override
	public String deleteCustomer(String CUSTOMER_NUMBER) {
		// TODO Auto-generated method stub
		customerdao.deleteById(CUSTOMER_NUMBER);
		return "customer  is deleted";
	}

	@Override
	public List<Customer> showAllCustomers() {
		// TODO Auto-generated method stub
		return customerdao.findAll();
	}

}

