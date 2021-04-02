<!DOCTYPE html>
<html>
<head>
<title>Configuration processed</title>
</head>
<body>

<!-- Informations for the user -->
<h1>Thanks, the website will be personalized to <%= request.getParameter("favLanguage") %></h1>
<b><a href="main.jsp">Click to get to the main page</a></b>

<!-- Creating cookie object and fill it and send it to the browser -->
<%
// Read from data
String data = request.getParameter("favLanguage");
// Create the cookie
Cookie cookieContainer = new Cookie("webCookies",data);
// Set lifespan of the cookie to a year
cookieContainer.setMaxAge(60*60*24*360);
// Send cookie to the browser
response.addCookie(cookieContainer);
%>
</body>
</html>