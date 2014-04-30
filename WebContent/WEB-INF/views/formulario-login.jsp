<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login e Senha</title>
</head>
<body>
	<form action="efetuaLogin" method="post">
		login:<input type="text" name="login" /><br /> 
		senha:<input type="password" name="senha" /><br /> 
		<input type="submit" value="Entrar no Sistema" />
	</form>
</body>
</html>