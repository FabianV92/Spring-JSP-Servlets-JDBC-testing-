package com.fv.studenttracker.app;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class StudentControllerServlet
 */
@WebServlet("/StudentControllerServlet")
public class StudentControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Getting the reference of the StudentDbUtil class
	private StudentDbUtil studentDbUtil;

	// Reference name from the context xml file
	@Resource(name = "jdbc/web_student_tracker")
	private DataSource dataSource;

	// Overriding the init method from the GenericServlet class
	@Override
	public void init() throws ServletException {
		super.init();
		// Creating studentDbUtil object and passing the connection pool/data source
		studentDbUtil = new StudentDbUtil(dataSource);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		listStudents(request, response);
	}

	private void listStudents(HttpServletRequest request, HttpServletResponse response) {
		// Creating studentsList and assigning the getStudent method
		List<Student> students = studentDbUtil.getStudent();

		// Setting request attribute
		request.setAttribute("STUDENT_LIST", students);

		// Setting request dispatcher to the student jsp file
		RequestDispatcher dispatcher = request.getRequestDispatcher("student-app.jsp");
		try {
			dispatcher.forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
}
