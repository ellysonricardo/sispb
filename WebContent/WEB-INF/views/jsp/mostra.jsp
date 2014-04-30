<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Alterar Site - ${site.idSite}</h3>
<form action="alteraSite" method="post">
<input type="hidden" name="idSite" value="${site.idSite}" />
Texto Principal:<br />
<textarea name="texto" rows="5" cols="100">${site.texto}</textarea>
<br />
Foto:<br />
<input type="text" name="foto" value="${site.foto}" /><br />
<input type="submit" value="Alterar" />
</form>
</body>
</html>