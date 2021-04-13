<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.*,com.fv.studenttracker.app.*"%>
<!DOCTYPE html>
<html>
<head>
<title>Student-main</title>
</head>
<body>
<table border="1">
<tr>
<th>First name</th>
<th>Last name</th>
<th>Email</th>
</tr>
<c:forEach var="tmp" items="${STUDENT_LIST}">
<tr>
<td>${tmp.firstName}</td>
<td>${tmp.lastName}</td>
<td>${tmp.email}</td>
</tr>
</c:forEach>
</table>
</body>
</html>