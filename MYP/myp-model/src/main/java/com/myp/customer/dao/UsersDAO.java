package com.myp.customer.dao;

import java.util.HashMap;
import java.util.List;

import com.myp.customer.model.Customer;
import com.myp.customer.model.Users;
import com.myp.customer.model.Locations;
public interface UsersDAO {

	void addUsers(Users users);
	List<Users> validateUsers(Users users);
	List<String> getLocations();

}
