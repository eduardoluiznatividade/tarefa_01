<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Voto</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	  <h2>Cadastramento de Voto</h2>
	 <form action="/candidato/incluir" method="post">
	    <div class="form-group">
		  	<c:if test="${not empty eleitores}">
		  	<label>Eleitor</label>
		  	<select class="form-control" name="eleitor.id">
		    	<c:forEach var="e" items="${eleitores}">
		    		<option value="${e.id}">${e.nome}</option>
		    	</c:forEach>
		  	</select>
		  	</c:if>
		</div>

	    <div class="mb-3 mt-3">
	      <label>Localização:</label>
	      <input type="text" class="form-control" placeholder="Entre com a descrição" name="localizacao" value="">
	    </div>
	    
	    <div class="form-group">
		  	<c:if test="${not empty eleicao}">
		  	<label>Eleicao</label>
		  	<select class="form-control" name="eleiaco.id">
		    	<c:forEach var="e" items="${eleicao}">
		    		<option value="${e.id}">${e.descricao}</option>
		    	</c:forEach>
		  	</select>
		  	</c:if>
		</div>

	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>

</body>
</html>