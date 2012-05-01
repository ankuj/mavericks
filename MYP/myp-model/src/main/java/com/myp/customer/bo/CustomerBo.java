package com.myp.customer.bo;

import java.util.List;

import com.myp.customer.model.Customer;
 
public interface CustomerBo{
	
	void addCustomer(Customer customer);
	
	List<Customer> listCustomer();
	
}