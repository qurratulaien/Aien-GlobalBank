package com.example.aienadminservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.aienadminservice.model.Loan;

@Repository
public interface LoanDao extends JpaRepository<Loan,String> {

}
