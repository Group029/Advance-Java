<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>
	<form action="addStudentDetails" method="post">
		<table>
		<tr>
		<td>Enter Exam Seat no.</td><td><input type="text" name="seatNo" ></td>
		</tr>
		<tr>
		<td>Enter Student name </td><td><input type="text" name="studentName" ></td>
		</tr>
		<tr>
		<td>Enter Physics Marks </td><td><input type="text" name="Physics" ></td>
		</tr>
		<tr>
		<td>Enter Chemistry Marks </td><td><input type="text" name="Chemistry" ></td>
		</tr>
		<tr>
		<td>Enter Maths Marks </td><td><input type="text" name="Maths" ></td>
		</tr>
		<tr>
		<td colspan="2"><button type="submit" name=btn value="submit">Submit</button>
		</tr>		
		</table>
	</form>
</body>
</html>