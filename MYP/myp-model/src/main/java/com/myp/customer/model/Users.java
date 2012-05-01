package com.myp.customer.model;

import java.io.Serializable;
import java.util.Date;



public class Users implements Serializable {
	
	
	private Long id;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private String mobile;
	private String landline;
	private Date contacttime;
	private Date loginon;
	private Character passwordreset;
	private String type;
	public Users()
	{
		
	}
	
	public Users(String fname, String lname, String email, String password,
			String mobile, String landline, Date contacttime, Date loginon,
			Character passwordreset,String type) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.landline = landline;
		this.contacttime = contacttime;
		this.loginon = loginon;
		this.passwordreset = passwordreset;
	    this.type=type;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getLandline() {
		return landline;
	}

	public void setLandline(String landline) {
		this.landline = landline;
	}

	public Date getContacttime() {
		return contacttime;
	}

	public void setContacttime(Date contacttime) {
		this.contacttime = contacttime;
	}

	public Date getLoginon() {
		return loginon;
	}

	public void setLoginon(Date loginon) {
		this.loginon = loginon;
	}

	public Character getPasswordreset() {
		return passwordreset;
	}

	public void setPasswordreset(Character passwordreset) {
		this.passwordreset = passwordreset;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
