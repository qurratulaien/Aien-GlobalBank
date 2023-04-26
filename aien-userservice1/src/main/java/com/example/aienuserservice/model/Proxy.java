package com.example.aienuserservice.model;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("AIEN-ADMINSERVICE/Admin")
public interface Proxy {
	
	@PostMapping("/applyloan")
	public LoanDto applyLoan(@RequestBody LoanDto loan);
	
	@PostMapping("/doTransactions")
	public TransactionDto doTransaction(@RequestBody TransactionDto transactiondto);
	
	@GetMapping("/searchbynumanddate/{account_number}/{date_of_transaction}")
	public Optional<TransactionDto> searchByAccountNumberandDate(@PathVariable("account_number") String account_number,@PathVariable("date_of_transaction") Date date_of_transaction);

	@GetMapping("/showalltransactions")
	public List<TransactionDto> showAllTransactions();
	
	@GetMapping("/searchbyaccountnumber/{account_number}")
	public List<TransactionDto> searchByAccountNumber(@PathVariable("account_number") String account_number);



}

