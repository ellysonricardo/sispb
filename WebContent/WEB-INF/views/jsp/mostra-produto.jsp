<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alterar Produto</title>
</head>
<body>
<h3>Alterar Produto - ${produto.idProduto}</h3>
<form action="alteraProduto" method="post">
<input type="hidden" name="idProduto" value="${produto.idProduto}" />
Valor:<br />
<input type="text" name="valor" value="${produto.valor}" /><br />
tipo:<br />
<input type="text" name="tipo" value="${produto.tipo}" /><br />
<br />
<input type="submit" value="Alterar" />
</form>
</body>
</html>