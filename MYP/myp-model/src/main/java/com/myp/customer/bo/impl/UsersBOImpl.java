package com.myp.customer.bo.impl;

import java.util.HashMap;
import java.util.List;

import com.myp.customer.bo.UsersBO;
import com.myp.customer.dao.UsersDAO;
import com.myp.customer.model.Customer;
import com.myp.customer.model.Users;
import com.myp.customer.model.Locations;

public class UsersBOImpl implements UsersBO {
	
	UsersDAO usersDAO;


	public void setUsersDAO(UsersDAO usersDAO) {
		this.usersDAO = usersDAO;
	}


	public void addUser(Users users) {
	
		usersDAO.addUsers(users);
	
}


	@Override
	public List<Users> validateUsers(Users users) {
		return usersDAO.validateUsers(users); 
		
	}
	public List<String> getLocations() {
		return (List<String>)usersDAO.getLocations(); 
		
	}
	

}
