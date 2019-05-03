package br.com.fatec.entidadesBD;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Partido {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IDPartido;
	
	@OneToMany
	private Collection<Candidato> listaCandidatos = new ArrayList<Candidato>();
	
	private String NumeroPartido;
	private String nomePartido;
	
	
	public Long getIDPartido() {
		return IDPartido;
	}
	public void setIDPartido(Long iDPartido) {
		IDPartido = iDPartido;
	}
	public String getNumeroPartido() {
		return NumeroPartido;
	}
	public void setNumeroPartido(String numeroPartido) {
		NumeroPartido = numeroPartido;
	}
	public Collection<Candidato> getListaCandidatos() {
		return listaCandidatos;
	}
	public void setListaCandidatos(Collection<Candidato> listaCandidatos) {
		this.listaCandidatos = listaCandidatos;
	}
	public String getNomePartido() {
		return nomePartido;
	}
	public void setNomePartido(String nomePartido) {
		this.nomePartido = nomePartido;
	}

	
	
}
