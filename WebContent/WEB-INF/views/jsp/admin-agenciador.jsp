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
<title>Adiministra Agenciador</title>
</head>
<body>
<script type="text/javascript">
function removeAgora(id) {
	$.post("removeAgenciador", {'idAgenciador':id}, function() {
   $("#agenciadorApagar_"+id).closest("tr").hide();
	});
	}
</script>
<a href="novoAgenciador">Adicionar novo Agenciador</a>
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
<c:forEach items="${agenciadores}" var="agenciador">
<tr id="agenciadorApagar_${agenciador.idAgenciador}">
<td>${agenciador.idAgenciador}</td>
<td>${agenciador.nome}</td>
<td>${agenciador.cpf}</td>
<td>${agenciador.telefone}</td>
<td>${agenciador.celular}</td>
<td>${agenciador.email}</td>
<td>${agenciador.empresa}</td>
<td>${endereco.rua}</td>
<td><a href="#" onClick="removeAgora(${agenciador.idAgenciador})">Remover</a></td>
<td><a href="mostraAgenciador?idAgenciador=${agenciador.idAgenciador}">Alterar</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>