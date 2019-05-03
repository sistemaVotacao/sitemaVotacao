package br.com.fatec.DAO;

import java.util.ArrayList;
import java.util.Date;

import org.hibernate.Session;

import br.com.fatec.connectors.ConnectionFactory;
import br.com.fatec.entidadesBD.Candidato;
import br.com.fatec.entidadesBD.Eleitor;
import br.com.fatec.entidadesBD.Funcionario;
import br.com.fatec.entidadesBD.LogSistema;

public class ContatoDAO {
	private Session session;
	

	public ContatoDAO() {
		this.session = new ConnectionFactory().getConnection();
	}

	public Eleitor getEleitor(String numeroTituloEleitor) throws Exception {
		Eleitor eleitor = session.get(Eleitor.class, Long.parseLong(numeroTituloEleitor));
		session.close();
		return eleitor;
		
	}
	
	public Candidato getCandidato(String numeroCandidato) throws Exception {
		Candidato candidato = session.get(Candidato.class, Long.parseLong(numeroCandidato));
		session.close();
		return candidato;
		
	}
	
	public String updateVotou(String numeroTituloEleitor, int nVoto) {
		try {
			Eleitor eleitor = getEleitor(numeroTituloEleitor);
			eleitor.setVotou(nVoto);
			session.update(eleitor);
			session.close();
			return "Voto cadastrado";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Usuario nao encontrado";
		}
	}

	public Funcionario getFuncionario(String numeroTituloEleitor) {
		Funcionario funcionario = session.get(Funcionario.class, Long.parseLong(numeroTituloEleitor));
		session.close();
		return funcionario;
		/*int i = 1;
		while (true) {
			funcionario = session.get(Funcionario.class, (long) i);
			if (funcionario != null && Long.toString(funcionario.getEleitor().getNumeroTituloEleitor()).intern() == numeroTituloEleitor.intern()) {
				session.close();
				return funcionario;
			} else if (funcionario == null) {
				session.close();
				return null;
			} else {
				i++;
			}
		}*/
	}
	
	public void passarLogEleitor(String log, Eleitor eleitor) {
		LogSistema lg = new LogSistema();
		lg.setAcaoUsuario(log);
		lg.setDataEHoraLog((new Date()).toString());
		lg.setNumeroTituloUsuario((eleitor.getNumeroTituloEleitor()).toString());
		session.save(lg);
		session.getTransaction().commit();
		session.close();
	}
	
	public ArrayList<Eleitor> getEleitoresVotou() {
		ArrayList<Eleitor> lista = new ArrayList<>();
		Eleitor eleitor;
		int i = 1;
		while (true) {
			eleitor = session.get(Eleitor.class, (long) i);
			if (eleitor != null && (eleitor.getVotou()) == 1) {
				lista.add(eleitor);
			} else if(eleitor == null) {
				session.close();
				return lista;
			}
			i++;
		}
	}
	
	public void updateEleitor(Eleitor eleitor) {
		eleitor.setVotou(1);
		session.update(eleitor);
		session.getTransaction().commit();
		session.close();
	}
	public void updateCandidato(Candidato candidato) {
		session.update(candidato);
		session.getTransaction().commit();
		session.close();
	}
}
