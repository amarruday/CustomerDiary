package com.demo.heroku.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.demo.heroku.model.Customer;
import com.demo.heroku.model.Document;

@Service
public class CustomerService {
	public ArrayList<Customer> getCustomerDetails() {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setCustomerName("Amar Patil");
		customer1.setEmail("amarruday@gmail.com");
		Document doc1 = new Document();
		doc1.setDocId(1);
		doc1.setDocType("PDF");
		doc1.setDoc("example.pdf");
		customer1.setDocument(doc1);

		Customer customer2 = new Customer();
		customer2.setId(2);
		customer2.setCustomerName("Pavan Patil");
		customer2.setEmail("pavan@gmail.com");

		Document doc2 = new Document();
		doc2.setDocId(2);
		doc2.setDocType("DOCX");
		doc2.setDoc("example.docx");
		customer2.setDocument(doc2);

		customers.add(customer1);
		customers.add(customer2);
		return customers;
	}
}
