package com.example.aienuserservice.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import com.example.aienuserservice.model.Customer;
import com.example.aienuserservice.model.LoanDto;
import com.example.aienuserservice.model.TransactionDto;

public interface UserService {
	public LoanDto applyLoan(LoanDto loan);
	public TransactionDto doTransaction(TransactionDto transactiondto);
	public Optional<TransactionDto> searchByAccountNumberandDate(String account_number,Date date_of_transaction);
	public List<TransactionDto> showAllTransactions();
	public List<TransactionDto> searchByAccountNumber(String account_number);
	public String deleteCustomer(String CUSTOMER_NUMBER);
	public List<Customer> showAllCustomers();
	public Customer registerCustomer(Customer customer);

}
