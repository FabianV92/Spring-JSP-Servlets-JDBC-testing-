<%@page import="java.util.ArrayList"%>
<!-- Write down the HTMl form -->
<!DOCTYPE html>
<html>
<head>
<title>Session test</title>
</head>
<body>
	<h1>To do List for today :</h1>
	<form action="index.jsp">
		<input type="text" name="toDoTxt" placeholder="Need to do"> <input
			type="submit" name="submit">
	</form>
	<!-- Add new items to the to do list -->
	<%
	// Get items from the session
	ArrayList<String> itemsList = (ArrayList<String>) session.getAttribute("toDoItems");
	// If the items dont exit, then create new one
	if (itemsList == null) {
		itemsList = new ArrayList<String>();
		session.setAttribute("toDoItems", itemsList);
	}
	// Check if items are  to add
	String toDoTxt = request.getParameter("toDoTxt");
	// Preventing that by refreshing the item will not written twice
	boolean isItemNotDuplicate = toDoTxt != null && !itemsList.contains(toDoTxt.trim());
	if (toDoTxt != null && isItemNotDuplicate) {
		itemsList.add(toDoTxt);
	}
	%>
	<!-- Displaying to do items -->
	<hr>
	<b>Items of the to do list : </b>
	<ol>
		<%
		for (String tmp : itemsList) {
			out.println("<li>" + tmp + "</li>");
		}
		%>
	</ol>
</body>
</html>