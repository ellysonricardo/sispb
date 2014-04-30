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
function removeAgora(id) {
	$.post("removeCliente", {'idCliente':id}, function() {
   $("#clienteApagar_"+id).closest("tr").hide();
	});
	}
</script>
<a href="novoCliente">Adicionar novo Cliente</a>
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
<c:forEach items="${clientes}" var="cliente">
<tr id="clienteApagar_${cliente.idCliente}">
<td>${cliente.idCliente}</td>
<td>${cliente.nome}</td>
<td>${cliente.cpf}</td>
<td>${cliente.telefone}</td>
<td>${cliente.celular}</td>
<td>${cliente.email}</td>
<td>${cliente.comentario}</td>
<td>${cliente.endereco.rua}</td>
<td>${cliente.endereco.bairro}</td>
<td>${cliente.endereco.complemento}</td>
<td>${cliente.endereco.cidade}</td>
<td>${cliente.endereco.estado}</td>
<td>${cliente.endereco.cep}</td>
<td><a href="#" onClick="removeAgora(${cliente.idCliente})">Remover</a></td>
<td><a href="mostraCliente?idCliente=${cliente.idCliente}">Alterar</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>