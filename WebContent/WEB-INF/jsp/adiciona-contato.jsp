<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="leo"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/jquery.css" rel="stylesheet">
<script src="js/jquery.js"></script>
<script src="js/jquery-ui.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adiciona</title>	
</head>
<body>
	<form action="mvc?logica=AlteraAdicionaContato" method="post">
		<c:import url="cabecalho.jsp" />
		<br /> Nome:
		<input type="text" name="nome" value="${contatos.nome}" />
		<br /> E-mail:
		<input type="text" name="email" value="${contatos.email}" />
		<br /> Endereco:
		<input type="text" name="endereco" value="${contatos.endereco}" />
		<br /> Data:
		<input type="text" id="data" name="dataNascimento" value="<fmt:formatDate value="${contatos.dataNascimento.time}" pattern="dd/MM/yyyy" />" />
		<leo:campoData id="data"/>
		<br />
		<td><input type="submit" value""></td>
		
	</form>
	<c:import url="rodape.jsp" />
</body>
</html>