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

<h3>Fazer Checkin - ${cliente.idCliente} - ${endereco.idEndereco} - ${reserva.idReserva}</h3>
<form action="alteraCheckinEndereco" method="post">
<input type="hidden" name="idEndereco" value="${endereco.idEndereco}" />
<input type="hidden" name="idReserva" value="${reserva.idReserva}" />
Rua: <br />
<input type="text" name="rua" /><br />
 Bairro: <br />
<input type="text" name="bairro" /><br />
Cep: <br />
<input type="text" name="cep" /><br />
Cidade: <br />
<input type="text" name="cidade" /><br />
Complemento: <br />
<input type="text" name="complemento" /><br />
Estado: <br />
<input type="text" name="estado" /><br />
numero: <br />
<input type="text" name="numero" /><br />
Pais: <br />
<input type="text" name="pais" /><br />
<input type="submit" value="Alterar" />
</form>
</body>
</html>