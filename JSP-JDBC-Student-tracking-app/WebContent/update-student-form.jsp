<!DOCTYPE hmtl>
<html>
<head>
<title>Update Student</title>
<link rel="stylesheet" href="css/add-student-form-style.css">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Poppins&display=swap"
	rel="stylesheet">
</head>
<body>
	<header>
		<h1>The University</h1>
	</header>
	<form action="StudentControllerServlet" method="GET">
		<input type="hidden" name="command" value="UPDATE" />
		<input type="hidden" name="studentId" value="${THE_STUDENT.id}" />
		<p>Add Student</p>
		<table>			
			<tbody>
				<tr>
					<td><label>First name</label></td>
					<td><input type="text" name="firstName" 
					value="${THE_STUDENT.firstName}"/></td>
				</tr>
				<tr>
					<td><label>Last name</label></td>
					<td><input type="text" name="lastName" 
					value="${THE_STUDENT.lastName}"/></td>
				</tr>
				<tr>
					<td><label>Email address</label></td>
					<td><input type="text" name="email" 
					value="${THE_STUDENT.email}"/></td>
				</tr>
				<tr>
					<td><label></label></td>
					<td><input type="submit" name="submit" value="Save" /></td>
				</tr>
			</tbody>
		</table>
		<a href="StudentControllerServlet">back to students view</a>
	</form>
</body>
</html>