<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adicionar Valor das Diarias</title>
</head>
<body>
<h3>Adicionar Valor das Diarias</h3>
<form action="adicionaValorDiaria" method="post">
Mês: <br />
<input type="text" name="mes" /><br />
Pacote: <br />
<input type="text" name="pacote" /><br />
Valor: <br />
<input type="text" name="valor" /><br />
<input type="submit" value="Adicionar">
</form>
</body>
</html>
