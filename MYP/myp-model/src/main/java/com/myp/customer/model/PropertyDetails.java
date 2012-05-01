package com.myp.customer.model;

import java.util.ArrayList;
import java.util.Date;

public class PropertyDetails {

	 private String pid=null;
	 private String  state=null;
	  private String city=null;
	  private String zone=null;
	  private String locality=null;
	  private String address=null;
	  private String bdroom=null;
	  private String btroom=null;
	  private String dimension=null;
	  private String garfd=null;
	  private String garvol=null;
	  private String builtfloor=null;
	  private String price=null;
	  private String constrationYear=null;
	  private String constrationType=null;
	  private String paymentratio=null;
	  
	  private String sellmode=null;
	  private String comments=null;
	  private ArrayList<String> interest=null;
	  
	  public PropertyDetails()
		{
			
		}
		
		public PropertyDetails(String pid, String  state, String city, String zone,String locality, String address, String bdroom, String btroom, String dimesion, String garfd,String garvol,String floor,String price,String constrationYear,String constrationType,String paymentratio, String mode, String comments, ArrayList<String> interest) {
			super();
			this.pid=pid;
			this.state=state;
			this.city=city;
			this.zone=zone;
			this.locality=locality;
			this.address=address;
			this.bdroom=bdroom;
			this.btroom=btroom;
			this.dimension=dimesion;
			this.garfd=garfd;
			this.garvol=garvol;
			this.builtfloor=floor;
			this.price=price;
			this.constrationYear=constrationYear;
			this.constrationType=constrationType;
			this.paymentratio=paymentratio;
			this.sellmode=mode;
			this.comments=comments;
			this.setInterest(interest);
		}
	  
	  
	  
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBdroom() {
		return bdroom;
	}
	public void setBdroom(String bdroom) {
		this.bdroom = bdroom;
	}
	public String getBtroom() {
		return btroom;
	}
	public void setBtroom(String btroom) {
		this.btroom = btroom;
	}
	
	public String getGarfd() {
		return garfd;
	}
	public void setGarfd(String garfd) {
		this.garfd = garfd;
	}
	public String getGarvol() {
		return garvol;
	}
	public void setGarvol(String garvol) {
		this.garvol = garvol;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getConstrationYear() {
		return constrationYear;
	}
	public void setConstrationYear(String constrationYear) {
		this.constrationYear = constrationYear;
	}
	public String getConstrationType() {
		return constrationType;
	}
	public void setConstrationType(String constrationType) {
		this.constrationType = constrationType;
	}
	public String getPaymentratio() {
		return paymentratio;
	}
	public void setPaymentratio(String paymentratio) {
		this.paymentratio = paymentratio;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getBuiltfloor() {
		return builtfloor;
	}

	public void setBuiltfloor(String builtfloor) {
		this.builtfloor = builtfloor;
	}

	public String getSellmode() {
		return sellmode;
	}

	public void setSellmode(String sellmode) {
		this.sellmode = sellmode;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public void setInterest(ArrayList<String>interest2) {
		this.interest = interest;
	}

	public ArrayList<String> getInterest() {
		return interest;
	}
}
