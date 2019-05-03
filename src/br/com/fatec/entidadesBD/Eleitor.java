package br.com.fatec.entidadesBD;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Eleitor{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long numeroTituloEleitor;
	
	@OneToOne
	private Zona zona;
	
	@OneToOne
	private SecaoEleitoral secaoEleitoral;
	
	@OneToOne
	private Municipio municipio;
	
	@OneToOne
	private UF uf;
	
	@ManyToMany
	private Collection<Candidato> candidatos = new ArrayList<Candidato>();
	private int liberado;
	private int votou;
	private String dataNascimento;
	private Date dataEmissao;
	private String senha;
	private String nome;
	
	public Eleitor() {}

	private Eleitor(EleitorBuilder builder) {
		this.nome = builder.nome;
		this.dataNascimento = builder.dataNascimento;
		this.senha = builder.senha;
		this.zona = builder.zona;
		this.secaoEleitoral = builder.secaoEleitoral;
		this.dataEmissao = builder.dataEmissao;
		this.municipio = builder.municipio;
		this.uf = builder.uf;
		this.liberado = 0;
		this.votou = 0;
	}

	public static final class EleitorBuilder {
		private String nome;
		private String dataNascimento;
		private String senha;
		private Municipio municipio;
		private UF uf;
		private Zona zona;
		private SecaoEleitoral secaoEleitoral;
		private Date dataEmissao;
		
		public EleitorBuilder nascidoEm(String string) {
			this.dataNascimento = string;
			return this;
		}
		
		public EleitorBuilder chamado(String nome) {
			this.nome = nome;
			return this;
		}
		
		public EleitorBuilder numeroSenha(String senha) {
			this.senha = senha;
			return this;
		}
		
		public EleitorBuilder numeroZonaEleitoral(Zona zona) {
			this.zona = zona;
			return this;
		}
		
		public EleitorBuilder doMunicipio(Municipio municipio) {
			this.municipio = municipio;
			return this;
		}
		public EleitorBuilder doEstado(UF uf) {
			this.uf = uf;
			return this;
		}

		public EleitorBuilder numeroSecaoEleitoral(SecaoEleitoral secaoEleitoral) {
			this.secaoEleitoral = secaoEleitoral;
			return this;
		}

		public EleitorBuilder dataEmissaoTitulo(Date data) {
			this.dataEmissao = data;
			return this;
		}

		public Eleitor Build() {
			return new Eleitor(this);
		}

	}
	
	
	public Collection<Candidato> getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(Collection<Candidato> candidatos) {
		this.candidatos = candidatos;
	}

	
	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

	public SecaoEleitoral getSecaoEleitoral() {
		return secaoEleitoral;
	}

	public void setSecaoEleitoral(SecaoEleitoral secaoEleitoral) {
		this.secaoEleitoral = secaoEleitoral;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}

	public int getVotou() {
		return votou;
	}

	public void setVotou(int votou) {
		this.votou = votou;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public Long getNumeroTituloEleitor() {
		return numeroTituloEleitor;
	}


	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getLiberado() {
		return liberado;
	}

	public void setLiberado(int liberado) {
		this.liberado = liberado;
	}

	public void setNumeroTituloEleitor(Long numeroTituloEleitor) {
		this.numeroTituloEleitor = numeroTituloEleitor;
	}
	
	
}

