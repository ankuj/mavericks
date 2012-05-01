
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
  <head>
  <title>Enter first and last name</title>
  <s:head theme="ajax" debug="false"/>

  </head>
  <body>
  <s:div id="maskValue" >
  <div style="position:absolute;top:10; left:20; width:300; 
height:175;background-color:#E5E5E5;">
  <h3>Enter first and last name:</h3>
  <s:form theme="ajax" action="doMask">
  <s:textfield name="firstname" label="Firstname" />
  <s:textfield name="lastname" label="Lastname" />
  <s:submit value="Submit" theme="ajax" targets="maskValue" />
  </s:form>
  </div>
  <br>
  
  <div id="8" style="position:absolute;top:10; left:350; 
width:300; height:160;background-color:#E5E5E5;">
  <h3>Output: </h3>
  Firstname : <s:property value="firstname" />
  <br><br>
  Lastname :  <s:property value="lastname" />
  </div>
  </s:div>
  </body>
</html>