
package com.myp.customer.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="locations")
public class Locations implements Serializable {
	
	
	private String cities;
	private List<String> locList;
	private String city;
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getLocList() {
		return locList;
	}

	public void setLocList(List<String> locList) {
		this.locList = locList;
	}

	public String getCities() {
		return cities;
	}

	public void setCities(String cities) {
		this.cities = cities;
	}

	public Locations()
	{
		
	}
	
	public Locations(String locations) {
		super();
		this.cities = cities;
	}


	
	
	
}
