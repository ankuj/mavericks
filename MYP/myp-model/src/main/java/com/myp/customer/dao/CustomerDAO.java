package com.myp.customer.dao;

import java.util.List;

import com.myp.customer.model.Customer;
 
public interface CustomerDAO{
	
	void addCustomer(Customer customer);
	
	List<Customer> listCustomer();
	
}