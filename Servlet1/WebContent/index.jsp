<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%
	Object fname = request.getAttribute("fname");
	HttpSession s1 = request.getSession();
	s1.setAttribute("fname", fname);
	
%>
</head>
<body>
	<b>This is welcome page</b>
	<form
		action="Servlet1" target="servlet2">
		<div>
			<label>NAME</label> <input type="text" name="fname">
		</div>
		<input type="submit" value="Submit" >
	</form>
	<iframe scrolling="auto" src="http://localhost:14404/Servlet2/Servlet2" name="servlet2" id="servlet2" height="150" width="80%"></iframe>
</body>
</html>