<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>JSP-Servlet-Mvc test</title>
</head>
<body>
<h1>Students list</h1>
<hr>
<table border="1">
<tr>
<th>First name</th>
<th>Last name</th>
<th>Email</th>
</tr>
<c:forEach var="tmp" items="${students_list}">
 <tr>
 <td> ${tmp.firstName}</td>
 <td> ${tmp.lastName}</td>
 <td> ${tmp.email}</td>
 </tr>
</c:forEach>
</table>
</body>
</html>