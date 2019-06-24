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

	<center><h1>LISTA DE SUCURSALES</h1></center>
	
		<form action="${pageContext.request.contextPath}/Registro" method="post">
			<input type="submit" value="REGRISTRAR SUCURSAL">
		</form>
		<br>
		<form action="">
			<input type="submit" value="VER PERFIL">
		</form>
		<br>
		<form action="">
			<input type="submit" value="EDITAR SUCURSAL">
		</form>
		<br>
		<form action="">
			<input type="submit" value="ELIMINAR SUCURSAL">
		</form>
	
	<br><br>
	
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
			<td>${sucursal.nomgerente}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>