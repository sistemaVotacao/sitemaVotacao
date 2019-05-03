package br.com.fatec.servelet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fatec.DAO.ContatoDAO;
import br.com.fatec.entidadesBD.Candidato;

public class ConfereCandidato implements Logica{

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ContatoDAO dao = new ContatoDAO();
		Candidato candidato = dao.getCandidato(request.getParameter("numeroCandidato"));
		response.getWriter().printf("dados", candidato.getNomeCandidato());
		return candidato.getNomeCandidato();
	}

}
