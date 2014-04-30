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
<script type="text/javascript" src="resources/js/calculardata.js"></script>
<script type="text/javascript" src="resources/js/maskMoney.min.js"></script>
<title>Alterar Cliente</title>
</head>
<body onLoad="javascript:seta_periodo()">
<h3>Fazer Checkout - ${cliente.idCliente}</h3>
<form name="checkout" action="fazerChekout" method="post" >

<input type="hidden" name="idReserva" value="${reserva.idReserva}" />
Numero do Quarto:<br />
${reserva.numeroQuarto}<br />
Quantidade de Pessoas:<br />
<input type="text" name="quantidadePessoas" value="${reserva.quantidadePessoas}" /><br />
Data Entrada:<br />
<fmt:formatDate pattern="dd/MM/yyyy" value="${reserva.dataEntrada.time}" var="sispbDataEntrada" /> 
<input type="text" name="dataEntrada" id="dataEntrada" value="${sispbDataEntrada}" /><br />
 Data Saida:<br />
<fmt:formatDate pattern="dd/MM/yyyy" value="${reserva.dataSaida.time}" var="sispbDataSaida" /> 
<input type="text" name="dataSaida" id="dataSaida" value="${sispbDataSaida}" /><br />
<br />

Quantidade de Dias:<br />
<input type="text" name="numeroDias" id="numeroDias" />
<input type="button" value="ok" onClick="javascript:seta_periodo()" />
<br />

Valor do Deposito:<br />
<!-- mascara para valor monetario :   onKeyUp="maskIt(this,event,'###.###.###,##',true)" dir="rtl"  -->
R$:<input type="text" name="valorDeposito" id="valorDeposito"  value="${reserva.valorDeposito}" />

Valor Diaria:<br />
<!-- mascara para valor monetario :   onKeyUp="maskIt(this,event,'###.###.###,##',true)" dir="rtl"  -->
R$:<input type="text" name="valorDiaria" id="valorDiaria"  value="${reserva.valorDiaria}" />
<input type="button" value="valor Em Reais" onClick="javascript:somarValor()" />

<br />  

<br />
Valor total:<br />
R$:<input type="text" name="valorTotal" id="valorTotal" /><br /><br /> 

<input type="hidden" name="statusReserva" value="3" />
<input type="submit" value="Fecha Reserva" />
</form>
</body>
<script>
  $(function() {
    $('#valorDiarias').maskMoney();
  })
</script>
</html>