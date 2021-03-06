<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="include.jsp" %>
<title>List of properties</title>
</head>
<body>
	<%@ include file="menu.jsp"%>
	<div class="container">
		<h1>List of properties</h1>
		
		<table class= "table">
			<tr>
				<th>Id</th>
				<th>Title</th>
				<th>Price</th>
				<th>Description</th>
				<th>Latitude</th>
				<th>Longitude</th>
				<th>Beds</th>
				<th>Baths</th>
				<th>Provinces</th>
				<th>SquareMeters</th>
				<th></th>
				<th></th>
			</tr>
			<c:forEach var="property" items="${keyList}">
				<tr>
					<td>${property.id}</td>
					<td>${property.title}</td>
					<td>${property.price}</td>
					<td>${property.description}</td>
					<td>${property.x}</td>
					<td>${property.y}</td>
					<td>${property.beds}</td>
					<td>${property.baths}</td>
					<td>${property.provinces}</td>
					<td>${property.squareMeters}</td>
					<td><a href="propertyServlet?action=alter&id=${property.id}" class = "btn btn-primary">Alter</a></td>
					<td></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>