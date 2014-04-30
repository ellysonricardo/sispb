<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alterar Valor das Diarias</title>
</head>
<body>
<h3>Alterar Valor das Diarias - ${valorDiaria.idValorDiaria}</h3>
<form action="alteraValorDiaria" method="post">

<input type="hidden" name="idValorDiaria" value="${valorDiaria.idValorDiaria}" />
Mês:<br />
<input type="text" name="mes" value="${valorDiaria.mes}" /><br />
Pacote:<br />
<input type="text" name="pacote" value="${valorDiaria.pacote}" /><br />
Valor:<br />
<input type="text" name="valor" value="${valorDiaria.valor}" /><br />

<br />

<input type="submit" value="Alterar" />
</form>
</body>
</html>