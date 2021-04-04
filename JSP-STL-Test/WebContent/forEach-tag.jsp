<!-- Adding the tag library reference -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
// Createsome sample data... normally provided by MVC
String[] cities = {"Cologne","Chongqing","Munich"};

pageContext.setAttribute("myCities", cities);
%>

<!DOCTYPE html>
<html>
<head>
<title>forEach test</title>
</head>
<body>
<c:forEach var="tmp" items="${myCities}">
${tmp}<br>
</c:forEach>
</body>
</html>