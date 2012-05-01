package com.myp.action.login;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.myp.customer.bo.PropertyDetailsBO;
import com.myp.customer.model.PropertyDetails;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

@SuppressWarnings("unchecked")
/*public class PropertyDetailsAction extends ActionSupport implements ModelDriven {*/
	public class PropertyDetailsAction extends ActionSupport {
	
	PropertyDetails propertydetailsBean=new PropertyDetails();	
	private List<String> comboMeals;
	private static List<String> songs = new ArrayList<String>();
	List<PropertyDetails> searchList=null;
	public void setSearchList(List<PropertyDetails> searchList) {
		this.searchList = searchList;
	}

	static{
		songs.add("hello");
	}
	public List<String> getSongs() {
		return songs;
	}
	
	public List<PropertyDetails> getSearchList() {
		return searchList;
	}
 
	public void setComboMeals(List<String> comboMeals) {
		this.comboMeals = comboMeals;
	}
	/*@Override
	public Object getModel() {
		// TODO Auto-generated method stub
		return propertyDetails;
	}*/
	PropertyDetails propertyDetails=new PropertyDetails();
		
	 PropertyDetailsBO propertyDetailsBO ;

	private String name; 
	
	
public String registerProperty() throws Exception{
		
		String result=null;
		System.out.println("PropertyDetailsAction"+propertyDetails);
		System.out.println(propertyDetails.getAddress());
		List<PropertyDetails> propertyDetailsObject= propertyDetailsBO.listProperty(propertyDetails);
		if(propertyDetailsObject!=null)
		{
			result="success";
		}
		return result;
	}

public String execute()throws Exception{
	ValueStack stack = ActionContext.getContext().getValueStack();
    Map<String, Object> context = new HashMap<String, Object>();

    context.put("key1", new String("This is key1")); 
    context.put("key2", new String("This is key2"));
    songs.add("hello");
    stack.push(context);
    
    searchList=propertyDetailsBO.displayProperty( );
    stack.push(searchList);
    comboMeals = new ArrayList<String>();
	comboMeals.add("Snack Plate");
	comboMeals.add("Dinner Plate");
	comboMeals.add("Colonel Chicken Rice Combo");
	songs.add("hello");
return "success";




  }


	public PropertyDetailsBO getPropertyDetailsBO() {
		return propertyDetailsBO;
	}

	public void setPropertyDetailsBO(PropertyDetailsBO propertyDetailsBO) {
		this.propertyDetailsBO = propertyDetailsBO;
	}
	
public String displayProperty() throws Exception{
		List<PropertyDetails> searchList=propertyDetailsBO.displayProperty( );
		return "success";
	}
public String getName()
{
	return name;
}
public void setName(String name1)
{
	this.name="ankuj";
}

public String showInterest() throws Exception{
	
	ValueStack stack = ActionContext.getContext().getValueStack();
	List<PropertyDetails> interestList=new ArrayList<PropertyDetails>();
	Object interest=stack.pop();
	System.out.println("interest()"+interest.toString());
	//interestList=(List)interest;
	for(int i=0;i<searchList.size();i++)
	{
		PropertyDetails pd=searchList.get(i);
		System.out.println("pd.getInterest()"+pd.getInterest());
		System.out.println("pd.getPid()"+pd.getPid());
	}

    Map<String, Object> parameters = ActionContext.getContext().getParameters();
Iterator<String> it = parameters.keySet().iterator();

while(it.hasNext()) {
String key = it.next().toString();
System.out.println("key&&"+key);
String[] value = (String[])parameters.get(key);
for(int i=0;i<value.length;i++)
System.out.println("value$$$"+value[i]);

           // print or do something with the key/value pair...

}


	return "success";
}

}
