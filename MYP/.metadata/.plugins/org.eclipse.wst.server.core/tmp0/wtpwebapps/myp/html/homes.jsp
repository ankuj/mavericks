<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@page import="com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion.User" %><HTML>
<HEAD>
<TITLE>MyProperty</TITLE>
<META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=windows-1250">
<!-- ImageReady Preload Script (index.psd) -->
	<link rel="stylesheet" href="css/slide.css" type="text/css" media="screen" />
	<script src="js/jquery-1.3.2.min.js" type="text/javascript"></script>
	<!-- Sliding effect -->
	<script src="js/slide.js" type="text/javascript"></script>

<SCRIPT TYPE="text/javascript">
<!--

function newImage(arg) {
	if (document.images) {
		rslt = new Image();
		rslt.src = arg;
		return rslt;
	}
}

function changeImages() {
	if (document.images && (preloadFlag == true)) {
		for (var i=0; i<changeImages.arguments.length; i+=2) {
			document[changeImages.arguments[i]].src = changeImages.arguments[i+1];
		}
	}
}

var preloadFlag = false;
function preloadImages() {
	if (document.images) {
		home_page_over = newImage("images/home-page-over.gif");
		about_us_over = newImage("images/about-us-over.gif");
		homes_over = newImage("images/homes-over.gif");
		renting_over = newImage("images/renting-over.gif");
		selling_over = newImage("images/selling-over.gif");
		news___events_over = newImage("images/news-%26-events-over.gif");
		contacts_over = newImage("images/contacts-over.gif");
		preloadFlag = true;
	}
}

// -->
</SCRIPT>
<!-- End Preload Script -->
</HEAD>
<link href="css/styles.css" rel="stylesheet" type="text/css">
<BODY BGCOLOR=#FFFFFF LEFTMARGIN=0 TOPMARGIN=0 MARGINWIDTH=0 MARGINHEIGHT=0 ONLOAD="preloadImages();">

<!-- ImageReady Slices (index.psd) -->
<TABLE WIDTH=775 BORDER=0 CELLPADDING=0 CELLSPACING=0 class="frame">
<TR><TD bgcolor="#F0F0F0">
<div id="toppanel">
	<div id="panel">
		<div class="content clearfix">
			<div class="left">
				<h1>Welcome to My-Property</h1>
				<h2>##############################</h2>		
				<p class="grey">****************************!</p>
				<h2>Download</h2>
				<p class="grey">********************* <a href="#" title="Download">article &raquo;</a></p>
			</div>
			<div class="left">
				<!-- Login Form -->
				<s:form cssClass="clearfix" action="loginAction">
					<h1>Member Login</h1>
					<s:label cssClass="grey" name="Email ID:" value="Email ID:" />
					<s:textfield cssClass="field" name="email" id="email" value="" size="23" />
					<s:label cssClass="grey" name="Password:" value="Password:" />
					<s:password cssClass="field"  name="password" id="password" size="23" />
	            	<s:checkbox name="rememberme" id="rememberme" label="Remember me" value="forever" />
        			<div class="clear"></div>
					<s:submit name="submit" value="Login" cssClass="bt_login" />
					<s:a cssClass="lost-pwd" href="#" label="Lost your password?"></s:a>
				</s:form>
			</div>
			<div class="left right">			
				<!-- Register Form -->
				<s:form action="addUserAction" >
					<h1>Not a member yet? Sign Up!</h1>				
					<s:label cssClass="grey" name="firstName" value="Firstname:" />
					<s:textfield cssClass="field"  name="fname"  value="" size="23" />
					<s:label cssClass="grey" name="email" value="Email:" />
					<s:textfield cssClass="field" type="text" name="email" id="email" size="23" />
					<s:label name="abc" value="A password will be e-mailed to you."/>
					<s:submit  name="submit" value="Register" cssClass="bt_register" />
				</s:form>
			</div>
		</div>
</div> <!-- /login -->	

	<!-- The tab on top -->	
	<div class="tab">
  <ul class="login">
			<li class="left">&nbsp;</li>
			<li>
			<s:if test="user.getFname()!=null">
			<s:property value="users.getFname"/>
			</s:if>
			<s:else>Hello Guest!</s:else>			
			</li>
			<li class="sep">|</li>
			<li id="toggle">
				<a id="open" class="open" href="#">Log In | Register</a>
				<a id="close" style="display: none;" class="close" href="#">Close Panel</a>			
			</li>
			<li class="right">&nbsp;</li>
		</ul> 
	</div> <!-- / top -->
</div>
</TD></TR>
	
</TABLE>
<!-- End ImageReady Slices -->
</BODY>
</HTML>