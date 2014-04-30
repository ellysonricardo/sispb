<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
		<div id="texto">
		
					<p align="justify">
						<font face="Helvetica, Arial,  sans-serif">
						
						<c:forEach items="${sites}" var="site">

${site.foto}
<br /><br /><br /><br /><br />
${site.texto}

</c:forEach>

						 
						</font>
					</p>
				</div> <!-- fim da div texto -->