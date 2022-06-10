<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Eleitor</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container mt-3">
	  <h2>Cadastramento de Eleitor</h2>
	 
	  <form action="/eleitor/incluir" method="post">
	    <div class="mb-3 mt-3">
	      <label>Código:</label>
	      <input type="number" class="form-control" placeholder="Entre com o codigo" name="codigo" value="">
	    </div>

	    <div class="mb-3 mt-3">
	      <label>Nome:</label>
	      <input type="text" class="form-control" placeholder="Entre com o nome" name="nome" value="">
	    </div>
	    
	    <div class="mb-3 mt-3">
	      <label>Email:</label>
	      <input type="text" class="form-control" placeholder="Entre com o email" name="email" value="">
	    </div>
	    
	    <div class="mb-3 mt-3">
	      <label>Telefone:</label>
	      <input type="text" class="form-control" placeholder="Entre com a telefone" name="telefone" value="">
	    </div>

	    <button type="submit" class="btn btn-primary">Cadastrar</button>
	  </form>
	</div>

</body>
</html>