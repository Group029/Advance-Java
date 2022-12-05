package assignmentno4.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class StudentValidator {
	
	public static boolean isValid(Student currentStudent) {
		boolean validationStatus = false;
		
		String sqlQuery = "insert into student_master values(?,?,?,?,?,?,?)";
		
		try(Connection conn = JdbcUtils.obtainConnection();
		PreparedStatement pstmt = conn.prepareStatement(sqlQuery)){
			
			String seatno = currentStudent.getSeatNo();
			String name = currentStudent.getStudentName();
			int phyMarks = currentStudent.getPhysics();
			int cheMarks = currentStudent.getChemistry();
			int math = currentStudent.getMaths();
			float percentage = currentStudent.getPercentage();
			String grade = currentStudent.getGrade();
			
			pstmt.setString(1, seatno);
			pstmt.setString(2, name );
			pstmt.setInt(3, phyMarks);
			pstmt.setInt(4, cheMarks);
			pstmt.setInt(5, math);
			pstmt.setFloat(6, percentage);
			pstmt.setString(7, grade);
			
			validationStatus = true;
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return validationStatus;
		
	}
	
}
