<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alterar Cliente</title>
</head>
<body>
<h3>Alterar Reserva - ${cliente.idCliente}</h3>
<form action="alteraReserva" method="post">
<input type="hidden" name="idCliente" value="${cliente.idCliente}" />
Nome:<br />
<input type="text" name="nome" value="${clientes.nome}" /><br />
IdReserva:<br />
<input type="text" name="nome" value="${reserva.idReserva}" /><br />
email:<br />
<input type="text" name="email" value="${cliente.email}" /><br />
Bairro:<br />
<input type="text" name="rua" value="${endereco.bairro}" /><br />

<input type="submit" value="Alterar" />
</form>
</body>
</html>