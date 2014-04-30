<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alterar Funcionario</title>
</head>
<body>
<h3>Alterar Funcionario - ${funcionario.idFuncionario}</h3>
<form action="alteraFuncionario" method="post">
<input type="hidden" name="idFuncionario" value="${funcionario.idFuncionario}" />
Nome:<br />
<input type="text" name="nome" value="${funcionario.nome}" /><br />
CPF:<br />
<input type="text" name="cpf" value="${funcionario.cpf}" /><br />
telefone:<br />
<input type="text" name="telefone" value="${funcionario.telefone}" /><br />
celular:<br />
<input type="text" name="celular" value="${funcionario.celular}" /><br />
email:<br />
<input type="text" name="email" value="${funcionario.email}" /><br />
Tipo:<br />
<input type="text" name="tipo" value="${funcionario.tipo}" /><br />
<br />
<input type="submit" value="Alterar" />
</form>
</body>
</html>