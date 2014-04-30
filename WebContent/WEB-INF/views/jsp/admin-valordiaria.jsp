<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adiministra Valor Diaria</title>
</head>
<body>
<a href="NovoValorDiaria">Adicionar novo valor das diarias</a>
<br />
<br />
<table>
<tr>
<th>ID</th>
<th>Mês</th>
<th>Pacote</th>
<th>Valor</th>
</tr>
<c:forEach items="${valorDiarias}" var="valorDiaria">
<tr>
<td>${valorDiaria.idValorDiaria}</td>
<td>${valorDiaria.mes}</td>
<td>${valorDiaria.pacote}</td>
<td>${valorDiaria.valor}</td>
<td><a href="removeValorDiaria?idValorDiaria=${valorDiaria.idValorDiaria}">Remover</a></td>
<td><a href="mostraValorDiaria?idValorDiaria=${valorDiaria.idValorDiaria}">Alterar</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>