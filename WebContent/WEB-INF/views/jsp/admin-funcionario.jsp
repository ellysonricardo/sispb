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
<title>Adiministra Funcionario</title>
</head>
<body>
<script type="text/javascript">
function removeAgora(id) {
	$.post("removeFuncionario", {'idFuncionario':id}, function() {
   $("#funcionarioApagar_"+id).closest("tr").hide();
	});
	}
</script>
<a href="novoFuncionario">Adicionar novo Funcionario</a>
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
<th>Tipo</th>
<th>Rua</th>

</tr>
<c:forEach items="${funcionarios}" var="funcionario">
<tr id="funcionarioApagar_${funcionario.idFuncionario}">
<td>${funcionario.idFuncionario}</td>
<td>${funcionario.nome}</td>
<td>${funcionario.cpf}</td>
<td>${funcionario.telefone}</td>
<td>${funcionario.celular}</td>
<td>${funcionario.email}</td>
<td>${funcionario.tipo}</td>
<td>${endereco.rua}</td>
<td><a href="#" onClick="removeAgora(${funcionario.idFuncionario})">Remover</a></td>
<td><a href="mostraFuncionario?idFuncionario=${funcionario.idFuncionario}">Alterar</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>