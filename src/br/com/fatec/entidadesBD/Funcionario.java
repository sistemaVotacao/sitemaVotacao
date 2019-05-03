package br.com.fatec.entidadesBD;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Funcionario {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdFuncionario;
	
	@OneToOne
	@JoinColumn(name = "id_pessoa")
	private Eleitor eleitor;
	
	@OneToOne
	private CargoFuncionario cargo;
	private String senha;
	
	public Long getIdFuncionario() {
		return IdFuncionario;
	}
	public void setIdFuncionario(Long idFuncionario) {
		IdFuncionario = idFuncionario;
	}
	public Eleitor getEleitor() {
		return eleitor;
	}
	public void setEleitor(Eleitor eleitor) {
		this.eleitor = eleitor;
	}
	public CargoFuncionario getCargo() {
		return cargo;
	}
	public void setCargo(CargoFuncionario cargo) {
		this.cargo = cargo;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
