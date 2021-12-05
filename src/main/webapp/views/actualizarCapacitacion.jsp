<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="model.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
	
	<div class="container">
		<h2>Actualizar Capacitación</h2> <br>
		<form class="row g-3" action="ActualizarCapacitacionUpdate" method="post">
		<c:forEach var="c" items="${capas}">
		
			<div class="col-md-1">
				<label>ID</label> 
				<input type="number" name="id" class="form-control" value="${c.getId()}"  placeholder="ID" readonly="readonly">
			</div>
		
			<div class="col-md-3">
				<label>Rut cliente</label> 
				<input type="text" name="rutCliente" class="form-control" value="${c.getRutCliente()}" 
				placeholder="Ingrese un rut sin digito verificador">
			</div>
			
			<div class="col-md-4">
				<label>Dia</label> 
				<input type="text" name="dia" class="form-control" value="${c.getDia()}"  placeholder="Lunes a Domingo">
			</div>
			
			<div class="col-md-4">
				<label>Hora</label> 
				<input type="text" name="hora" class="form-control" value="${c.getHora()}"  placeholder="HH:mm">
			</div>
			
			<div class="col-md-4">
				<label >Lugar</label> 
				<input type="text" name="lugar" class="form-control" value="${c.getLugar()}"  placeholder="Maximo 50 caracteres">
			</div>
			
			<div class="col-md-4">
				<label >Duracion</label> 
				<input type="text" name="duracion" class="form-control" value="${c.getDuracion()}"  placeholder="">
			</div>
			
			<div class="col-md-4">
				<label >Cantidad de asistentes</label> <input
					type="number" name="cantAsist" class="form-control" value="${c.getCantAsist()}"  placeholder="max 100 asistentes">
			</div>
	
			<div class="col-md-1">
			<button type="submit" name="submit" class="btn btn-warning">Actualizar</button>
			</div>
		</c:forEach>
		</form>
	</div>
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