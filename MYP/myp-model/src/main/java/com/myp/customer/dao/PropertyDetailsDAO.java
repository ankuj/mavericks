package com.myp.customer.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myp.customer.model.PropertyDetails;
import com.myp.customer.model.Users;

public interface PropertyDetailsDAO {
	
	List<PropertyDetails> addProperty(PropertyDetails propertyDetails);
	List<PropertyDetails>displayProperty();
}
