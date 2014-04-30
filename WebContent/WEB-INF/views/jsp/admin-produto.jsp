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
<title>Adiministra Produto</title>
</head>
<body>
<script type="text/javascript">
function removeAgora(id) {
	$.post("removeProduto", {'idProduto':id}, function() {
   $("#produtoApagar_"+id).closest("tr").hide();
	});
	}
</script>
<a href="novoProduto">Adicionar novo Produto</a>
<br />
<br />
<table>
<tr>
<th>ID</th>
<th>valor</th>
<th>tipo</th>

</tr>
<c:forEach items="${produtos}" var="produto">
<tr id="produtoApagar_${produto.idProduto}">
<td>${produto.idProduto}</td>
<td>${produto.valor}</td>
<td>${produto.tipo}</td>
<td><a href="#" onClick="removeAgora(${produto.idProduto})">Remover</a></td>
<td><a href="mostraProduto?idProduto=${produto.idProduto}">Alterar</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>