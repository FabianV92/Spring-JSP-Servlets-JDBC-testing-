<!DOCTYPE hmtl>
<html>
<head>
<title>Add student</title>
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
		<input type="hidden" name="command" value="ADD" />
		<p>Add Student</p>
		<table>			
			<tbody>
				<tr>
					<td><label>First name</label></td>
					<td><input type="text" name="firstName" /></td>
				</tr>
				<tr>
					<td><label>Last name</label></td>
					<td><input type="text" name="lastName" /></td>
				</tr>
				<tr>
					<td><label>Email address</label></td>
					<td><input type="text" name="email" /></td>
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