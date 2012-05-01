<%@ page contentType="text/html; charset=UTF-8" %>
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
<!--<s:bean id="radio" name="com.myp.Users"></s:bean>-->
   
   <center><table>
   <s:form action="addPropertyAction" validate="false" method="true">
  <tr>
    <td><s:select label="state" name="state" list="#{'1':'DELHI','2':'GURGAON'}" key="top" value="1" /></td>
   <td><s:select label="city" name="city" list="#{'1':'Delhi','2':'GURGAON'}" key="top" value="1" /></td>
   <td><s:select label="zone" name="zone" list="#{'1':'North','2':'South'}" key="top" value="1" /></td>
   <td><s:select label="locality" name="locality" list="#{'1':'Paschim Vihar','2':'South'}" key="top" value="1" /></td>
   <td><s:textfield name="address" label="address" key="address" value="" size="10" /></td>
	<td><s:textfield name="bdroom" label="bdroom" key="bdroom" value="" size="10" /></td>
	 <td><s:select label="Number of Bedrooms" name="bdroom" list="#{'1':'1','2':'2','3':'3','4':'4','5':'5','6':'>5'}" key="bdroom" value="1" /></td>
<td><s:select label="Number of Bathrooms" name="btroom" list="#{'1':'1','2':'2','3':'3','4':'4','5':'5','6':'>5'}" key="bthroom" value="1" /></td>
<td><s:textfield name="garfd" label="gar_fd" key="gar_fd" value="" size="10" /></td>
<td><s:textfield name="garvol" label="gar_vol" key="gar_vol" value="" size="10" /></td>
<td><s:textfield name="builtfloor" label="floor" key="floor" value="" size="10" /></td>
<td><s:textfield name="price" label="price" key="price" value="" size="10" /></td>
<td><s:textfield name="const_year" label="const_year" key="const_year" value="" size="10" /></td>
<td><s:textfield name="const_type" label="const_type" key="const_type" value="" size="10" /></td>
<td><s:textfield name="payment_ratio" label="payment_ratio" key="payment_ratio" value="" size="10" /></td>
<td><s:textfield name="sellmode" label="mode" key="mode" value="" size="10" /></td>
<td><s:textfield name="comments" label="comments" key="comments" value="" size="10" /></td>
 
 </tr>
 <tr><td><s:submit name="submit" value="Submit" cssClass="bt_login" /></td></tr>
</s:form>
  </table>
  </center>
</body>
</html>