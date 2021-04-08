package com.fv.servlet.mvc;
import java.util.ArrayList;
import java.util.List;


public class StudentDataUtil {

	public static List <Student> getStudents() {
	
	// Create ArrayList
	List<Student> studentList = new ArrayList<>();
	
	// Add sample data to the arraylist
	studentList.add(new Student("Rabi", "Elgaid", "rrabi@live.com"));
	studentList.add(new Student("Susan", "Setas", "Setas@live.com"));
	studentList.add(new Student("Hans", "Olgi", "Hans@live.com"));
	
	// Return the list
	return studentList;
	}

}
