package com.fv.studenttracker.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class StudentDbUtil {

	// Fields
	private DataSource dataSource;

	// Constructor
	public StudentDbUtil(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	// Creating a method which returns a list
	public List<Student> getStudent() {
		List<Student> students = new ArrayList<>();

		// Setting initial value of the created variables of
		// Connection/Statement/ResultSet to null
		Connection myConn = null;
		Statement mySm = null;
		ResultSet myRs = null;

		try {
			// Get the connection
			myConn = dataSource.getConnection();

			// Create statement
			String sql = "SELECT * FROM student";
			mySm = myConn.createStatement();

			// Execute query passing the sql as argument
			myRs = mySm.executeQuery(sql);

			// Saving the data from the result set
			while (myRs.next()) {

				int id = myRs.getInt("id");
				String firstName = myRs.getString("first_name");
				String lastName = myRs.getString("last_name");
				String email = myRs.getString("email");

				// Creating student object and saving data
				Student studentsData = new Student(id, firstName, lastName, email);

				// Passing the data to the students list
				students.add(studentsData);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// Closing JDBC
			close(myConn, mySm, myRs);
		}
		return students;
	}
	
	private void close(Connection myConn, Statement mySm, ResultSet myRs) {
		try {
			if (myConn != null) {
				myConn.close();
			}
			if (mySm != null) {
				mySm.close();
			}
			if (myRs != null) {
				myRs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// JDBC work
	public void addStudent(Student theStudent) {
		Connection myConn = null;
		PreparedStatement myPsm = null;
		try {
		// Get DB connection
		myConn = dataSource.getConnection();
			
		// Create SQL statement for inserting
		String sql = "INSERT INTO student " 
				+ "(first_name, last_name, email)"
				+ "VALUES (?, ?, ?)";
		myPsm = myConn.prepareStatement(sql);
		
		// Setting the param values for the SQL
		myPsm.setString(1, theStudent.getFirstName());
		myPsm.setString(2, theStudent.getLastName());
		myPsm.setString(3, theStudent.getEmail());
		
		//Executing SQL 
		
		// Cleaning JDBC objects
		myPsm.execute();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			close(myConn,myPsm,null);
		}
	}
}
