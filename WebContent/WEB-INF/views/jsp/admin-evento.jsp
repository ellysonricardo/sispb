
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adiministra Evento</title>
</head>
<body>
<a href="fazerEvento">Adicionar novo Evento</a>
<br />
<br />
<table>
<tr>
<th>ID</th>
<th>Local</th>
<th>Nome da Embarcação</th>
<th>Nome da Agencia</th>
<th>Descrição</th>
</tr>
<c:forEach items="${eventos}" var="evento">
<tr>
<td>${evento.idEvento}</td>
<td>${evento.idLocal}</td>
<td>${evento.idNomeEmbarcacao}</td>
<td>${evento.descricao}</td>
<td><a href="removeEvento?idEvento=${evento.idEvento}">Remover</a></td>
<td><a href="mostraEvento?idEvento=${evento.idEvento}">Alterar</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>