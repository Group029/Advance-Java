package assignmentno4.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import assignmentno4.beans.StudentValidator;

/**
 * Servlet implementation class DeleteStudentServlet
 */
@WebServlet(name="DeleteStudentServlet", urlPatterns="/jsp/DeleteStudentServlet")
public class DeleteStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String seatNo = request.getParameter("seatNo");
		
		boolean valid = StudentValidator.deleteOne(seatNo);
		 String htmlResponse; 
			if(valid) {
				htmlResponse = 
				"<h1 style='color:white;background-color:green'>Deleted sucessful !!</h1>" +seatNo;
			}
			else
			{
				htmlResponse = 
							"<h1 style='color:white;background-color:red'>Failed to Delete</h1>";
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
