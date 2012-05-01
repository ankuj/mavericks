package com.myp.action.login;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.mchange.v2.codegen.bean.Property;
import com.myp.customer.bo.PropertyDetailsBO;
import com.myp.customer.bo.UsersBO;
import com.myp.customer.model.PropertyDetails;
import com.myp.customer.model.Users;
import com.myp.customer.model.Locations;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
//import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion.User;

@SuppressWarnings("unchecked")
public class LoginAction  implements ModelDriven,SessionAware,Preparable {
//	public class LoginAction extends ActionSupport{

	Users users = new Users();
	Locations locationBean=new Locations();
	PropertyDetails propertydetailsBean=new PropertyDetails();
	List<Users> usersList=new ArrayList<Users>();
	List<String> locations ;
	Map<String,Object> session ;
	UsersBO usersBo;
	private String name;
	PropertyDetailsBO propertydetailsBO;
	private String cities;
	List<PropertyDetails> propertydetails=new ArrayList<PropertyDetails>();
	public String getCities() {
		return cities;
	}

	/*public String execute()throws Exception{
		locations=new ArrayList<String>();
		locations= usersBo.getLocations();
		return "success";

		  }
*/
	public void setCities(String cities) {
		this.cities = cities;
	}



	public List<String> getLocList() {
		return locList;
	}



	public void setLocList(List<String> locList) {
		this.locList = usersBo.getLocations();
	}





	private List<String> locList;	

	/*public void setUsersBO(UsersBO usersBO) {
		this.usersBO = usersBO;
	}*/


	public Object getModel() {
		return users;
	}
	


	public void setUsersBo(UsersBO usersBo) {
		this.usersBo = usersBo;
	}


	//save customer
	public String addUsers() throws Exception{

		//save it
		users.setLoginon(new Date());
		usersBo.addUser(users);
		System.out.println("First Name:"+users.getFname());
		return "success";

		//reload the customer list

	}

	public String validateuser() throws Exception{
		String result=null;
		String email=users.getEmail();
		String password=users.getPassword();
		List<Users> userobject= usersBo.validateUsers(users);
		Users user=userobject.get(0);
		//userobject.getPassword().equals(password)
		if(user.getPassword().equals(password))
				{
			result="success";
			System.out.println("FirstName:"+user.getFname());
			
				}
		else
		{
			result="fail";
		}
		
		Map session = ActionContext.getContext().getSession();
		session.put("logged-in","true");
		session.put("fname", user.getFname());
		return result;
	}

	/*public String registerProperty() throws Exception{
		
		String result=null;
		System.out.println("PropertyDetailsAction"+propertyDetails);
		System.out.println(propertyDetails.getAddress());
		List<PropertyDetails> propertyDetailsObject= propertyDetailsBO.listProperty(propertyDetails);
		if(propertyDetailsObject!=null)
		{
			result="success";
		}
		return result;
	}*/

	public List<Users> getUsersList() {
		return usersList;
	}


	public void setUsersList(List<Users> usersList) {
		this.usersList = usersList;
	}
	
	public String saveSelect() throws Exception{
		String result=null;
			result="success";
		return result;
	}
	
	public String loadLocations() throws Exception{
		String result=null;
		List<String> locations= usersBo.getLocations();
		if(locations.size()>0)
		{
			result="success";
			locations.add("ankuj");
			locationBean.setLocList(locations);
		}
		else
			result="fail";

//		locations.add("ankuj");
		locationBean.setLocList(locations);
		locationBean.setCities("delhi");
		session.put("city", locations);
System.out.println("ankui@@"+ locationBean.getCities());
		return "success";
	}





	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session=session;
		
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		
		session.put("1", new Object());
	}

	public String selectType() throws Exception {
		// TODO Auto-generated method stub
		String forward=null;
		if(users.getType().equalsIgnoreCase("1"))
				forward="buyer";
		
		else if(users.getType().equalsIgnoreCase("2"))
				forward="seller";
		
		else
			forward="investor";
		System.out.println("users.getType()"+users.getType());
		return forward;
	}


	/*@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		
	}*/
	
	public String addProperty() throws Exception{
		String result=null;
			result="success";
		return result;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name1)
	{
		this.name="ankuj";
	}
}
