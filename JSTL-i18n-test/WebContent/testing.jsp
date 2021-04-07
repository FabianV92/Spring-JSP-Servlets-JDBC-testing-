<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="theLocale" value="${not empty param.theLocale ? param.theLocale : pageContext.request.locale}" scope="session"/>
<fmt:setLocale value="${theLocale}"/>
<fmt:bundle basename="com.fv.test"></fmt:bundle>
<html>
<body>
<a href="testing.jsp?theLocale=cn_Cn">Chinese</a>
<a href="testing.jsp?theLocale=de_DE">German</a>
<br>
<fmt:message key="label.greeting"/>
<br>
<fmt:message key="label.firstName"/><i>Fabian</i>
<br>
<fmt:message key="label.lastName"/><i>Valerius</i>
<br>
<fmt:message key="label.txt"/>
</body>
</html>