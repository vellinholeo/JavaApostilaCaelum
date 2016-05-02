package mvc;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
		cal.setTime(sdf.parse(req.getParameter("dataNascimento")));
		
		contatos.setDataNascimento(cal);
		
		req.setAttribute("contatos", contatos);

		return "WEB-INF/jsp/altera-contato.jsp";
	}
	
}
