<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.*,fv.test.student.Students"%>

<%
// Adding values to the Students array list
List<Students> data = new ArrayList<Students>();
data.add(new Students("Tom", "Hane", false));
data.add(new Students("Hans", "Vogle", true));
data.add(new Students("Canti", "Tres", true));

// Load into page context
pageContext.setAttribute("myStudents", data);
%>

<!DOCTYPE html>
<html>
<head>
<title>Students db</title>
</head>
<body>

	<!-- Displaying the list -->
	<table border="1">
		
		<tr>
			<th>First name</th>
			<th>Last name</th>
			<th>Gold member</th>
		</tr>
		
		<c:forEach var="tmp" items="${myStudents}">
		
			<tr>
				<td>${tmp.firstName}</td>
				<td>${tmp.lastName}</td>
				<td>
				<c:choose>
				<c:when test="${tmp.goldStatus}">
				Special discount!
				</c:when>
				<c:otherwise>
				No discount for you!
				</c:otherwise>
				</c:choose>
				</td>
			</tr>
		
		</c:forEach>
	
	</table>
</body>
</html>