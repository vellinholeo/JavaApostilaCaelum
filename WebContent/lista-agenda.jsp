<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*,
        DAO.*,
        Model.*,
        java.text.SimpleDateFormat" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <body>
    <table>
      <%
      ContatoDao dao = new ContatoDao();
      List<Contato> contatos = dao.getLista();
     // String dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(contato.getDataNascimento().getTime());
      for (Contato contato : contatos ) {
    	  String dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(contato.getDataNascimento().getTime());
      %>
        <tr>
          <td><%=contato.getNome() %></td> 
          <td><%=contato.getEmail() %></td>
          <td><%=contato.getEndereco() %></td>
          <td><%=dataFormatada %></td>
        </tr>
      <%
      }
      %>
    </table>
  </body>
</html>