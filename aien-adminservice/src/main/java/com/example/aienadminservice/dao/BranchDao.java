package com.example.aienadminservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.aienadminservice.model.Branch;

@Repository
public interface BranchDao extends JpaRepository<Branch,String> {

}
