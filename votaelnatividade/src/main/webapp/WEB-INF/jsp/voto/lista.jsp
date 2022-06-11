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
	  <h2>Cadastramento de Votos</h2>

	  <form action="/voto" method="get">
	  	<div class="form-group">
	  		<c:if test="${not empty eleicoes}">
			  	<label>Eleições</label>
			  	<select class="form-control" name="idEleicao">
			    	<c:forEach var="e" items="${eleicoes}">
			    		<option value="${e.id}">${e.descricao}</option>
			    	</c:forEach>
			  	</select>
		  	</c:if>
		</div>
	    <button type="submit" class="btn btn-primary">Nova</button>
	  </form>
	    
	  <hr>
	<c:if test="${not empty lista}">		
		<h2>Total de votos: ${lista.size()}</h2>
		  
		<table class="table table-striped">
		    <thead>
		      <tr>
		       	<th>ID</th>
		        <th>Data</th>
		        <th>Localização</th>
		        <th>Eleitor</th>
		        <th>Candidato</th>
		        <th>Eleicao</th>
		        <th></th>
		      </tr>
		    </thead>
		    <tbody>
		      <c:forEach var="v" items="${lista}">
			      <tr>
			        <td>${v.id}</td>
			        <td>${v.data}</td>
			        <td>${v.localizacao}</td>
			        <td>${v.eleitor.nome}</td>
			        <td>${v.candidato.nome}</td>
			        <td>${v.eleicao.descricao}</td>
			        <td><a href="/voto/${v.id}/excluir">excluir</a></td>
			      </tr>
		      </c:forEach>		      
		    </tbody>
	  	</table>
    </c:if>	  	  

	<c:if test="${empty lista}">		
	  <h2>Não existem votos cadastrados!!!</h2>
	</c:if>

	</div>
</body>
</html>