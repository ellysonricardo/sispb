<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="novoTextoPrincipal">Adicionar novo Site</a>
<br />
<br />
<table>
<tr>
<th>ID</th>
<th>Texto</th>
<th>Foto</th>
</tr>
<c:forEach items="${sites}" var="site">
<tr>
<td>${site.idSite}</td>
<td>${site.texto}</td>
<td>${site.foto}</td>
<td><a href="removeSite?idSite=${site.idSite}">Remover</a></td>
<td><a href="mostraSite?idSite=${site.idSite}">Alterar</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>