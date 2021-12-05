<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="model.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Actualizar Usuario Administrativo</title>
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
			<h2>Actualizar Administrativo</h2>
			
			<form class="row g-3" action="ActualizarUsuarioUpdate" method="post">
				<c:forEach var="u" items="${users}">
				
				<div class="col-md-2">
				<label class="form-label">ID:</label> 
				<input class="form-control"type="text" value="${u.getId()}" name="idusuarios" readonly="readonly"   /> 
				</div>
			
				<div class="col-md-3">
				<label class="form-label">Run:</label> 
				<input class="form-control"type="text" value="${u.getRun()}" name="run" /> 
				</div>
				
				<div class="col-md-3">
				<label class="form-label">Nombre:</label>
				<input class="form-control" type="text" value="${u.getNombre()}" name="nombre" /> 
				</div>
				
				<div class="col-md-4">
				<label class="form-label">Fecha de Nacimiento:</label> 
				<input class="form-control" type="date" value="${u.getFechaNac()}" name="fechaNac" /> 
				</div>
				
				<div class="col-md-6">
				<label class="form-label">Área:</label> 
				<select class="form-select" name="area">
					<option value="${u.getArea()}">${u.getArea()}</option>
					<option value="Jefatura">Jefatura</option>
					<option value="RRHH">RRHH</option>
					<option value="Producción">Producción</option>
					<option value="Finanzas">Finanzas</option>
					<option value="Informática">Informática</option>
					<option value="Ventas">Ventas</option>
					<option value="Otro">Otro</option>
				</select> 
				</div>
				
				<div class="col-md-6">
				<label class="form-label">Experiencia:</label> <select
					class="form-select" name="experiencia">
					<option value="${u.getExperiencia()}">${u.getExperiencia()}</option>
					<option value="0-1">Entre 0 y 1 año</option>
					<option value="1-2">Entre 1 y 2 años</option>
					<option value="2-5">Entre 2 y 5 años</option>
					<option value="5mas">5 años o más</option>
				</select> 
				</div>
				<div class="col-md-1">
					<input class="btn btn-warning" type="submit" name="send" value="Actualizar" />
				</div>
			</c:forEach>
			</form>
		</div>


</body>
</html>