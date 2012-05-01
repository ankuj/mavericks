package com.myp.customer.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myp.customer.dao.PropertyDetailsDAO;
import com.myp.customer.model.PropertyDetails;
import com.myp.customer.model.Users;

public class PropertyDetailsDAOImpl extends HibernateDaoSupport implements PropertyDetailsDAO  {

	List abc=new ArrayList<String>();

	@Override
	public List<PropertyDetails> addProperty(PropertyDetails propertyDetails) {
		// TODO Auto-generated method stub

		propertyDetails.setPid("123");
		System.out.println("PropertyIDS");
		System.out.println("Before save in DaoImpl");
		getHibernateTemplate().save(propertyDetails);
		System.out.println("After save in DaoImpl");
		
		abc.add("SS");
		
		return abc;
	}

	@SuppressWarnings("unchecked")
	public List<PropertyDetails> displayProperty()
	{
		List<PropertyDetails>propertyList=new ArrayList<PropertyDetails>();
		String query= "from PropertyDetails pd ";
		System.out.println("query:"+query);
		propertyList=getHibernateTemplate().find(query);
		System.out.println("propertyList::::"+propertyList.size());
		System.out.println("ankuj");
		return propertyList;
	}
	
	

	

}
