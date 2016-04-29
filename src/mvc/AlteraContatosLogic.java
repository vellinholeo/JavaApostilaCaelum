package mvc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import DAO.ContatoDao;
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
		System.out.println(sdf);
		System.out.println(sdf.parse(req.getParameter("dataNascimento")));
		cal.setTime(sdf.parse(req.getParameter("dataNascimento")));
		
		System.out.println(cal.getTime());
		
		contatos.setDataNascimento(cal);
		
		req.setAttribute("contatos", contatos);

		return "WEB-INF/jsp/altera-contato.jsp";
	}
	
}
