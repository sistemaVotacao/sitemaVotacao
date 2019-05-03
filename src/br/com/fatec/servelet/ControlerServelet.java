package br.com.fatec.servelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet(name = "ControlerServelet", urlPatterns = "/sistema")
public class ControlerServelet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String parametro = req.getParameter("log");
		String className = "br.com.fatec.servelet." + parametro;
		try {
			Class<?> classeResponsavel = Class.forName(className);
			Logica log = (Logica) classeResponsavel.newInstance();
			String pagina = log.executar(req, resp);
			req.getRequestDispatcher(pagina).forward(req, resp);
		} catch (Exception e) {
			throw new ServletException("Nome da classe: " + parametro +"!", e);
		}
		
	}
}
