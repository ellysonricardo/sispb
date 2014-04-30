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
<title>Adiministra Carreteiro</title>
</head>
<body>
<script type="text/javascript">
function removeAgora(id) {
	$.post("removeCarreteiro", {'idCarreteiro':id}, function() {
   $("#carreteiroApagar_"+id).closest("tr").hide();
	});
	}
</script>
<a href="novoCarreteiro">Adicionar novo Carreteiro</a>
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
<th>Rua</th>

</tr>
<c:forEach items="${carreteiros}" var="carreteiro">
<tr id="carreteiroApagar_${carreteiro.idCarreteiro}">
<td>${carreteiro.idCarreteiro}</td>
<td>${carreteiro.nome}</td>
<td>${carreteiro.cpf}</td>
<td>${carreteiro.telefone}</td>
<td>${carreteiro.celular}</td>
<td>${carreteiro.email}</td>
<td>${endereco.rua}</td>
<td><a href="#" onClick="removeAgora(${carreteiro.idCarreteiro})">Remover</a></td>
<td><a href="mostraCarreteiro?idCarreteiro=${carreteiro.idCarreteiro}">Alterar</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>