<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="resources/css/estilo.css" />
<script type="text/javascript" src="resources/js/jquery.min.js"></script>
<script type="text/javascript" src="resources/js/menu.js"></script>
<title>Pousada do Bicão - Ilha Grande</title>
</head>
<body>
	<div id="corpo">
		<c:import url="cabecalho.jsp" />
		<div id="conteudo">
			<div id="esquerda">
				<c:import url="esquerda.jsp" />
			</div>
			<!-- fim da div esquerda -->
			<div id="direita">
				<c:import url="direita.jsp" />
			</div>
			<!-- fim da div direita -->
		</div>
		<!-- fim da div conteudo -->
		<div id="rodape">
			<c:import url="rodape.jsp" />
		</div>
	</div>
	<!-- fim da div corpo -->
</body>
</html>
