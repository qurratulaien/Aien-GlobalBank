package com.example.aienuserservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.aienuserservice.model.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends JpaRepository<Customer,String>{

}
