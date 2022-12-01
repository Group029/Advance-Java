package assignmentno3.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class getResult {
	
	public static String getStudentDetails(String seatNo) {
		
		
		String out=null;
		
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
				 out = "Exam Seat No : "+seatno+ "  Student Name : "+name+"\n\n Physics : "+phyMarks+"\n Chemsitry : "+cheMarks+ "\n Maths : "+math+ "\n Percentage : "+percentage+"%"+ " Grade : "+grade;
			}
			else {
				out= "Enter valid Seat number" ;
			}
		}  catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return out;	
	}

}
