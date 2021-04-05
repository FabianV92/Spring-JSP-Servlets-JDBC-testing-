<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page import="java.util.Arrays"%>
<!DOCTYPE html>
<html>
<head>
<title>Split and join function</title>
</head>
<body>
<h1>Testing split and join with the JSTL function</h1>
<hr>
<c:set var="testString" value="hello-today-is-a-good-day"></c:set>
<c:set var="testArr" value="${fn:split(testString,'-')}"></c:set>
<p1>Splitting a string to a string array<br>
String : <b>${testString}</b><br>
Array : 
</p1>
<ol>
<c:forEach var="tmp" items="${testArr}">
<li>Element:  ${tmp} </li>
</c:forEach>
</ol>
<p1>Joining (concat) an array to a string. Using a * to make it clear</p1>
<br>
<c:set var="newString" value="${fn:join(testArr,'*')}"></c:set>
result string is : <b>${newString}</b>
</body>
</html>