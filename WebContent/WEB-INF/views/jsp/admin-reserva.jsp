<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="resources/js/jquery.js">
</script>
<title>Adiministra Cliente</title>
</head>
<body>
<script type="text/javascript">
function fezDeposito(id) {
	$.post("confirmarDeposito", {'idReserva':id}, function() {
    alert(1);
   	$("#reserva_"+id).html("Deposito Confirmado");
	});
	}
</script>

<script type="text/javascript">
function removeAgora(id) {
	$.post("removeReserva", {'idReserva':id}, function() {
   $("#reservaApagar_"+id).closest("tr").hide();
	});
	}
</script>
<a href="novoReserva">Adicionar novo Reserva</a>
<br />
<br />
<table>
<tr>
<th>ID</th>
<th>nome</th>
<th>CPF</th>
<th>telefone</th>
<th>celular</th>
<th>email</th>
<th>Comentario</th>
<th>Rua</th>
</tr>
<c:forEach items="${reservas}" var="reserva">

<tr id="reservaApagar_${reserva.idReserva}">

<td>${cliente.idCliente}</td>
<td>${reserva.quantidadePessoas}</td>
<c:forEach items="${reserva.clientes}" var="cliente">
<td>${cliente.nome}</td>
<td>${endereco.bairro}</td>

<c:if test="${reserva.statusReserva eq 1}">
<td id="reserva_${reserva.idReserva}">
<a href="#" onClick="fezDeposito(${reserva.idReserva})">
Depositou?
</a>
</td>
</c:if>

<c:if test="${reserva.statusReserva eq 2}">
<td>Confirmado</td>
</c:if>

</c:forEach>
<td><a href="#" onClick="removeAgora(${reserva.idReserva})">Remover</a></td>
<td><a href="mostraReserva?idReserva=${reserva.idReserva}">Alterar</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>