package com.demo.heroku.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.heroku.model.Customer;
import com.demo.heroku.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@GetMapping("/get/customers")
	public ResponseEntity<ArrayList<Customer>> getAllCustomers() {
		return new ResponseEntity<>(service.getCustomerDetails(), HttpStatus.OK);
	}
}
