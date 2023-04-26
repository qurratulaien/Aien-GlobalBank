package com.example.aienadminservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.aienadminservice.model.Account;

@Repository
public interface AccountDao extends JpaRepository<Account,String>{

}
