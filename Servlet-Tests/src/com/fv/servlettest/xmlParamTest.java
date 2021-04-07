package com.fv.servlettest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class xmlParamTest
 */
@WebServlet("/xmlParamTest")
public class xmlParamTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public xmlParamTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set Content type
		response.setContentType("text/html");
		
		// Create printWriter
		PrintWriter out = response.getWriter();
		
		// Read the XML Configuration file
		ServletContext context = getServletContext();//got inherited from HttpServlet
		String maxShoppingCardSize = context.getInitParameter("max-shopping-card-size");
		String projectTeamName = context.getInitParameter("project-team-name");
		
		// Generate HTML content
		out.println("<html><body>");
		out.println("<h1>testing the initial parameter from the xml file </h1>" + "<hr>");
		out.println("<p>The max shopping card size is: " + maxShoppingCardSize + "</p>" + "<br>");
		out.println("<p>The name of the project team is: " + projectTeamName + "</p>"+"<br>");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
