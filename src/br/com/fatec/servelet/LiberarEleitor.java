package br.com.fatec.servelet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fatec.DAO.ContatoDAO;
import br.com.fatec.entidadesBD.Eleitor;

public class LiberarEleitor implements Logica{

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ContatoDAO dao = new ContatoDAO();
		String numeroTituloEleitor = request.getParameter("numeroEleitor");
		Eleitor eleitor = dao.getEleitor(numeroTituloEleitor);
		eleitor.setLiberado(1);
		dao = new ContatoDAO();
		dao.updateEleitor(eleitor);
		return "/eleitoresJSP/eleitorLiberado.jsp";
	}

}
