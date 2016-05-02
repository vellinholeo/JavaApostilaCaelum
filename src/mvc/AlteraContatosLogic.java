package mvc;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Contato;

public class AlteraContatosLogic implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		Contato contatos = new Contato();
		
		contatos.setId(Long.parseLong(req.getParameter("id")));
		contatos.setNome(req.getParameter("nome"));
		contatos.setEmail(req.getParameter("email"));
		contatos.setEndereco(req.getParameter("endereco"));	
		Calendar dataNascimento = null;

		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(req.getParameter("dataNascimento"));
		dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(date);
		
		contatos.setDataNascimento(dataNascimento);
		
		req.setAttribute("contatos", contatos);

		return "WEB-INF/jsp/altera-contato.jsp";
	}
	
}
