<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="sispbData" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="resources/css/jquery.css" />
<script type="text/javascript" src="resources/js/jquery.js"></script>
<script type="text/javascript" src="resources/js/jquery-ui.js"></script>
<title>Alterar Cliente</title>
</head>
<body>
<h3>Fazer Checkin - ${cliente.idCliente}</h3>
<form action="alteraCheckin" method="get">
<input type="hidden" name="idCliente" value="${cliente.idCliente}" />
<input type="hidden" name="idEndereco" value="${cliente.endereco.idEndereco}" />
<input type="hidden" name="idReserva" value="${cliente.reserva.idReserva}" />
Nome:<br />
<input type="text" name="nome" value="${cliente.nome}" /><br />
Sexo:<br />
F:<input type="radio" name="sexo" value="0">
M:<input type="radio" name="sexo" value="1"><br />
CPF: (ou Passapote:)<br />
<input type="text" name="cpf" value="${cliente.cpf}" /><br />
Data Nascimento: <br />
<sispbData:campoData id="dataNasc"/><br />
telefone:<br />
<input type="text" name="telefone" value="${cliente.telefone}" /><br />
celular:<br />
<input type="text" name="celular" value="${cliente.celular}" /><br />
email:<br />
<input type="text" name="email" value="${cliente.email}" /><br />
Comentario:<br />
<textarea name="comentario" rows="5" cols="100">${cliente.comentario}</textarea>
<br />
<input type="hidden" name="bairro" value="novo" />
<input type="submit" value="Alterar" />
</form>
</body>
</html>