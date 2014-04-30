<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alterar Evento</title>
</head>
<body>
<h3>Alterar Evento - ${Evento.idCliente}</h3>
<form action="alteraEvento" method="post">
<input type="hidden" name="idEvento" value="${evento.idEvento}" />
Nome da Embarcação:<br />
<input type="text" name="idNomeEmbarcacao" value="${evento.idNomeEmbarcacao}" /><br />
Agencia:<br />
<input type="text" name="idAgencia" value="${evento.idAgencia}" /><br />
Local do Passeio:<br />
<input type="text" name="idLocal" value="${evento.idLocal}" /><br />
Descrição:<br />
<textarea name="descricao" rows="5" cols="100">${evento.descricao}</textarea>
<br />
<input type="submit" value="Alterar" />
</form>
</body>
</html>