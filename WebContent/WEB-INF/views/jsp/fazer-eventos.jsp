<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fazer Passeio</title>
</head>
<body>
	<h3>Fazer Evento</h3>
	<form action="adicionaEvento" method="post">
		Local do Passeio: <br />
		<select name="idLocal">
		<option value="1">Lopes Mendes</option>
		<option value="2">Lagoa Azul</option>
		<option value="3">Lagoa Verde</option>
		<option value="4">meia volta Ilha</option>
		<option value="5">volta Ilha</option>
		</select> <br />
		Nome da Embarcação: <br /> 
		<select name="idNomeEmbarcacao">
		<option value="1">Dracma</option>
		<option value="2">Seruffo</option>
		<option value="3">Float Boat</option>
		</select> <br />
		Nome da Agencia: <br />
		<select name="idAgencia">
		<option value="1">Aguas Tranquilas</option>
		<option value="2">Bicão tur</option>
		<option value="3">Agencia Ilha Grande</option>
		</select> <br /> 
		Data do Evento: <br /> 
		<input type="text" name="dataEvento" /><br />
		Descrição: <br />
		<textarea rows="5" cols="100" name="descricao"></textarea>
		<br /> <input type="submit" value="Adicionar">
	</form>
</body>
</html>
