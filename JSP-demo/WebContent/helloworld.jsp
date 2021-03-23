<!DOCTYPE>
<html>
<body>
<h1>The following are JSP Expressions examples: </h1>
The time of the server is <%= new java.util.Date() %>
<br><br>
hello world to upperCase = <%= new String("Hello World").toUpperCase() %>
<br><br>
25 multiplied by 4 equals <%= 25*4 %>
<br><br>
Is 67 less than 76? <%= 67 < 76 %>
<br><br>
<h1>The following are JSP Scriptlet examples: </h1>
<% for (int i = 0; i < 3; i++) {
	out.println("Inside of a for loop. " + "Sentence nr. " + (i+1) +"<br>");
} 
%>

</body>
</html>