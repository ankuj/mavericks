<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page import="com.myp.action.login.LoginAction" %>
<%@page import="com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion.User" %>
<%@page import="com.myp.customer.model.Users"%><HTML>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aasov</title>

	<link rel="stylesheet" href="css/style.css"  type="text/css"/>
	<link rel="stylesheet" href="css/style2.css" type="text/css" media="all" />
	<link rel="stylesheet" href="css/general.css" type="text/css" media="screen" />
	<link rel="shortcut icon" type="image/x-icon" href="css/images/favicon.ico" />
	<!--[if IE 6]>
		<link rel="stylesheet" href="css/ie6.css" type="text/css" media="all" />
	<![endif]-->
	
	
	<script src="js/jquery-1.4.2.js" type="text/javascript"></script>
	<script src="js/jquery.jcarousel.js" type="text/javascript"></script>
	<script src="js/jquery.pngFix.js" type="text/javascript"></script>
	<script src="js/js-fnc.js" type="text/javascript"></script>
	<script src="js/jquery-1.2.6.min.js" type="text/javascript"></script>
	<script src="js/popup.js" type="text/javascript"></script>
	
	<!--[if lt IE 7]>
    	<script type="text/javascript" src="js/mootools.js"></script>
    	<script type="text/javascript" src="js/core.js"></script>
	<![endif]-->
</head>

<body>

    <div id="cont"> 
		<div class="shell">
	<!-- Header -->
	<div id="header">
		
		<h1 id="logo"><a href="#" title="Aasov"><b style="COLOR: #800040;"><i style="COLOR: #400040;">Aasov</i></b><span></span></a></h1>

		<div id="navigation">
			<ul>
			    <li><a href="#" class="active" title="Home"><span>Home</span></a></li>
			    <li><a href="#" title="About Us"><span>About Us</span></a></li>
			    <li><a href="#" title="Services"><span>Services</span></a></li>
			    <li><a href="#" title="Buying"><span>Buying</span></a></li>
			    <li><a href="#" title="Selling"><span>Selling</span></a></li>
			    <li><a href="#" title="Renting"><span>Renting</span></a></li>
			    <li><a href="#" title="Contact"><span>Contact</span></a></li>
			</ul>
		</div>
	</div>
	<!-- End Header -->	
</div>
<div class="box">
		<h1 style="COLOR: #000080;">Aasov, <i>Happiness Always</i>!</h1>
			<s:form action="index2.jsp" >
					<h1>Hello Member!</h1>
					<s:actionerror />
					<s:textfield cssClass="textboxcss" label="Please Enter your registerd Email Id" name="email" size="23" value=""/>
	            	<s:checkbox name="rememberme" label="Remember me" value="forever" />
					<s:submit  name="submit" value="Get Password" cssClass="btnExample" />
				</s:form>
	</div>	
</div>


    <div id="bg">
        <div>
            <table cellspacing="0" cellpadding="0">
                <tr>
                    <td>
                        <img src="css/images/bg.jpg" alt=""/>
                    </td>
                </tr>
            </table>
        </div>
    </div>
	<!-- Footer -->
<div id="footer">
	<div class="shell">
		<p class="left">
			
			<a href="#" title="Home" >Home</a>
			<span>|</span>
			<a href="#" title="About Us">About Us</a>
			<span>|</span>
			<a href="#" title="Services">Services</a>
			<span>|</span>
			<a href="#" title="Solutions">Buying</a>
			<span>|</span>
			<a href="#" title="Support">Selling</a>
			<span>|</span>
			<a href="#" title="Partners">Renting</a>
			<span>|</span>
			<a href="#" title="Contact">Contact</a>
			
				
		</p>
		
		<p class="right">
			&copy; aasov.com. Design by <a href="http://aasov.com/" title="Free Website Templates">DreamCheaser</a>
		</p>
		
		<div class="cl">&nbsp;</div>
	</div>
</div>	
<!-- End Footer -->
</body>
</html>