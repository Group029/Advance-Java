<%@page import = "assignmentno4.beans.Student" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
</head>
<body>	
	<form>
	<pre>
		Enter Student Seat no: 
		<input type="text" name="seatno" id="seatno"/>
		Enter student Name:
		<input type="text" name="Name"/>
		Enter Physics marks:
		<input type="text" name="Physicsmarks"/>
		Enter Chemistry marks:
		<input type="text" name="Chemistrymarks"/>
		Enter Maths marks:
		<input type="text" name="Mathsmarks"/>
		<button type="submit">Submit</button>
	</pre>
	</form>	
	<% 
	String seatNo = request.getParameter("seatno");
	String studentName = request.getParameter("Name");
	int phyMarks = Integer.parseInt(request.getParameter("Physicsmarks"));
	int cheMarks = Integer.parseInt(request.getParameter("Chemistrymarks"));
	int mathsMarks = Integer.parseInt(request.getParameter("Mathsmarks"));
	float percentage = ((phyMarks+cheMarks+mathsMarks)/3);
	String grade = null;
	 if(percentage<35) {
		 grade = "fail";
	 }
	 else if(percentage>=35 && percentage<=50) {
		 grade = "C grade";
	 }
	 else if(percentage>50 && percentage<=65) {
		 grade = "B grade";
	 }
	 else if(percentage>65 && percentage<=74) {
		 grade = "A grade";
	 }
	 else if(percentage>=75) {
		 grade = "A+ grade";
	 }
	 Student s1 = new Student(seatNo, studentName, phyMarks, cheMarks, mathsMarks, percentage, grade);
	%>
	
</body>
</html>