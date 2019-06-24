<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>INICIO DE SESION</title>
</head>
<body>
	<center><h1>BIENVENIDO</h1></center>
	<center><div class="form">
		<label>Usuario:</label><br><input type="email" name="usuario"/><br><br>
		<label>Clave</label><br><input type="password" name="clave"/><br><br>
		
		<form action="${pageContext.request.contextPath}/ListaSucursales" method="post">
			<input type="submit" value="ENTRAR">
		</form>
		
	
	</div></center>
</body>
</html>