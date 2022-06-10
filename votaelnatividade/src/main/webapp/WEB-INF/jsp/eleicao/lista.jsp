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
	  <h2>Cadastramento de Eleição</h2>

	  <form action="/eleicao" method="get">
	    <button type="submit" class="btn btn-primary">Nova</button>
	  </form>
	  
	  <hr>
	<c:if test="${not empty lista}">		
		<h2>Total de eleições: ${lista.size()}</h2>
		  
		<table class="table table-striped">
		    <thead>
		      <tr>
		       	<th>ID</th>
		        <th>Data</th>
		        <th>Descrição</th>
		        <th>Candidatos</th>
		        <th>Voto</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="e" items="${lista}">
			      <tr>
			        <td>${e.id}</td>
			        <td>${e.data}</td>
			        <td>${e.descricao}</td>
			        <td>${e.candidatos.size()}</td>
			        <td>${e.votos.size()}</td>
			        
		        	<td><a href="/eleicao/${e.id}/excluir">excluir</a></td>
			      </tr>
		      </c:forEach>		      
		    </tbody>
	  	</table>
    </c:if>	  	  

	<c:if test="${empty lista}">		
	  <h2>Não existem eleições cadastrados!!!</h2>
	</c:if>

	</div>
</body>
</html>