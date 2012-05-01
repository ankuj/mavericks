package com.myp.customer.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myp.customer.dao.UsersDAO;
import com.myp.customer.model.Users;
import com.myp.customer.model.Locations;

public class UsersDAOImpl extends HibernateDaoSupport implements UsersDAO {

	
	public void addUsers(Users users) {
		
		getHibernateTemplate().save(users);
		
	}

	@Override
	public List<Users> validateUsers(Users users) {
		String query= "from Users u where u.email="+"'"+users.getEmail()+"'";
		System.out.println("query:"+query);
		List<Users> userlist=new ArrayList<Users>();
		userlist=getHibernateTemplate().find(query);
		System.out.println("UserList::::"+userlist.size());
		System.out.println("ankuj");
		return userlist;
	}
	public List<String> getLocations() {
		String query= "from Locations l";
		System.out.println("query:"+query);
		List<String> loclist=new ArrayList<String>();
		loclist=getHibernateTemplate().find(query);
		System.out.println("loclist::::"+loclist.size());
		System.out.println("ankuj");
		return loclist;
	}
}
