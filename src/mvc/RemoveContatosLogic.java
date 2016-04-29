package mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ContatoDao;
import Model.Contato;

public class RemoveContatosLogic implements Logica {

	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

		long id = Long.parseLong(req.getParameter("id"));

		Contato contato = new Contato();
		contato.setId(id);

		ContatoDao dao = new ContatoDao();
		dao.remove(contato);

		System.out.println("Excluindo contato... ");

		return "mvc?logica=ListaContatosLogic";
	}

}