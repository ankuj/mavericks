<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>Fancy Sliding Form with jQuery</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="description" content="Fancy Sliding Form with jQuery" />
        <meta name="keywords" content="jquery, form, sliding, usability, css3, validation, javascript"/>
        <link rel="stylesheet" href="css/slidingform.css" type="text/css" media="screen"/>
		<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
        <script type="text/javascript" src="js/sliding.form.js"></script>
    </head>
    <style>
        span.reference{
            position:fixed;
            left:5px;
            top:5px;
            font-size:10px;
            text-shadow:1px 1px 1px #fff;
        }
        span.reference a{
            color:#555;
            text-decoration:none;
			text-transform:uppercase;
        }
        span.reference a:hover{
            color:#000;
            
        }
        h1{
            color:#ccc;
            font-size:36px;
            text-shadow:1px 1px 1px #fff;
            padding:20px;
        }
    </style>
    <body>
       
        <div id="content">
            <h1>Sellers PID & UID </h1>
            <div id="wrapper">
                <div id="steps">
                    <form id="formElem" name="formElem" action="" method="post">
                        <!--<fieldset class="step">
                            <legend>Account</legend>
                            <p>
                                <label for="username">User name</label>
                                <input id="username" name="username" />
                            </p>
                            <p>
                                <label for="email">Email</label>
                                <input id="email" name="email" placeholder="info@tympanus.net" type="email" AUTOCOMPLETE=OFF />
                            </p>
                            <p>
                                <label for="password">Password</label>
                                <input id="password" name="password" type="password" AUTOCOMPLETE=OFF />
                            </p>
                        </fieldset> -->
                        <fieldset class="step">
                            <legend>Personal Details</legend>
                            <p>
                                <label for="fname">First Name</label>
                                <input id="fname" name="fname" type="text" AUTOCOMPLETE=OFF />
                            </p>
                            <p>
                                <label for="lname">Last Name</label>
                                <input id="lname" name="lname" type="text" AUTOCOMPLETE=OFF />
                            </p>
                             <p>
                                <label for="email">Email</label>
                                <input id="email" name="email" placeholder="info@mypropery.in" type="email" AUTOCOMPLETE=OFF />
                            </p>
                            <p>
                                <label for="phone">Phone</label>
                                <input id="phone" name="phone" placeholder="e.g. +919999999999" type="tel" AUTOCOMPLETE=OFF />
                            </p>
                            <p>
                                <label for="phone">Land Line</label>
                                <input id="lphone" name="lphone" placeholder="e.g. +91 11 8888 8888" type="tel" AUTOCOMPLETE=OFF />
                            </p>
                            <p>
                                <label for="website">Preference of Contact Time</label>
                                <input id="pcontactoftime" name="pcontactoftime"  type="tel" AUTOCOMPLETE=OFF />
                            </p>
                        </fieldset>
                        <fieldset class="step">
                            <legend>Property Details</legend>
                            <p>
                                <label for="city">City</label>
                                <select id="city" name="city">
                                    <option>Delhi</option>
                                    <option>Mumbai</option>
                                    <option>JaiPur</option>
                                </select>
                            </p>
                            <p>
                                <label for="zone">Zone</label>
                                <select id="zone" name="zone">
                                    <option>SOUTH</option>
                                    <option>NORTH</option>
                                    <option>WEST</option>
                                </select>
                            </p>
                            <p>
                                <label for="area">Area</label>
                                <select id="area" name="area">
                                    <option>Janakpuri</option>
                                    <option>SouthEx</option>
                                    <option>Paschim Vihar</option>
                                </select>
                            </p>
                            <p>
                                <label for="type">Type</label>
                                <select id="type" name="type">
                                    <option>Residential</option>
                                    <option>Apartment</option>
                                    <option>Kothi</option>
                                </select>
                            </p>

                            <p>
                                <label for="housenumber">House number</label>
                                <input id="housenumber" name="housenumber" type="text" AUTOCOMPLETE=OFF />
                            </p>
                            <p>
                                <label for="address">Address</label>
                                <input id="address" name="address" type="text" AUTOCOMPLETE=OFF />
                            </p>
                            
                        </fieldset>
                        
						<fieldset class="step">
                            <legend>Confirm</legend>
							<p>
								Everything in the form was correctly filled 
								if all the steps have a green checkmark icon.
								A red checkmark icon indicates that some field 
								is missing or filled out with invalid data. In this
								last step the user can confirm the submission of
								the form.
							</p>
                            <p class="submit">
                                <button id="registerButton" type="submit">Register</button>
                            </p>
                        </fieldset>
                    </form>
                </div>
                <div id="navigation" style="display:none;">
                    <ul>
                        <!--<li class="selected">
                            <a href="#">Account</a>
                        </li> -->
                        <li class="selected">
                            <a href="#">Personal Details</a>
                        </li>
                        <li>
                            <a href="#">Property Deatils</a>
                        </li>
                       
						<li>
                            <a href="#">Confirm</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </body>
</html>