<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<td>
<a href="<%= request.getContextPath() %>/html/addProperty.action" title="Contact"><span>Add</span></a>
</td></tr>
<tr><td>
<a href="<%= request.getContextPath() %>/html/modifyProperty.action" title="Contact"><span>Modify</span></a>
</td></tr>
<tr><td>
<a href="<%= request.getContextPath() %>/html/viewProperty.action" title="Contact"><span>View</span></a>
</td></tr>
</table>
</body>
</html>