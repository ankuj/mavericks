<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
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
	
	<script src="js/slide.js" type="text/javascript"></script>
	<link rel="stylesheet" href="css/slide.css" type="text/css" media="screen" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<TABLE WIDTH=775 BORDER=0 CELLPADDING=0 CELLSPACING=0 class="frame">
<TR><TD bgcolor="#F0F0F0">
<div id="toppanel">
	<div id="panel">
		<div class="content clearfix">
			<div class="left">
				<!-- Login Form -->
				<s:form cssClass="clearfix" action="loginAction">
					<h1>Member Login</h1>
					<s:label cssClass="grey" name="Email ID:" value="Email ID:" />
					<s:textfield cssClass="field" name="email" id="email"  size="23" />
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
<!-- Shell -->
<div class="shell">
	
	<!-- Header -->
	
	<!-- End Header -->
	
	<!-- Slider -->
	<div id="slider">
		<a href="#" id="prev" class="notext">prev</a>
		<a href="#" id="next" class="notext">next</a>
		
		<div id="slider-content">
			<ul>
			    <li>
			    	<div class="left-side">
			    		<img src="css/images/BUYER.JPG" alt="" />
			    	</div>
			    	
			    	<div class="right-side">
			    		<h2>Buyer</h2>
			    		<p>Centric to your desired dream home</p>
			    		

			    	</div>
			    	
			    	<div class="cl">&nbsp;</div>
			    </li>
			    <li>
			    	<div class="left-side">
			    		<img src="css/images/shop.png" alt="" />
			    	</div>
			    	
			    	<div class="right-side">
			    		<h2>Seller</h2>
			    		<p>The best price and the best hands for your property</p>
			    		

			    	</div>
			    	
			    	<div class="cl">&nbsp;</div>
			    </li>
			    <li>
			    	<div class="left-side">
			    		<img src="css/images/investor.png" alt="" />
			    	</div>
			    	
			    	<div class="right-side">
			    		<h2>Investor</h2>
			    		<p>Tailor made deals with your morning tea</p>
			    		

			    	</div>
			    	
			    	<div class="cl">&nbsp;</div>
			    </li>
			</ul>
		</div>
	</div>
	<!-- End Slider -->
	
	<!-- Main -->
	<div id="main">
		
		<div class="cols">
			
			<div class="col">
				<div class="post">
					<h3>What is the problem?</h3>
					<img src="css/images/monitor.gif" alt="" class="right" />
					<p><strong>Property is a big deal</strong> where, when and how to buy it<strong>.It</strong>is a lifetime decision</p>
					<div class="cl">&nbsp;</div>
					<a href="#" title="Free Website Templates" class="learn-more" >Learn more</a>
				</div>
			</div>
			
			<div class="col">
				<div class="post">
					<h3>Where do we come in?</h3>
					<img src="css/images/gears.gif" alt="" class="right" />
					<p>We make the transition easy for you</p>
					<div class="cl">&nbsp;</div>
					<a href="#" title="Free Website Templates" class="learn-more">Learn more</a>
				</div>
			</div>
			
			<div class="col col-last">
				<div class="post">
					<h3>How do we do it?</h3>
					<p>Use the portal, you will not even have to step out of your place.</p>
				</div>
			</div>
			
			<div class="cl">&nbsp;</div>
		</div>
		
		<div id="content">
			
			<div class="col">
				<div class="post">
					<h3>What is our coverage?</h3>
					<img src="css/images/logo1.gif" alt="" class="right"/>
					<p>We have a significant market coverage, you benefit from our network..</p>
				</div>
			</div>
			
			<div class="col col-last">
				<div class="post">
					<h3>Comprehensive coverage...</h3>
					<p>Property custom designed to suit your senses</p>
				</div>
			</div>
			
			<div class="cl">&nbsp;</div>
			
		</div>
		
	</div>
	<!-- End Main -->
	
</div>
<!-- End Shell -->
<!-- Footer -->
<!-- End Footer -->

</body>
</html>