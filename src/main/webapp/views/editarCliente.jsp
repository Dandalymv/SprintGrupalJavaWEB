<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="model.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Clientes</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Varela+Round&display=swap" rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>
	<header>
		<%@ include file='navbar.jsp'%>
	</header>

	<section>
		<div class="container">
		<h2 style="text-align: center;">Listado de Capacitaciones</h2>
		<table class="table">
			<thead class="table-dark">
				<tr>
					<th>Id</th>
					<th>Rut cliente</th>
					<th>Dia</th>
					<th>Hora</th>
					<th>Lugar</th>
					<th>Duracion</th>
					<th>Cantidad Asistentes</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="c" items="${cap}">
					<tr>
						<td><c:out value="${c.getId()}"></c:out></td>
						<td><c:out value="${c.getRutCliente()}"></c:out></td>
						<td><c:out value="${c.getDia()}"></c:out></td>
						<td><c:out value="${c.getHora()}"></c:out></td>
						<td><c:out value="${c.getLugar()}"></c:out></td>
						<td><c:out value="${c.getDuracion()}"></c:out></td>
						<td><c:out value="${c.getCantAsist()}"></c:out></td>
					</tr>

				</c:forEach>
			</tbody>

		</table>
		</div>

	</section>

	<footer>
		<h3>Sprint Grupal - JavaWEB - Awakelab</h3>
	</footer>
	
	<script
		src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
		integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js"
		integrity="sha384-VHvPCCyXqtD5DqJeNxl2dtTyhF78xXNXdkwX1CZeRusQfRKp+tA7hAShOK/B/fQ2"
		crossorigin="anonymous"></script>
</body>
</html>