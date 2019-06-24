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
		
	
	<table>
		<tr>
			<th>Nombre</th>
		</tr>
		<!-- OBTIENE LA LISTA -->
		<c:forEach items="${sucursal}" var="sucursal">
		<tr>
			<td>${sucursal.nombre}</td>
		
			<td><form action="${pageContext.request.contextPath}/perfil" method="GET">
			<input type="hidden" name="perfil" value="${sucursal.id_sucursal}"/>
			<input type="submit" value="VER PERFIL">
			</form></td>
			
			<td><form action="${pageContext.request.contextPath}/Editar" method="post">
			<input type="hidden" name="editar" value="${sucursal.id_sucursal}"/>
			<input type="submit" value="EDITAR SUCURSAL">
			</form></td>
			
			<td><form action="${pageContext.request.contextPath}/Delete" method="post">
			<input type="hidden" name="code" value="${sucursal.id_sucursal}"/>
			<input type="submit" value="ELIMINAR SUCURSAL">
			</form></td>
			
		</tr>
		</c:forEach>
	</table>
</body>
</html>