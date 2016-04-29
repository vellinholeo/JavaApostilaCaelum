package mvc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ContatoDao;
import Model.Contato;

public class AlteraAdicionaContato implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		Contato contatos = new Contato();
		
		if (req.getAttribute("id") != null) {

			contatos.setId(Long.parseLong(req.getParameter("id")));
			contatos.setNome(req.getParameter("nome"));
			contatos.setEmail(req.getParameter("email"));
			contatos.setEndereco(req.getParameter("endereco"));
			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			Date date = (Date)formatter.parse(req.getParameter("dataNascimento")); 
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			contatos.setDataNascimento(cal);
			
			ContatoDao dao = new ContatoDao();
			
			dao.altera(contatos);

		}else{
			//ADICIONA
		}
		
		req.setAttribute("contatos", contatos);

		return "WEB-INF/jsp/altera-contato.jsp";
	}

}
