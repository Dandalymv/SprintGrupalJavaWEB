<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Varela+Round&display=swap" rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>
<script type="text/javascript">
	function mostrar(id) {
		if (id == "profesional") {
			$("#profesional").show();
			$("#administrativo").hide();
			$("#cliente").hide();

		}

		if (id == "administrativo") {
			$("#profesional").hide();
			$("#administrativo").show();
			$("#cliente").hide();

		}

		if (id == "cliente") {
			$("#profesional").hide();
			$("#administrativo").hide();
			$("#cliente").show();

		}

	}
</script>
</head>
<body>
	<header>
		<%@ include file='navbar.jsp'%>
	</header>


	<div class="container">
		<form class="row g-3" action="CrearUsuario" method="post">
		
			<div class="mb-3">
				<h2>Tipo de usuario a crear:</h2>
				<div class="col-md-3">
					<select id="status" name="status" class="form-select"
						onChange="mostrar(this.value);">
						<option class="form-label" value="">---Seleccionar---</option>
						<option value="profesional">Profesional</option>
						<option value="administrativo">Administrativo</option>
						<option value="cliente">Cliente</option>
					</select>
				</div>
			</div>
		</form>
	
		
<%-- ***********************Formulario Crear Usuario Administrativo*********************** --%>
		<div id="administrativo" style="display: none;">
			<h2>Usuario Administrativo</h2>
			<form class="row g-3" action="CrearUsuario" method="post">
			
				<div class="col-md-4">
				<label class="form-label">Run:</label> 
				<input class="form-control" type="text" name="run" placeholder="ingrese run usuario administrativo"/> 
				</div>
				
				<div class="col-md-4">
				<label class="form-label">Nombre:</label>
				<input class="form-control" type="text" name="nombre" placeholder="ingrese nombre usuario administrativo"/> 
				</div>
				
				<div class="col-md-4">
				<label class="form-label">Fecha de Nacimiento:</label> 
				<input class="form-control" type="date" name="fechaNac" placeholder="ingrese fecha nacimiento usuario administrativo" /> 
				</div>
				
				<div class="col-md-6">
				<label class="form-label">Área:</label> 
				<select class="form-select" name="area">
				<option selected>--Seleccione--</option>
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
					<option selected>--Seleccione--</option>
					<option value="0-1">Entre 0 y 1 año</option>
					<option value="1-2">Entre 1 y 2 años</option>
					<option value="2-5">Entre 2 y 5 años</option>
					<option value="5mas">5 años o más</option>
				</select> 
				</div>
				<div class="col-md-1">
					<input class="btn btn-primary" type="submit" name="send" value="Crear" />
				</div>
			</form>
		</div>
<%-- ************************************************************************************* --%>

<%-- ***********************Formulario Crear Usuario Profesional*********************** --%>
		<div id="profesional" style="display: none;">
			<h2>Usuario Profesional</h2>
			<form class="row g-3" action="CrearUsuario" method="post">
			
				<div class="col-md-4">
					<label class="form-label">Run:</label> 
					<input class="form-control" type="text" name="run" placeholder="ingrese run usuario profesional"/>
				</div>
					
				<div class="col-md-4">
					<label class="form-label">Nombre:</label> 
					<input class="form-control" type="text" name="nombre" placeholder="ingrese nombre usuario profesional"/>
				</div>
				
				<div class="col-md-4">
					<label class="form-label">Fecha de Nacimiento:</label> 
					<input class="form-control" type="date" name="fechaNac"/>
				</div>
				
				<div class="col-md-6">
					<label class="form-label">Título:</label> 
					<input class="form-control" type="text" name="titulo" placeholder="ingrese título usuario profesional"/>
				</div>
				
				<div class="col-md-6">
					<label class="form-label">Fecha de ingreso:</label> 
					<input class="form-control" type="date" name="fechaIngreso" />
				</div>
				
				<div class="col-md-1">
				<input class="btn btn-warning" type="submit" name="send" value="Crear" />
				</div>
								
			</form>
		</div>
<%-- ********************************************************************************** --%>	

<%-- ***********************Formulario Crear Usuario Cliente*********************** --%>
		<div id="cliente" style="display: none;">
			<h2>Usuario Cliente</h2>
			
			<form class="row g-3" action="CrearUsuario" method="post">
				<div class="col-md-4">
					<label class="form-label">Run:</label> 
					<input class="form-control" type="text" name="run" placeholder="ingrese run usuario cliente"/>
				</div>	
				
				<div class="col-md-4">
					<label class="form-label">Nombre:</label> 
					<input class="form-control" type="text" name="nombre" placeholder="ingrese nombre usuario cliente"/>
				</div>
				
				<div class="col-md-4">
					<label class="form-label">Fecha de Nacimiento:</label> 
					<input class="form-control" type="date" name="fechaNac" />
				</div>
				
				<div class="col-md-4">
					<label class="form-label">Rut:</label> 
					<input class="form-control" type="text" name="rut" placeholder="ingrese rut"/>
				</div>
				
				<div class="col-md-4">
					<label class="form-label">Nombres:</label> 
					<input class="form-control" type="text" name="nombres" placeholder="ingrese nombres"/>
				</div>
				
				<div class="col-md-4">
					<label class="form-label">Apellidos:</label> 
					<input class="form-control" type="text" name="apellidos" placeholder="ingrese apellidos usuario cliente"/>
				</div>
				
				<div class="col-md-4">
					<label class="form-label">Teléfono:</label> 
					<input class="form-control" type="text" name="telefono" placeholder="ingrese telefono usuario cliente"/>
				</div>	
					
				<div class="col-md-4">
					<label class="form-label">Dirección:</label> 
					<input class="form-control" type="text" name="direccion" placeholder="ingrese direccion usuario cliente"/>
				</div>
				
				<div class="col-md-4">
					<label class="form-label">Comuna:</label> 
					<input class="form-control" type="text" name="comuna" placeholder="ingrese comuna usuario cliente"/>
				</div>	
					
				<div class="col-md-4">
					<label class="form-label">AFP:</label> <select class="form-select" name="afp">
						<option selected>--Seleccione--</option>
						<option value="Capital">Capital</option>
						<option value="Curpum">Curpum</option>
						<option value="Habitat">Habitat</option>
						<option value="Modelo">Modelo</option>
						<option value="Planvital">Planvital</option>
						<option value="Provida">Provida</option>
						<option value="Uno">Uno</option>
					</select>
				</div>
				
				<div class="col-md-4">
					<label class="form-label">Edad:</label> 
					<input class="form-control" type="number" name="edad" placeholder="ingrese edad usuario cliente"/>
				</div>
				
				<div class="col-md-4">
					<label class="form-label">Sistema de Salud:</label> <select class="form-select"
						name="prevSaludForm">
						<option selected>--Seleccione--</option>
						<option value="Fonasa">Fonasa</option>
						<option value="Isapre">Isapre</option>
					</select>
				</div>
				
				<div class="col-md-1">
					<input class="btn btn-primary" type="submit" name="send"
					value="Crear" />
				</div>	
			</form>
		</div>
	</div>
<%-- ****************************************************************************** --%>

	<footer>
		<h3>Sprint Grupal - JavaWEB - Awakelab</h3>
	</footer>
	
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>