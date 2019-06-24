<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PERFIL DE SUCURSALES</title>
</head>
<body>
<center><h1>PERFIL</h1></center>
<table>
		<tr>
			<th>Nombre</th>
			<th>Ubicacion</th>
			<th>Horarios</th>
			<th>Numero de Mesas</th>
			<th>Gerente</th>
		</tr>
		<!-- OBTIENE LA LISTA -->
		<c:forEach items="${sucursal}" var="sucursal">
		<tr>
			<td>${sucursal.nombre}</td>
			<td>${sucursal.ubicacion}</td>
			<td>${sucursal.horario}</td>
			<td>${sucursal.nmesas}</td>
			<td>${sucursal.nomgerente}</td>
			
			<tr>
				<th>Empleados de ${sucursal.nombre}</th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>
				<th></th>

			</tr>
		</c:forEach>
		
		<tr>
		<th>Nombre</th>
		<th>Edad</th>
		<th>Genero</th>
		<th>Estado</th>
	</tr>
	
	</table>
	
</body>
</html>