package com.fv.servlet.mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.ArrayList;
/**
 * Servlet implementation class MvcServletDemo
 */
@WebServlet("/MvcServletDemo")
public class MvcServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MvcServletDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Get the data from the StudentDataUtil
		List<Student> students = StudentDataUtil.getStudents();
	
		// Add students data to the request object
		request.setAttribute("students_list", students);
	
		// Step 1: get request dispatcher
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("/view_students.jsp");
		
		// Step 2: forward the request to JSP
		dispatcher.forward(request, response);
		
	
	
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
