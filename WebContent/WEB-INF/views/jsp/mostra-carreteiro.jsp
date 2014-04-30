<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alterar Carreteiro</title>
</head>
<body>
<h3>Alterar Carreteiro - ${carreteiro.idCarreteiro}</h3>
<form action="alteraCarreteiro" method="post">
<input type="hidden" name="idCarreteiro" value="${carreteiro.idCarreteiro}" />
Nome:<br />
<input type="text" name="nome" value="${carreteiro.nome}" /><br />
CPF:<br />
<input type="text" name="cpf" value="${carreteiro.cpf}" /><br />
telefone:<br />
<input type="text" name="telefone" value="${carreteiro.telefone}" /><br />
celular:<br />
<input type="text" name="celular" value="${carreteiro.celular}" /><br />
email:<br />
<input type="text" name="email" value="${carreteiro.email}" /><br />
<br />
<input type="submit" value="Alterar" />
</form>
</body>
</html>