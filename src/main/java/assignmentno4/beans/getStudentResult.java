package assignmentno4.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class getStudentResult {
	
	public static Student getStudentDetails(String seatNo) {
		
		
		Student s1 = null;
		String sqlQuery = "Select ExamSeatNo, name, Physics, Chemistry, Maths, Percentage, Grade from Student_master where ExamSeatNo= ?";
		try(Connection conn = JdbcUtils.obtainConnection();
		PreparedStatement pstmt = conn.prepareStatement(sqlQuery)){
			
			pstmt.setString(1, seatNo);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				 String seatno = rs.getString(1);
				 String name = rs.getString(2);
				 int phyMarks = rs.getInt(3);
				 int cheMarks = rs.getInt(4);
				 int math = rs.getInt(5);
				 float percentage = rs.getFloat(6);
				 String grade = rs.getString(7);	

			s1 = new Student(seatno, name, phyMarks, cheMarks, math, percentage, grade); 
			}
		}  catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return s1;	
	}

}
