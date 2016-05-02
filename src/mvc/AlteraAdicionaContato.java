package mvc;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ContatoDao;
import Model.Contato;

public class AlteraAdicionaContato implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		Contato contatos = new Contato();
		ListaContatosLogic lcl = new ListaContatosLogic();

		if (req.getParameter("id") != null) {
			System.out.println("Entrou no if " + req.getParameter("nome"));
			contatos.setId(Long.parseLong(req.getParameter("id")));
			contatos.setNome(req.getParameter("nome"));
			contatos.setEmail(req.getParameter("email"));
			contatos.setEndereco(req.getParameter("endereco"));
			Calendar dataNascimento = null;

			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(req.getParameter("dataNascimento"));
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(date);
			
			contatos.setDataNascimento(dataNascimento);

			ContatoDao dao = new ContatoDao();

			dao.altera(contatos);
			return lcl.executa(req, res);

		} else {
			contatos.setNome(req.getParameter("nome"));
			contatos.setEmail(req.getParameter("email"));
			contatos.setEndereco(req.getParameter("endereco"));
			Calendar dataNascimento = null;

			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(req.getParameter("dataNascimento"));
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(date);
			
			contatos.setDataNascimento(dataNascimento);

			ContatoDao dao = new ContatoDao();
			dao.adiciona(contatos);
			return lcl.executa(req, res);
		}

		// req.setAttribute("contatos", contatos);

		// return "WEB-INF/jsp/altera-contato.jsp";
	}

}
