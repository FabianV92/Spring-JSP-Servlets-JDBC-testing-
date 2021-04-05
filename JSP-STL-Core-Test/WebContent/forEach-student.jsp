<!-- Adding tag library reference -->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Adding importing java util packages and the package with the Student class -->
<%@ page import="java.util.*,com.fv.students.table.Student"%>

<%
// Creating some sample data... normally created with MVC
List<Student> data = new ArrayList<Student>();

data.add(new Student("Hans", "Tele", false));
data.add(new Student("Tom", "Hane", false));
data.add(new Student("Luna", "Vente", true));

// Set the variable to an attribute on the page context
pageContext.setAttribute("myStudents", data);
%>
<!DOCTYPE html>
<html>
<head>
<title>Students list</title>
</head>
<body>
	<!-- What happening behind the scene is that JSP is calling
the tmp.getFirstName, tmp.getLastName, tmp.isGoldCusomer -->
	<table border="1" margin="2">
		
		<!-- <tr> defines a row -->
		<tr>
			<!-- <th> for define the table header value -->
			<th>First name</th>
			<th>Last name</th>
			<th>Gold customer</th>
		</tr>
		
		<c:forEach var="tmp" items="${myStudents}">
			<tr>
				<!-- <td> stands for the table data -->
				<td>${tmp.firstName}</td>
				<td>${tmp.lastName}</td>
				<td>${tmp.goldCustomer}</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>
