package br.com.fatec.entidadesBD;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CargoFuncionario {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdCargoFunc;
	private String nomeCargo;
	
	public Long getIdCargoFunc() {
		return IdCargoFunc;
	}
	public void setIdCargoFunc(Long idCargoFunc) {
		IdCargoFunc = idCargoFunc;
	}
	public String getNomeCargo() {
		return nomeCargo;
	}
	public void setNomeCargo(String nomeCargo) {
		this.nomeCargo = nomeCargo;
	}
	
	
}
