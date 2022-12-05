<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form action="getResult" method="post">
			<table>
				<tr> 
					<td>Enter Student Seat no: </td>
					<td><input type="text" name="ExameSeatNo" id="seatno"/> </td>
				</tr>
				<tr>
					<td colspan="2"><button type="submit">Check</button></td> 
				</tr>
			</table>
		</form>
</body>
</html>