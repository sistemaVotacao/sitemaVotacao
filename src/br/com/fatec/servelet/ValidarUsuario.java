package br.com.fatec.servelet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fatec.DAO.ContatoDAO;
import br.com.fatec.entidadesBD.Eleitor;

public class ValidarUsuario implements Logica{

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ContatoDAO dao = new ContatoDAO();
		String numeroTituloEleitor = null;
		String senha;
			numeroTituloEleitor = request.getParameter("numeroUsuario");
		    senha = request.getParameter("fSenhaFuncionario");
			Eleitor eleitor = dao.getEleitor(numeroTituloEleitor);
			if(eleitor != null && senha.intern() == eleitor.getSenha().intern() && eleitor.getLiberado() == 1) {
				request.setAttribute("eleitor", eleitor);
				request.setAttribute("numeroEleitor", eleitor.getNumeroTituloEleitor());
				dao = new ContatoDAO();
				dao.passarLogEleitor("Eleitor logou para votação", eleitor);
				return "/eleitoresJSP/votar.jsp";
			}
			else if (eleitor != null && eleitor.getLiberado() == 0) {
				request.setAttribute("textoErro", "Usuario não liberado para votação. Dirija-se até um mesário para validação.");
				return "pagina-erro.jsp";
			} else{
				request.setAttribute("textoErro", "Numero de Titulo eleitoral ou senha inválida ou não cadastrada.");
				return "pagina-erro.jsp";
			}
	}

}
