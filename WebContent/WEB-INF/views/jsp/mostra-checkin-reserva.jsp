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
<h3>Fazer Checkin - reserva - ${reserva.idReserva}</h3>
<form action="alteraCheckinReserva" method="get">
<input type="hidden" name="idReserva" value="${reserva.idReserva}" />
Quantidade de Pessoas:<br />
<input type="text" name="quantidadePessoas" value="${cliente.reserva.quantidadePessoas}" /><br />
 Data Saida:<br />
<fmt:formatDate pattern="dd/MM/yyyy" value="${cliente.reserva.dataSaida.time}" var="sispbDataSaida" /> 
<input type="text" name="dataSaida" value="${sispbDataSaida}" /><br />
Data Entrada:<br />
<fmt:formatDate pattern="dd/MM/yyyy" value="${cliente.reserva.dataEntrada.time}" var="sispbDataEntrada" /> 
<input type="text" name="dataEntrada" value="${sispbDataEntrada}" /><br />
<br />
Numero do Quarto: <br />
<input type="text" name="numeroQuarto" /><br /> 
Valor da Diária: <br />
<input type="text" name="valorDiaria" /><br />
<br />
<input type="hidden" name="statusReserva" value="3" />
<input type="submit" value="Alterar" />
</form>
</body>
</html>