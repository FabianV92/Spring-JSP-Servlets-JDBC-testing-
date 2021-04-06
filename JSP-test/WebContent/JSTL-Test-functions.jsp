<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<body>
<p1>Testing uppercase</p1>
<c:set var="cityName" value="Chongqing"></c:set>
<br>
<b>${cityName}</b> to uppercase : ${fn:toUpperCase(cityName)}
<br>
Testing length: <b>${cityName}</b> : ${fn:length(cityName)}
<br>
Is <b>java</b> cool? : ${fn:startsWith(cityName,"Cho")} 
<br>
<c:set var="testString" value="This-is-a-test"></c:set>
Split test :
<c:set var="splittedArr" value="${fn:split(testString,'-')}">
</c:set>
<br>
<ol>
<c:forEach var="tmp" items="${splittedArr}">
<li>${tmp}</li>
</c:forEach>
</ol>
Join test : 
<c:set var="splitString" value="${fn:join(splittedArr,'=')}"></c:set>
${splitString}
</body>
</html>