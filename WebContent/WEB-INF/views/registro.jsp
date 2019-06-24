<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro</title>
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
</head>
<body>
	<center><h1>INGRESE UNA NUEVA SUCURSAL</h1></center>

	<form:form action="${pageContext.request.contextPath}/Guardar" method="post" modelAttribute="sucursal">
	<form:input type="hidden" path="id_sucursal" value="${sucursal.id_sucursal}" />
	<label>Nombre: </label>
	<form:input type="text" value="${sucursal.nombre}" path="nombre"/><br><br>
	<label>Ubicacion: </label>
	<form:input type="text" value="${sucursal.ubicacion}" path="ubicacion"/><br><br>
	<label>Horarios: </label>
	<form:input type="text" value="${sucursal.horario}" path="horario"/><br><br>
	<label>Numero de Mesas: </label>
	<form:input type="number" value="${sucursal.nmesas}" path="nmesas"/><br><br>
	<label>Gerente: </label>
	<form:input type="text" value="${sucursal.nomgerente}" path="nomgerente"/><br><br>
	
	<input type="submit" value="GUARDAR">
	
	<c:choose>
			<c:when test="${respuesta==1}">
				<script>
					swal("Se añadió con exito", {
			 	    	icon: "success",
	 		   		});
				</script>
			</c:when>
		</c:choose>
	
	</form:form>
	
	
	
</body>
</html>