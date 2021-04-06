<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:set var="theLocale"
value="${not empty param.theLocale ? param.theLocale : pageContext.request.locale}"
scope="session"/>
<fmt:setLocale value="${theLocale}"/>
<fmt:setBundle basename="com.fv.jstl.i18n.label"/>
<!DOCTYPE html>
<html>
<head>
<title>I18N testing</title>
</head>
<body>
<a href="i18n-messages-test.jsp?theLocale=en_US">English (US)</a>
<a href="i18n-messages-test.jsp?theLocale=es_ES">Spanish (ES)</a>
<a href="i18n-messages-test.jsp?theLocale=de_DE">German (DE)</a>
<br>
<fmt:message key="label.greeting"/><br>
<fmt:message key="label.firstName"/> <i>Hans</i> <br>
<fmt:message key="label.lastName"/> <i>Otts</i><br>
<fmt:message key="label.welcome"/>
</body>
</html>