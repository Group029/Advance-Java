package assignmentno4.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


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
	
	public static boolean updateStudentDetails(Student currentStudent) {
		boolean isUpdate=false;
		String sqlQuery = "update Student_master set name = ?, Physics = ?, Chemistry = ?, Maths= ?, Percentage = ?, Grade = ? where ExamSeatNo= ?";
		
		try(Connection conn = JdbcUtils.obtainConnection();
				PreparedStatement pstmt = conn.prepareStatement(sqlQuery)){
			String seatno = currentStudent.getSeatNo();
			String name = currentStudent.getStudentName();
			int phyMarks = currentStudent.getPhysics();
			int cheMarks = currentStudent.getChemistry();
			int math = currentStudent.getMaths();
			float percentage = currentStudent.getPercentage();
			String grade = currentStudent.getGrade();
			
			pstmt.setString(1, name);
			pstmt.setInt(2, phyMarks);
			pstmt.setInt(3, cheMarks);
			pstmt.setInt(4, math);
			pstmt.setFloat(5, percentage);
			pstmt.setString(6, grade);
			pstmt.setString(7,seatno);
			
			pstmt.executeUpdate();
			isUpdate = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return isUpdate;
	}
	
	public static boolean deleteOne(String seatNo) {
		// TODO Auto-generated method stub
		boolean valid=false;
		String sqlQuery = "delete from Student_master where ExamSeatNo = ?";
		try(Connection conn = JdbcUtils.obtainConnection();
				PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
				){
			pstmt.setString(1, seatNo);
			int deleteCount = pstmt.executeUpdate();
			valid = true;
			if(deleteCount != 0)
				System.out.println("Record deleted. Delete count: " + deleteCount);
			else
				System.out.println("The course ID does not exist.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	return valid;
	}

}
