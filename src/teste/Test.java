package teste;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.com.fatec.entidadesBD.Candidato;
import br.com.fatec.entidadesBD.CargoCandidato;
import br.com.fatec.entidadesBD.CargoFuncionario;
import br.com.fatec.entidadesBD.Eleitor;
import br.com.fatec.entidadesBD.Funcionario;
import br.com.fatec.entidadesBD.Municipio;
import br.com.fatec.entidadesBD.Partido;
import br.com.fatec.entidadesBD.SecaoEleitoral;
import br.com.fatec.entidadesBD.UF;
import br.com.fatec.entidadesBD.Zona;
import br.com.fatec.geradoresSenhaNumeroTitulo.GeradorNumeroTitulo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GeradorNumeroTitulo num = new GeradorNumeroTitulo();
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Eleitor eleitor = session.get(Eleitor.class,(long) 3);
		eleitor.setLiberado(0);
		eleitor.setVotou(0);
		
		session.update(eleitor);
				
		session.getTransaction().commit();
		session.close();
		
		/*Zona zona = new Zona();
		Zona zona2 = new Zona();

		Municipio municipio = new Municipio();
		Municipio municipio2 = new Municipio();

		SecaoEleitoral secao = new SecaoEleitoral();
		SecaoEleitoral secao2 = new SecaoEleitoral();
		SecaoEleitoral secao3 = new SecaoEleitoral();
		SecaoEleitoral secao4 = new SecaoEleitoral();
		
		Partido partido1 = new Partido();
		Partido partido2 = new Partido();
		
		CargoCandidato cargo1 = new CargoCandidato();
		cargo1.setCargo("Presidente");
		session.save(cargo1);
		
		partido1.setNomePartido("PT");
		partido1.setNumeroPartido("13");
		
		partido2.setNomePartido("PSL");
		partido2.setNumeroPartido("17");
		
		session.save(partido1);
		session.save(partido2);
		
		Candidato candidato1 = new Candidato();
		Candidato candidato2 = new Candidato();
		
		candidato1.setNomeCandidato("Lula");
		candidato1.setPartido(partido1);
		candidato1.setCargo(cargo1);
		candidato1.setNumeroCandidato((long)14);
		candidato1.setNumeroVotos((long)0);
		partido1.getListaCandidatos().add(candidato1);
		
		candidato2.setNomeCandidato("Bolsonaro");
		candidato2.setPartido(partido2);
		candidato2.setCargo(cargo1);
		candidato2.setNumeroCandidato((long)19);
		candidato2.setNumeroVotos((long)0);
		partido2.getListaCandidatos().add(candidato2);
		
		session.save(candidato1);
		session.save(candidato2);
		
		UF ufSP = new UF();
		ufSP.setUF("SP");

		UF ufMG = new UF();
		ufMG.setUF("MG");

		session.save(ufSP);
		session.save(ufMG);
		
		secao.setLocal("Escola Maria de melo");
		secao2.setLocal("Escola Malba Thereza");
		secao3.setLocal("Escola Alguma Escola de minas 1");
		secao4.setLocal("Escola Alguma Escola de minas 2");

		municipio.setNomeMunicipio("São José dos Campos");
		municipio2.setNomeMunicipio("Abaté");

		zona.getListaSecoesEletorais().add(secao);
		zona.getListaSecoesEletorais().add(secao2);
		zona.setMunicipio(municipio);

		zona2.getListaSecoesEletorais().add(secao3);
		zona2.getListaSecoesEletorais().add(secao4);
		zona2.setMunicipio(municipio2);

		ufSP.getListaZonas().add(zona);
		ufSP.getListaMunicipios().add(municipio);

		ufMG.getListaZonas().add(zona2);
		ufMG.getListaMunicipios().add(municipio2);

		municipio.setUf(ufSP);
		municipio.setZona(zona);

		municipio2.setUf(ufMG);
		municipio2.setZona(zona2);

		zona.setUf(ufSP);

		zona2.setUf(ufMG);

		secao.setZona(zona);
		secao.setMunicipio(municipio);

		secao2.setZona(zona);
		secao2.setMunicipio(municipio);

		secao3.setZona(zona2);
		secao3.setMunicipio(municipio2);

		secao4.setZona(zona2);
		secao4.setMunicipio(municipio2);

		session.save(zona);
		session.save(zona2);
		session.save(municipio);
		session.save(municipio2);
		session.save(secao);
		session.save(secao2);
		session.save(secao3);
		session.save(secao4);
		
		
		
		CargoFuncionario cargoMesario = new CargoFuncionario();
		CargoFuncionario cargoChefe = new CargoFuncionario();
		cargoMesario.setNomeCargo("mesario");
		cargoChefe.setNomeCargo("chefe");
		
		session.save(cargoMesario);
		session.save(cargoChefe);
		
		for(int i = 0; i < 13; i++) {
			SimpleDateFormat simpleData = new SimpleDateFormat("MM/dd/yyyy");
			Eleitor eleitor = new Eleitor.EleitorBuilder()
					.chamado("Eleitor" + Integer.toString(i))
					.nascidoEm(simpleData.format(new Date()))
					.dataEmissaoTitulo(new Date())
					.doEstado(ufSP)
					.numeroSecaoEleitoral(secao)
					.doMunicipio(municipio)
					.numeroZonaEleitoral(zona)
					.numeroSenha("123abc")
					.Build();
			session.save(eleitor);
			if(i==0) {
				Funcionario funcionario = new Funcionario();
				funcionario.setCargo(cargoMesario);
				funcionario.setSenha("funcionario");
				funcionario.setEleitor(eleitor);
				session.save(funcionario);
			}
			else if (i==1) {
				Funcionario funcionario2 = new Funcionario();
				funcionario2.setCargo(cargoChefe);
				funcionario2.setSenha("funcionario");
				funcionario2.setEleitor(eleitor);
				session.save(funcionario2);
			}
		}
		*/

		
		
	}

}
