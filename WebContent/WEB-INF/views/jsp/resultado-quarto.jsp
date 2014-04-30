<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="resources/js/jquery.js"></script>
<script type="text/javascript" src="resources/js/calculardata.js"></script>
<title>Adiministra Cliente</title>
</head>
<body>
<script type="text/javascript">
function removeAgora(id) {
	$.post("removeCliente", {'idCliente':id}, function() {
   $("#clienteApagar_"+id).closest("tr").hide();
	});
	}
</script>
<a href="novoCliente">Adicionar novo Cliente</a>
<br />
<br />
<table border="1">
<tr>
<th>ID</th>
<th>nome</th>
<th>dataEntrada</th>
<th>dataSaida</th>
<th>Depositou ?</th>
<th>Quantidade Pessoas</th>
<th>Cancelar</th>
<th>Fazer o Checkin</th>

</tr>
<c:forEach items="${reservas}" var="reserva">
<tr id="clienteApagar_${cliente.idCliente}">
<td>${cliente.idCliente}</td>
<td>${cliente.nome}</td>

<fmt:formatDate pattern="dd/MM/yyyy" value="${reserva.dataSaida.time}" var="sispbDataSaida" /> 
<fmt:formatDate pattern="dd/MM/yyyy" value="${reserva.dataEntrada.time}" var="sispbDataEntrada" /> 
<td>${sispbDataEntrada}</td>
<td>${sispbDataSaida}</td>

<c:if test="${reserva.statusReserva eq 1}">
<td>sem depósito</td>
</c:if>

<c:if test="${reserva.statusReserva eq 2}">
<td>Confirmado</td>
</c:if>

<c:if test="${reserva.statusReserva eq 3}">
<td>Checkin</td>
</c:if>

<td>${reserva.quantidadePessoas}</td>


<td><a href="#" onClick="removeAgora(${cliente.idCliente})">Cancelar a Reserva</a></td>
<td><a href="mostraCheckout?idReserva=${reserva.idReserva}">Fazer o Checkout</a></td>
 </tr>
</c:forEach>
</table>
</body>
</html>