<!DOCTYPE html>
<html>
<head>
<title>Processed form</title>
</head>
<body>
<h1>Hello ${param.firstName} ${param.secondName}</h1>
<br><br>
<p>Your salary will be 
<% String[] languages = request.getParameterValues("favoriteLanguage");
int salary = 0;
int demand = 0;
for (String i : languages) {
	if (i.equals("Java")){
		demand += 9;
	};
	if (i.equals("Php")) {
		demand += 5;
	}
	else demand += 8;
}
 %>
 </p>
</body>
</html>