<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.*,com.fv.studenttracker.app.*"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="./css/student-app-style.css">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Poppins&display=swap" rel="stylesheet">
<title>Student-main</title>
</head>
<body>
	<header>
		<h1>The University</h1>
		<hr>
	</header>
	<div id="studentContainer">
		<p>Student list</p>
		<div class="studentData">
			<input type="button" value="Add student"
				onclick="window.location.href='add-student-form.jsp'"
				id="add-student-btn">
			<table>
				<tr id="headerRow">
					<th>First name</th>
					<th>Last name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
				<c:forEach var="tmp" items="${STUDENT_LIST}">
					<tr id="dataRows">
						<td>${tmp.firstName}</td>
						<td>${tmp.lastName}</td>
						<td>${tmp.email}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>