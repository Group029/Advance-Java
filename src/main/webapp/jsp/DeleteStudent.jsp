<%@page import="assignmentno4.beans.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	HttpSession se1 = request.getSession(false);
	Student s1 = (Student)se1.getAttribute("StudentdataToUpdate");
	String seatno = s1.getSeatNo();
	%>
	<form action="DeleteStudentServlet" method="post">
		<input type="text" value=<%=seatno %> name="seatNo">
		<button type="submit">Delete</button>
	</form>
	
</body>
</html>