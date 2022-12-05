<%@page import="assignmentno4.beans.Student"%>
<%@page import="com.mysql.cj.Session"%>
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
		String studentName = s1.getStudentName();
		int phy = s1.getPhysics();
		int che = s1.getChemistry();
		int math = s1.getMaths();
		float percentage = s1.getPercentage();
		String grade = s1.getGrade();
	%> 
	

		<pre>
		Exam Seat no : <%=seatno%> Student Name :<%=studentName%>
		
		Physics :<%=phy%>  Chemistry : <%=che%> Math : <%=math%>
	
		Percentage : <%=percentage%> 	Grade : <%=grade%>
		
		</pre>
		<form action="UpdateStudentDetails.jsp">
		<button type="submit" value="Update">Update</button>
		</form>
</body>
</html>