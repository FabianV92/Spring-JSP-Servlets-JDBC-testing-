<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<title>Function test</title>
</head>
<body>
<h1>Testing length of a string, upperCase and startsWith function</h1>
<hr>

<c:set var="testData" value="helloWorld"></c:set>
<p1>Length test : <b>${testData}</b> : The length is: ${fn:length(testData)} </p1>
<br>
<p1>To uppercase test: <b>${testData}</b> : ${fn:toUpperCase(testData)}</p1>
<br>
<p1>True or false? Is <b>Java</b> awesome? :${fn:startsWith(testData,"hello")}</p1>
</body>
</html>