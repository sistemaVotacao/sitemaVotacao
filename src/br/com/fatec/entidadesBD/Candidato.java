package br.com.fatec.entidadesBD;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Candidato {
	@Id 
	private Long NumeroCandidato;
	
	@OneToOne
	private CargoCandidato cargo;
	
	@OneToOne
	private Partido partido;
	
	private Long numeroVotos;
	
	private String nomeCandidato;

	public Long getNumeroCandidato() {
		return NumeroCandidato;
	}

	public void setNumeroCandidato(Long numeroCandidato) {
		NumeroCandidato = numeroCandidato;
	}

	public CargoCandidato getCargo() {
		return cargo;
	}

	public void setCargo(CargoCandidato cargo) {
		this.cargo = cargo;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public Long getNumeroVotos() {
		return numeroVotos;
	}

	public void setNumeroVotos(Long numeroVotos) {
		this.numeroVotos = numeroVotos;
	}

	public String getNomeCandidato() {
		return nomeCandidato;
	}

	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}
	
	
		
}
