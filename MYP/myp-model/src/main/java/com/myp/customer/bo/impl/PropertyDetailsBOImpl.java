package com.myp.customer.bo.impl;

import java.util.HashMap;
import java.util.List;

import com.myp.customer.bo.PropertyDetailsBO;
import com.myp.customer.dao.PropertyDetailsDAO;
import com.myp.customer.model.PropertyDetails;

public class PropertyDetailsBOImpl implements PropertyDetailsBO {
	
	PropertyDetailsDAO propertyDetailsDAO;

	/*public PropertyDetailsDAO getPropertyDetailsDAO() {
		return propertyDetailsDAO;
	}*/

	public void setPropertyDetailsDAO(PropertyDetailsDAO propertyDetailsDAO) {
		this.propertyDetailsDAO = propertyDetailsDAO;
	}

	@Override
	public List<PropertyDetails> listProperty(PropertyDetails propertyDetails) {
		// TODO Auto-generated method stub
		 return propertyDetailsDAO.addProperty(propertyDetails); 
	}

	public List<PropertyDetails> displayProperty(){
		return propertyDetailsDAO.displayProperty();
		
	}

}
