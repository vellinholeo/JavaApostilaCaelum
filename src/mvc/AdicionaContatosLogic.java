package mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.Contato;

public class AdicionaContatosLogic implements Logica{
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

//		Contato contatos = new Contato();
//		
//		req.setAttribute("contatos", contatos);
		
		return "WEB-INF/jsp/adiciona-contato.jsp";
	}

}
