<%@page import="assignmentno4.beans.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update details</title>
</head>
<body>
		<%	HttpSession se1 = request.getSession(false);
			Student s1 = (Student)se1.getAttribute("StudentdataToUpdate");
			String seatno = s1.getSeatNo();
			String studentName = s1.getStudentName();
			int phy = s1.getPhysics();
			int che = s1.getChemistry();
			int math = s1.getMaths();
			float percentage = s1.getPercentage();
			String grade = s1.getGrade();
		%>
		
		<form action="updatedDataServlet" method="post">
		<pre>
		Exam Seat No. 
		<input type="text" value="<%=seatno %>" readonly="readonly">
		Student Name 
		<input type="text" value="<%=studentName%>">
		Physics : 
		<input type="text" value="<%=phy%>">
		Chemistry : 
		<input type="text" value="<%=che%>">
		Maths : 
		<input type="text"  value="<%=math%>">
		Percentage :
		<input type="text" value="<%=percentage%>">
		Grade :
		<input type="text" value="<%=grade%>">
		
		</pre>	
			
		</form>
</body>
</html>