<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="model.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Actualizar Usuario Cliente</title>
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
			<h2>Actualizar Cliente</h2>
			<form class="row g-3" action="ActualizarUsuarioUpdate" method="post">
			<c:forEach var="c" items="${users}">
				<div class="col-md-1">
					<label class="form-label">ID:</label> 
					<input class="form-control" value="${c.getId()}" type="text" name="id" readonly="readonly" />
				</div>
			
				<div class="col-md-3">
					<label class="form-label">Run:</label> 
					<input class="form-control" value="${c.getRun()}" type="text" name="run" />
				</div>	
				
				<div class="col-md-3">
					<label class="form-label">Nombre:</label> 
					<input class="form-control" value="${c.getNombre()}" type="text" name="nombre" />
				</div>
				
				<div class="col-md-3">
					<label class="form-label">Fecha de Nacimiento:</label> 
					<input class="form-control" value="${c.getFechaNac()}" type="date" name="fechaNac" />
				</div>
				
				<div class="col-md-2">
					<label class="form-label">Rut:</label> 
					<input class="form-control" value="${c.getRut()}" type="text" name="rut" />
				</div>
				
				<div class="col-md-3">
					<label class="form-label">Nombres:</label> 
					<input class="form-control" value="${c.getNombres()}" type="text" name="nombres" />
				</div>
				
				<div class="col-md-3">
					<label class="form-label">Apellidos:</label> 
					<input class="form-control" value="${c.getApellidos()}" type="text" name="apellidos" />
				</div>
				
				<div class="col-md-3">
					<label class="form-label">Teléfono:</label> 
					<input class="form-control" value="${c.getDireccion()}" type="text" name="telefono" />
				</div>	
					
				<div class="col-md-3">
					<label class="form-label">Dirección:</label> 
					<input class="form-control" value="${c.getId()}" type="text" name="direccion" />
				</div>
				
				<div class="col-md-3">
					<label class="form-label">Comuna:</label> 
					<input class="form-control" value="${c.getComuna()}" type="text" name="comuna" />
				</div>	
					
				<div class="col-md-3">
					<label class="form-label">AFP:</label> <select class="form-select" name="afp">
						<option value="${c.getAfp()}">${c.getAfp()}</option>
						<option value="Capital">Capital</option>
						<option value="Curpum">Curpum</option>
						<option value="Habitat">Habitat</option>
						<option value="Modelo">Modelo</option>
						<option value="Planvital">Planvital</option>
						<option value="Provida">Provida</option>
						<option value="Uno">Uno</option>
					</select>
				</div>
				
				<div class="col-md-3">
					<label class="form-label">Edad:</label> 
					<input class="form-control" value="${c.getEdad()}" type="number" name="edad" />
				</div>
				
				<div class="col-md-3">
					<label class="form-label">Sistema de Salud:</label> <select class="form-select"
						name="prevSaludForm">
						<option value="${c.getPrevSalud()}">${c.getPrevSalud()}</option>
						<option value="Fonasa">Fonasa</option>
						<option value="Isapre">Isapre</option>
					</select>
				</div>
				
				<div class="col-md-1">
					<input class="btn btn-warning" type="submit" name="send"
					value="Actualizar" />
				</div>
				</c:forEach>	
			</form>
		</div>
</body>
</html>