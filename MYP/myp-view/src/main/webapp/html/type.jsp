<%@ page language="java" import="java.util.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>CSS-Free-Templates</title>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
	<link rel="stylesheet" href="css/style_aasov.css" type="text/css" media="all" />
	<!--[if IE 6]>
		<link rel="stylesheet" href="css/ie6.css" type="text/css" media="all" />
	<![endif]-->
	<link rel="shortcut icon" type="image/x-icon" href="css/images/favicon.ico" />
	<script src="js/jquery-1.4.2.js" type="text/javascript"></script>
	<script src="js/jquery.jcarousel.js" type="text/javascript"></script>
	<script src="js/jquery.pngFix.js" type="text/javascript"></script>
	<script src="js/js-fnc.js" type="text/javascript"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- Shell -->

	
	<!-- Header -->
	<!-- End Header -->
	
	<!-- Slider -->
	<center>
	<s:form action="resultAction" >
 <s:label>hello </s:label>
<s:property value="#session.fname"/>
 <%= new Date(session.getLastAccessedTime()) %>
  <s:radio label="Are you a:" name="type" list="#{'1':'Buyer','2':'Seller','3':'Investor'}"  />
 
<s:submit value="submit" name="submit" />
 
</s:form>
</center>
<!-- End Footer -->

</body>
</html>