<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="model.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Actualizar Usuario Profesional</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Varela+Round&display=swap"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>
</head>
<body>
	<header>
		<%@ include file='navbar.jsp'%>
	</header>

	<div class="container">
				
			<h2>Usuario Profesional</h2>
			<form class="row g-3" action="ActualizarUsuarioUpdate" method="post">
			<c:forEach var="u" items="${users}">
				<div class="col-md-4">
					<label class="form-label">ID:</label> 
					<input class="form-control" value="${u.getId()}" type="text" name="id"  readonly="readonly" />
				</div>
			
				<div class="col-md-4">
					<label class="form-label">Run:</label> 
					<input class="form-control" value="${u.getRun()}" type="text" name="run" />
				</div>
					
				<div class="col-md-4">
					<label class="form-label">Nombre:</label> 
					<input class="form-control" value="${u.getNombre()}" type="text" name="nombre" />
				</div>
				
				<div class="col-md-4">
					<label class="form-label">Fecha de Nacimiento:</label> 
					<input class="form-control"  value="${u.getFechaNac()}"type="date" name="fechaNac" />
				</div>
				
				<div class="col-md-4">
					<label class="form-label">T�tulo:</label> 
					<input class="form-control" value="${u.getTitulo()}" type="text" name="titulo" />
				</div>
				
				<div class="col-md-4">
					<label class="form-label">Fecha de ingreso:</label> 
					<input class="form-control" value="${u.getFechaIngreso()}" type="date" name="fechaIngreso" />
				</div>
				
				<div class="col-md-1">
				<input class="btn btn-warning" type="submit" name="send" value="Actualizar" />
				</div>
				</c:forEach>				
			</form>
			
		</div>
</body>
</html>