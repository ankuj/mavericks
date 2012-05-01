<%@ page language="java" import="java.util.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/style.css" type="text/css" media="screen"/>
<link href='http://fonts.googleapis.com/css?family=Mrs+Sheppards&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
<script src="js/cufon-yui.js" type="text/javascript"></script>
<script src="js/cufon-replace.js" type="text/javascript"></script>
<script src="js/Myriad_Pro_300.font.js" type="text/javascript"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aasov</title>
</head>
<body>
<s:bean name="com.myp.customer.model.Locations" var="hello">
  <s:param name="cities">Hello Bean Tag</s:param>
</s:bean>
 
The HelloBean's msg property value : <s:property value="#hello.cities"/>
The HelloBean's msg property value : <s:property value="#session.city"/>
   <center><table>
   <s:form action="saveSelectValidation" method="post" validate="true"  >
  <tr>
    <td><s:textfield name="name" label="Name" key="label.username" value="" size="20" /></td>
   <td><s:textarea name="address" label="Address" key="address" value="" cols="50" rows="5" /></td>
   <td><s:textfield name="phone" label="Phone No" key="phone" value="" size="10" /></td>
   <td><s:textfield name="email" label="email" key="email" value="" size="10" /></td>
   <td><s:textfield name="pcontact" label="Preferred Contact Time" key="pcontact" value="" size="10" /></td>
  <td><s:radio label="Do you wish to " name="yourAnswer" list="#{'1':'Buy','2':'Sell','3':'Invest'}" key="yourAnswer" value="1" /></td>
  <td><s:select label="Type of property" name="top" list="#{'1':'Apartment','2':'Villa','3':'Other'}" key="top" value="1" /></td>
  <td><s:select label="Type of property" name="top" list="#{'1':'Apartment','2':'Villa','3':'Other'}" key="top" value="1" /></td>
  <td><s:select label="Type of property" name="top" list="#{'1':'Apartment','2':'Villa','3':'Other'}" key="top" value="1" /></td>
  <td><s:label>Zone</s:label></td>
  <td><s:label>Area</s:label></td>
  <td><s:select label="Type of property" name="top" list="#{'1':'Apartment','2':'Villa','3':'Other'}" key="top" value="1" /></td>
  <td><s:select label="Price Range" name="Range" list="#{'1':'15,00,000-25,00,000','2':'25,00,000-50,00,000'}" key="Range" value="1" /></td>
  <td><s:select label="Number of Bedrooms" name="Bdroom" list="#{'1':'1','2':'2','3':'3','4':'4','5':'5','6':'>5'}" key="Bdroom" value="1" /></td>
<td><s:select label="Number of Bathrooms" name="Bthroom" list="#{'1':'1','2':'2','3':'3','4':'4','5':'5','6':'>5'}" key="Bthroom" value="1" /></td>
<td><s:label>Cash Cheque Ratio</s:label><s:textfield name="Min"  value="" size="3" /><s:textfield name="Max"  value="" size="3" /></td>
 
 </tr>
 <tr><td><s:submit name="submit" value="Submit" cssClass="bt_login" /></td></tr>
</s:form>
<s:debug />
  </table>
  </center>
 <s:property value="usingArrayList"/>
</body>
</html>