<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file = "include.jsp"%>
<title>Alter property</title>
</head>
<body>
	<%@ include file = "menu.jsp" %>
	<div class = "container">
		<h1>Alter Property</h1>
					
		<div class = "row">
			<div class = "col-md-6">
				<c:if test = "${not empty success}">
					<div class = "alert alert-success">
						${success}
					</div>
				</c:if>
				
				<form action="propertyServlet" method="post">
					<input type="hidden" name="action" value="alter">
					<div class = "form-group">
						<input type="hidden" name="id" id="idId" class="form-control" value="${keyAlter.id}">
					</div>
					<div class = "form-group">
						<label for="idTitle">Title:</label>
						<input type="text" name="title" id="idTitle" class="form-control">
					</div>
					<div class = "form-group">
						<label for="idPrice">Price:</label>
						<input type="text" name="price" id="idPrice" class="form-control">
					</div>
					<div class = "form-group">
						<label for="idDesc">Description:</label>
						<input type="text" name="description" id="idDesc" class="form-control">
					</div>
					<div class = "form-group">
						<label for="idLatitude">Latitude:</label>
						<input type="text" name="latitude" id="idLatitude" class="form-control">
					</div>
					<div class = "form-group">
						<label for="idLongitude">Longitude:</label>
						<input type="text" name="longitude" id="idLongitude" class="form-control">
					</div>
					<div class = "form-group">
						<label for="idBeds">Beds:</label>
						<input type="text" name="beds" id="idBeds" class="form-control">
					</div>
					<div class = "form-group">
						<label for="idBaths">Baths:</label>
						<input type="text" name="baths" id="idBaths" class="form-control">
					</div>
					<div class = "form-group">
						<label for="idSquare">SquareMeters:</label>
						<input type="text" name="square" id="idSquare" class="form-control">
					</div>
					<div>
						<input type="submit" value="SALVAR" class="btn btn-primary">
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>