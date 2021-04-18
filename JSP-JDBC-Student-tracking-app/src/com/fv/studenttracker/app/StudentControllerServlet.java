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
		// Read the "command" parameter
		String theCommand = request.getParameter("command");

		// If the command is missing, assigning to listing students
		if (theCommand == null) {
			theCommand = "LIST";
		}

		// Routing to the needed method
		switch (theCommand) {
		case "LIST": {
			listStudents(request, response);
			break;
		}
		case "ADD": {
			addStudent(request, response);
			break;
		}
		case "LOAD": {
			try {
				loadStudent(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
		case "UPDATE": {
			updateStudent(request, response);
			break;
		}
		case "DELETE": {
			deleteStudent(request, response);
			break;
		}
		default:
			listStudents(request, response);

		}

	}

	private void deleteStudent(HttpServletRequest request, HttpServletResponse response) {
		// Read student id from form data
		String theStudentId = request.getParameter("studentId");

		// Delete student from database
		studentDbUtil.deleteStudent(theStudentId);

		// Send them back to "list students" page
		listStudents(request, response);
	}

	private void updateStudent(HttpServletRequest request, HttpServletResponse response) {
		// Read the student info from the form data
		int id = Integer.parseInt(request.getParameter("studentId"));
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");

		// Create a new student object based on the data
		Student theStudent = new Student(id, firstName, lastName, email);

		// Perform update on database
		studentDbUtil.updateStudent(theStudent);

		// Send them back to the "list students" page
		listStudents(request, response);
	}

	private void loadStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// Read student id from form data
		String theStudentId = request.getParameter("studentId");

		// Get student from the database(db util)
		Student theStudent = studentDbUtil.getStudent(theStudentId);

		// Place student in the request attribute
		request.setAttribute("THE_STUDENT", theStudent);

		// Send to JSP page: update-student-form-jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("update-student-form.jsp");
		dispatcher.forward(request, response);
	}

	private void addStudent(HttpServletRequest request, HttpServletResponse response) {

		// Read student info from the data
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");

		// Create a new student object
		Student theStudent = new Student(firstName, lastName, email);

		// Add the student to the database
		studentDbUtil.addStudent(theStudent);
		// Send back to the main page(the student list)
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
