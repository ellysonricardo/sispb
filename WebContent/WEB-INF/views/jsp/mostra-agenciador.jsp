<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alterar Agenciador</title>
</head>
<body>
<h3>Alterar Agenciador - ${agenciador.idAgenciador}</h3>
<form action="alteraAgenciador" method="post">
<input type="hidden" name="idFuncionario" value="${agenciador.idAgenciador}" />
Nome:<br />
<input type="text" name="nome" value="${agenciador.nome}" /><br />
CPF:<br />
<input type="text" name="cpf" value="${agenciador.cpf}" /><br />
telefone:<br />
<input type="text" name="telefone" value="${agenciador.telefone}" /><br />
celular:<br />
<input type="text" name="celular" value="${agenciador.celular}" /><br />
email:<br />
<input type="text" name="email" value="${agenciador.email}" /><br />
Rua:<br />
<input type="text" name="email" value="${endereco.rua}" /><br />
Empresa:<br />
<input type="text" name="tipo" value="${agenciador.empresa}" /><br />
<br />
<input type="submit" value="Alterar" />
</form>
</body>
</html>