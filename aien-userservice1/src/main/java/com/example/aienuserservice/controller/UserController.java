package com.example.aienuserservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.aienuserservice.model.Customer;
import com.example.aienuserservice.service.UserService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(name="User")
public class UserController {

	@Autowired
	UserService service;
	
	@GetMapping("/registercustomer")
	public Customer registerCustomer(@RequestBody Customer customer) {
		return service.registerCustomer(customer);
	}
	@DeleteMapping("/deletecustomer")
	public String deleteCustomer(String CUSTOMER_NUMBER ) {
		service.deleteCustomer(CUSTOMER_NUMBER);
		return "customer deleted";
	}
	
	@GetMapping("/allcustomers")
	public List<Customer> allCustomers(){
		return service.showAllCustomers();
		
	}

	
}
