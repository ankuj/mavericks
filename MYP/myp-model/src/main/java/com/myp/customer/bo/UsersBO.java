package com.myp.customer.bo;

import java.util.HashMap;
import java.util.List;

import com.myp.customer.model.Users;
import com.myp.customer.model.Locations;

public interface UsersBO {
	
	void addUser(Users users);
	List<Users> validateUsers(Users users);
	List<String> getLocations();

}
