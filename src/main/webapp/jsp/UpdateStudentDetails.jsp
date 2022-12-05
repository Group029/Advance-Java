<%@page import="assignmentno4.beans.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update details</title>
<style type="text/css">
	#btn{
	margin-left 200px;

	}
	#frm{
	float: right;
	margin-right: 850px;
	}
</style>
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
		<input type="text" value="<%=seatno %>" readonly="readonly" name="seatNo">
		Student Name 
		<input type="text" value="<%=studentName%>" name="studentName">
		Physics : 
		<input type="text" value="<%=phy%>" name="Physics">
		Chemistry : 
		<input type="text" value="<%=che%>" name="Chemistry">
		Maths : 
		<input type="text"  value="<%=math%>" name="Maths">
	
		<button type="submit" value="Submit">Submit</button>
		
		</pre>	
		</form>
		<form action="DeleteStudent.jsp" method="post" id="frm">
			<button type="submit">Delete</button>
		</form>	
</body>
</html>