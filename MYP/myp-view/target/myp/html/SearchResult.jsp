<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page import="com.myp.customer.model.PropertyDetails"%>
<%@page import="com.myp.action.login.PropertyDetailsAction" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style_table.css" type="text/css" media="all" />
</head>
<body>
    <s:form action="interestAction">
<s:iterator value="list" var="i">  
       <tr>  
          <td>%{i.state}</td>  
         <td>%{i.city}</td>  
         <td>%{i.state}</td>  
       
        </tr>  
        </s:iterator>  
        <ol>
        <%int i=0; %>
<s:iterator value="searchList">
  <li><s:property value="pid"/></li>
  <li><s:property value="city"/></li>
  <li><s:property value="zone"/></li>
</s:iterator>
</ol>
          <s:property value="%{i.state}"/>
          <s:property value="%{name}"/>  
          <s:property value="name"/>
          <s:property value="key1" />
          
          <table id="background-image" summary="Meeting Results">
    <thead>
    	<tr>
        	<th scope="col">Employee</th>
            <th scope="col">Division</th>
            <th scope="col">Suggestions</th>
        </tr>
    </thead>
    <tfoot>
    	<tr>
        	<td colspan="4">IE 6 users won't see the transparent background if the hack is not applied</td>
        </tr>
    </tfoot>
    <tbody>

    <s:iterator id="itrate" value="searchList">
    	<tr>
        	<td><s:property value="pid"/></td>
            <td><s:property value="city"/></td>
            <td><s:property value="zone"/></td>
            <td><%=++i %></td>
             <s:checkbox name="interest" onclick="findvalue" fieldValue="pid"/>
             
             <s:if test="%{#interest=='true'}">
	This is Struts 2
	<s:set name="interest1" value="true"/>
</s:if>
             <s:if test="%{#check=='true'}"><%System.out.println("i:"+i); %></s:if>
        </tr>
      </s:iterator>
      <s:submit>Submit</s:submit>
 
        <tr>
        	<td>Josephin Tan</td>
            <td>Advertising</td>
            <td>Give bonuses</td>
        </tr>
        <tr>
        	<td>Joyce Ming</td>
            <td>Marketing</td>
            <td>New designs</td>
        </tr>
        <tr>
        	<td>James A. Pentel</td>
            <td>Marketing</td>
            <td>Better Packaging</td>
        </tr>
    </tbody>
</table>
     </s:form>          
</body>
<script type="text/javascript">
function findvalue()
{
	alert("ankuj here");
	var chkvalue=document.getElementById("interest1");
	var itrate=document.getElementById("itrate");
	var i=document.getElementById("i");
	alert("chkvalue"+chkvalue.checked);
	if(chkvalue.checked)
	{
		
	}
	alert("i"+i);
	for(i=0;i<chkvalue.length;i++)
	{
		alert("chkvalue.length"+chkvalue.length);
		if(chkvalue[i].type="s:checkbox")
		{
			alert("here");	
		}
			

	}
}

</script>
</html>