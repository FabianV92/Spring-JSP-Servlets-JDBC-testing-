<!DOCTYPE html>
<html>
<head>
<title>Main</title>
</head>
<body>
	<!-- Reading the favourite programming language cookie -->
	<%
	// Setting default if ther is no cookie
	String favLanguage = "Java";

	// Get the cookies from the browser request
	Cookie[] cookieArr = request.getCookies();

	// Finding favourite language cookie
	if (cookieArr != null) {
		for (Cookie tmp : cookieArr) {
			if ("webCookies".equals(tmp.getName())) {
		favLanguage = tmp.getValue();
		break;
			}
		}
	}
	%>
	<h1>
		Know everything about
		<%=favLanguage%></h1>

	<!-- Job description -->
	<p>
		Job description for a
		<%=favLanguage%>
		developer is :
	</p>
	<ol>
		<ul>test test test
		</ul>
		<ul>test test test
		</ul>
		<ul>test test test
		</ul>
	</ol>

	<!-- Job salary -->
	<p>
		Job salary for a
		<%=favLanguage%>
		developer is :
	</p>
	<ol>
		<ul>test test test
		</ul>
		<ul>test test test
		</ul>
		<ul>test test test
		</ul>
	</ol>

	<!-- Job market -->
	<p>
		The job market for a
		<%=favLanguage%>
		developer is :
	</p>
	<ol>
		<ul>test test test
		</ul>
		<ul>test test test
		</ul>
		<ul>test test test
		</ul>
	</ol>
	<br>
	<a href="config.html">Change the configuration</a>
</body>
</html>