<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<head>

<title>Eletronicos</title>

</head>

<body>

	<h1>Eletronicos</h1>
	<div class="lista">
		<table>
			<tr>
				<th>Nome</th>
				<th>Tipo</th>
			</tr>
		<c:forEach items="${listaEletronicos}" var="itemList">
			<tr>
				<td>${itemList.nome}</td>
				<td>${itemList.getNome()}</td>
			</tr>
		</c:forEach>
		</table>
	</div>

</body>
</html>