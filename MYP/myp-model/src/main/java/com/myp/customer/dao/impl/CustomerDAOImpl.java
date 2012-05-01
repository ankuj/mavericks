package com.myp.customer.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myp.customer.dao.CustomerDAO;
import com.myp.customer.model.Customer;
 
public class CustomerDAOImpl extends HibernateDaoSupport implements CustomerDAO{
	
	//add the customer
	public void addCustomer(Customer customer){
		
		getHibernateTemplate().save(customer);
		
	}
	
	//return all the customers in list
	public List<Customer> listCustomer(){
		
		return getHibernateTemplate().find("from Customer");
		
	}
	
}