package com.example.aienadminservice.dao;

import org.springframework.data.jpa.repository.Query;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.aienadminservice.model.Transaction;

@Repository
public interface TransactionDao extends JpaRepository<Transaction,String>{
	@Query("from Transaction t where t.account_number=?1")
	public List<Transaction> searchByAccountNumber(String account_number);
}
