<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AppMIT</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	  <h2>Cadastramento de Candidatos</h2>

	  <form action="/candidato" method="get">
	    <button type="submit" class="btn btn-primary">Nova</button>
	  </form>
	  
	  <hr>
	<c:if test="${not empty lista}">		
		<h2>Total de candidatos: ${lista.size()}</h2>
		  
		<table class="table table-striped">
		    <thead>
		      <tr>
		       	<th>ID</th>
		        <th>Numero</th>
		        <th>Nome</th>
		        <th>Eleição</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="c" items="${lista}">
			      <tr>
			        <td>${c.id}</td>
			        <td>${c.numero}</td>
			        <td>${b.nome}</td>
			        <td>${b.eleicao.descricao}</td>
			        <td><a href="/candidato/${c.id}/excluir">excluir</a></td>
			      </tr>
		      </c:forEach>		      
		    </tbody>
	  	</table>
    </c:if>	  	  

	<c:if test="${empty lista}">		
	  <h2>Não existem candidatos cadastrados!!!</h2>
	</c:if>

	</div>
</body>
</html>