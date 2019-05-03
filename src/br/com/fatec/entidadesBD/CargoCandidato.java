package br.com.fatec.entidadesBD;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CargoCandidato {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdCargo;
	
	@OneToMany
	private Collection<Candidato> listaCandidatos = new ArrayList<Candidato>();
	
	private String cargo;

	public Long getIdCargo() {
		return IdCargo;
	}

	public void setIdCargo(Long idCargo) {
		IdCargo = idCargo;
	}

	public Collection<Candidato> getListaCandidatos() {
		return listaCandidatos;
	}

	public void setListaCandidatos(Collection<Candidato> listaCandidatos) {
		this.listaCandidatos = listaCandidatos;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
}
