<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="sispbData"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="resources/css/jquery.css" />
<script type="text/javascript" src="resources/js/jquery.js"></script>
<script type="text/javascript" src="resources/js/jquery-ui.js"></script>
<title>Adicionar Reserva</title>
</head>
<body>
	<h3>Fazer Pre-Reserva</h3>
	<form action="adicionaReserva" method="post">
		Nome: <br /> 
		<input type="text" name="nome" /><br /> 
		Quantidade de Pessoas: <br /> 
		<input type="text" name="quantidadePessoas" /><br /> 
		Telefone: <br />
		<input type="text" name="telefone" /><br /> 
		Celular: <br /> 
		<input type="text" name="celular" /><br /> 
		Email: <br /> 
		<input type="text" name="email" /><br /> 
		Data Entrada: <br />
		<sispbData:campoData id="dataEntrada" /><br /> 
		Data Saida: <br />
		<sispbData:campoData id="dataSaida" /><br /> 
		<input type="hidden" name="statusReserva" value="1" /> 
		<input type="submit" value="Adicionar">
	</form>
</body>
</html>
