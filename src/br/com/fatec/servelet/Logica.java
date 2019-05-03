package br.com.fatec.servelet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Logica {
	public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
