package br.com.fatec.servelet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fatec.DAO.ContatoDAO;
import br.com.fatec.entidadesBD.Funcionario;

public class ValidarMesario implements Logica{

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ContatoDAO dao = new ContatoDAO();
		String numeroTituloEleitor = null;
		String senha;
			numeroTituloEleitor = request.getParameter("numeroUsuario");
		    senha = request.getParameter("fSenhaFuncionario");
			Funcionario funcionario = dao.getFuncionario(numeroTituloEleitor);
			if(funcionario != null && senha.intern() == funcionario.getSenha().intern() && funcionario.getCargo().getNomeCargo().intern() == "mesario") {
				request.setAttribute("classe", "conteinerPainelRelatorio");
				request.setAttribute("funcionario", funcionario);
				return "/funcionariosJSP/painel-funcionarios.jsp";
			}
			else if (funcionario != null && funcionario.getCargo().getNomeCargo().intern() == "chefe") {
				request.setAttribute("textoErro", "Dirija-se para a area da sua respectiva função.");
				return "pagina-erro.jsp";
			} else{
				request.setAttribute("textoErro", "Numero de Titulo eleitoral ou senha inválida ou não cadastrada.");
				return "pagina-erro.jsp";
			}

	}

}
