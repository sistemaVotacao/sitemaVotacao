package br.com.fatec.servelet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fatec.DAO.ContatoDAO;
import br.com.fatec.entidadesBD.Candidato;
import br.com.fatec.entidadesBD.Eleitor;

public class ComputarVoto implements Logica{

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ContatoDAO dao = new ContatoDAO();
		String numeroCandidato = request.getParameter("entrada");
		String numeroTituloEleitor = request.getParameter("eleitor");
		Eleitor eleitor = dao.getEleitor(numeroTituloEleitor);
		eleitor.setVotou(Integer.parseInt(numeroCandidato));
		dao = new ContatoDAO();
		dao.updateEleitor(eleitor);
		dao = new ContatoDAO();
		Candidato candidato = dao.getCandidato(numeroCandidato);
		candidato.setNumeroVotos(candidato.getNumeroVotos()+1);
		dao = new ContatoDAO();
		dao.updateCandidato(candidato);
		
		return "/eleitoresJSP/computado-sucesso.jsp";
	}

}
