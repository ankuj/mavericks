package com.myp.customer.bo;

import java.util.HashMap;
import java.util.List;

import com.myp.customer.model.PropertyDetails;
import com.myp.customer.model.Users;

public interface PropertyDetailsBO {

	List<PropertyDetails> listProperty(PropertyDetails propertyDetails);
	List<PropertyDetails> displayProperty();
}
