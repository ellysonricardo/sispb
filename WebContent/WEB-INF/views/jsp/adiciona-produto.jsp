<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="sispbData" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="resources/css/jquery.css" />
<script type="text/javascript" src="resources/js/jquery.js"></script>
<script type="text/javascript" src="resources/js/jquery-ui.js"></script>
<title>Adicionar Produto</title>
</head>
<body>
<h3>Adicionar Produto</h3>
<form:errors path="site.texto" />
<form action="adicionaProduto" method="post">
valor: <br />
<input type="text" name="valor" /><br />
tipo: <br />
<input type="text" name="tipo" /><br />
<input type="submit" value="Adicionar">
</form>
</body>
</html>
