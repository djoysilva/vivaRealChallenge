<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file = "include.jsp"%>
<title>Search Properties</title>
</head>
<body>
	<%@ include file = "menu.jsp" %>
	<div class = "container">
		<h1>Search Properties with latitude and longitude</h1>
					
		<div class = "row">
			<div class = "col-md-6">
				<form action="propertyServlet" method="get">
					<input type="hidden" name="action" value="search">
					<div class = "form-group">
						<label for="idLatitude">Latitude of the A point:</label>
						<input type="text" name="xA" id="idLatitude" class="form-control">
					</div>
					<div class = "form-group">
						<label for="idLongitude">Longitude of the A point:</label>
						<input type="text" name="yA" id="idLongitude" class="form-control">
					</div>
					<div class = "form-group">
						<label for="idLatitude">Latitude of the B point:</label>
						<input type="text" name="xB" id="idLatitude" class="form-control">
					</div>
					<div class = "form-group">
						<label for="idLongitude">Longitude of the B point:</label>
						<input type="text" name="yB" id="idLongitude" class="form-control">
					</div>
					<div>
						<input type="submit" value="SEARCH" class="btn btn-primary">
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>