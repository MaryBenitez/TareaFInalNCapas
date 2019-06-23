<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Sucursales</title>
</head>
<body>

	<h1>LISTA DE SUCURSALES</h1>
	
	<table>
		<tr>
			<th>Nombre</th>
			<th>Ubicacion</th>
			<th>Horarios</th>
			<th>Gerente</th>
		</tr>
		<!-- OBTIENE LA LISTA -->
		<c:forEach items="${sucursal}" var="sucursal">
		<tr>
			<td>${sucursal.nombre}</td>
			<td>${sucursal.ubicacion}</td>
			<td>${sucursal.horario}</td>
			<td>${sucursal.gerente}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>