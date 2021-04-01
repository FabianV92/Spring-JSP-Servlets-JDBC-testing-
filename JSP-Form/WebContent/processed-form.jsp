<!DOCTYPE html>
<html>
<head>
<title>Processed form</title>
</head>
<body>
<h1>Hello ${param.firstName} ${param.secondName}</h1>
<br><br>
<p>
<% 
String country  = request.getParameter("country");
String gender = request.getParameter("gender");
String [] progLanguages = request.getParameterValues("favouriteLanguage");
StringBuilder progLanguagesStr = new StringBuilder();
for (int i = 0; i < progLanguages.length; i++) {
	progLanguagesStr.append(progLanguages[i]).append(",");
}
progLanguagesStr = progLanguagesStr.replace(progLanguagesStr.length()-1, progLanguagesStr.length(), "");
out.println("You are from : " + country + "<br>");
out.println("You are : " + gender + "<br>");
out.println("You also like the following programming languages : " + progLanguagesStr.toString());
%>
 </p>
</body>
</html>