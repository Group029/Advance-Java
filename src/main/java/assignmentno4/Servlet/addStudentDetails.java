package assignmentno4.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import assignmentno4.beans.Student;
import assignmentno4.beans.StudentValidator;



/**
 * Servlet implementation class addStudentDetails
 */
@WebServlet(name="addStudentDetails" ,urlPatterns="/jsp/addStudentDetails")
public class addStudentDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addStudentDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String seatNo = request.getParameter("seatNo");
		String studentName = request.getParameter("studentName");
		int phyMarks = Integer.parseInt(request.getParameter("Physics"));
		int cheMarks = Integer.parseInt(request.getParameter("Chemistry"));
		int mathsMarks = Integer.parseInt(request.getParameter("Maths"));
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
		 boolean valid = StudentValidator.isValid(s1);
		 
		 String htmlResponse; 
			if(valid) {
				htmlResponse = 
				"<h1 style='color:white;background-color:green'>Student Registeration sucessful !!</h1>";
			}
			else
			{
				htmlResponse = 
							"<h1 style='color:white;background-color:red'>Failed to register</h1>";
			}
			
			out.println(htmlResponse);
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
