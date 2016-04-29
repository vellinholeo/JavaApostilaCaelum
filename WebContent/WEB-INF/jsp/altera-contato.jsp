<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Altera contato!</title>
</head>
<body>
	<table>
		<c:import url="cabecalho.jsp" />
		ID:
		<input type="text" name="id" value="${contatos.id}" />
		<br /> Nome:
		<input type="text" name="nome" value="${contatos.nome}" />
		<br /> E-mail:
		<input type="text" name="email" value="${contatos.email}" />
		<br /> Endereco:
		<input type="text" name="endereco" value="${contatos.endereco}" />
		<br /> Data:
		<input type="text" name="data" value="${contatos.dataNascimento.time}" />
		<br />
		<td><a href="mvc?logica=AlteraAdicionaContato&id=${contato.id}&nome=${contato.nome}&endereco=${contato.endereco}&email=${contato.email}&dataNascimento=${contato.dataNascimento}">Altera</a></td>			
	</table>
	<c:import url="rodape.jsp" />	
</body>
</html>