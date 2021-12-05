<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contacto</title>
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
		<h2 style="text-align:center;">Formulario de contacto</h2>
		
		<form class="row g-3" action="Contacto" method="post">
				<div class="col-md-4">
					<label for="inputname">Nombre</label> 
					<input type="text" name = "nombre" class="form-control" id="Nombre" placeholder = "ingrese nombre de contacto"/>
				</div>
				
				<div class="col-md-4">
					<label class="form-label" for="inputEmail4">Email</label> 
					<input type="email" name = "email" class="form-control" placeholder = "ingrese correo electrónico de contacto"/>
				</div>
	
				<div class="col-md-4">
					<label for="inputState">Sexo</label> 
					<select id="inputState" name = "sexo" class="form-control">
						<option selected>--Seleccione--</option>
						<option>Masculino</option>
						<option>Femenino</option>
						<option>Prefiero no indicar...</option>
					</select>
				</div>
			
				<div class="col-md-4">
					<label for="inputAddress">Dirección</label> 
					<input type="text" name = "direccion" class="form-control" placeholder="ingrese direccion de contacto"/>
				</div>
				
				
				<div class=" col-md-4">
					<label for="inputCity">Ciudad</label> 
					<input type="text" name = "ciudad" class="form-control" placeholder="ingrese ciudad de contacto"/>
				</div>
				
				<div class="col-md-4">
					<label for="inputState">Region</label> 
					<select id="inputState" name = "region" class="form-control">
						<option selected>Region...</option>
						<option>REGION XV DE ARICA Y PARINACOTA</option>
						<option>REGION I DE TARAPACA</option>
						<option>REGION II DE ANTOFAGASTA</option>
						<option>REGION III DE ATACAMA</option>
						<option>REGION IV DE COQUIMBO</option>
						<option>REGION V DE VALPARAISO</option>
						<option>REGION METROPOLITANA</option>
						<option>REGION VI DEL LIBERTADOR GRAL B.OHIGGINS</option>
						<option>REGION VII DEL MAULE</option>
						<option>REGIÓN XVI DE ÑUBLE</option>
						<option>REGION VIII DEL BIO-BIO</option>
						<option>REGION IX DE LA ARAUCANIA</option>
						<option>REGION XIV DE LOS RIOS</option>
						<option>REGION X DE LOS LAGOS</option>
						<option>REGION XI DE AYSEN</option>
						<option>REGION XII DE MAGALLANES Y ANTARTICA CHILENA</option>
						<option>OTRO PAÍS</option>
						
					</select>
				</div>
				
				<div class="col-md-1">
					<button type="submit" class="btn btn-warning">Enviar</button>
				</div>
		</form>
	</div>
	<footer>
		<h3>Sprint Grupal - JavaWEB - Awakelab</h3>
	</footer>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>