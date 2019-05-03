package br.com.fatec.servelet;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fatec.DAO.ContatoDAO;
import br.com.fatec.entidadesBD.Eleitor;
import br.com.fatec.entidadesBD.Funcionario;

public class ValidarChefe implements Logica{

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String numeroTituloEleitor = null;
		String senha;
		ContatoDAO dao = new ContatoDAO();
		List<Eleitor> eleitores = dao.getEleitoresVotou();
			numeroTituloEleitor = request.getParameter("numeroUsuario");
		    senha = request.getParameter("fSenhaFuncionario");
		    dao = new ContatoDAO();
			Funcionario funcionario = dao.getFuncionario(numeroTituloEleitor);
			if(funcionario != null && senha.intern() == funcionario.getSenha().intern() && funcionario.getCargo().getNomeCargo().intern() == "chefe") {
				request.setAttribute("classe", "conteinerBotoes");
				request.setAttribute("funcionario", funcionario);
				request.setAttribute("eleitores", eleitores);
				request.setAttribute("numeroVotos", eleitores.size());
				return "/funcionariosJSP/painel-funcionarios.jsp";
			}
			else if (funcionario != null && funcionario.getCargo().getNomeCargo().intern() == "mesario") {
				request.setAttribute("textoErro", "Dirija-se para a area da sua respectiva função.");
				return "pagina-erro.jsp";
			} else{
				request.setAttribute("textoErro", "Numero de Titulo eleitoral ou senha inválida ou não cadastrada.");
				return "pagina-erro.jsp";
			}

	}

}
