<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="2">
		<tr>
			<th>P_id</th>
			<th>P_name</th>
			<th>P_qty</th>
			<th>Price</th>
		</tr>

		<tr>
			<td><%=session.getAttribute("P_id")%></td>
			<td><%=session.getAttribute("P_name")%></td>
			<td><%=session.getAttribute("P_qty") %></td>
			<td><%=session.getAttribute("Price")%></td>
		</tr>
	</table>
</body>
</html>