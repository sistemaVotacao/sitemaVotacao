package br.com.fatec.entidadesBD;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Municipio {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMunicipio;
	
	@ManyToOne
	private UF uf;
	
	@OneToOne
	private Zona zona;
	
	@OneToMany
	private Collection<SecaoEleitoral> listaSecoesEletorais = new ArrayList<SecaoEleitoral>();
	
	private String nomeMunicipio;
	
	public String getNomeMunicipio() {
		return nomeMunicipio;
	}
	public void setNomeMunicipio(String nomeMunicipio) {
		this.nomeMunicipio = nomeMunicipio;
	}
	public  Collection<SecaoEleitoral> getListaSecoesEletorais() {
		return listaSecoesEletorais;
	}
	public  void setListaSecoesEletorais(Collection<SecaoEleitoral> listaSecoesEletorais) {
		this.listaSecoesEletorais = listaSecoesEletorais;
	}
	public  Long getIdMunicipio() {
		return idMunicipio;
	}
	public  void setIdMunicipio(Long idMunicipio) {
		this.idMunicipio = idMunicipio;
	}
	public  UF getUf() {
		return uf;
	}
	public  void setUf(UF uf) {
		this.uf = uf;
	}
	public  Zona getZona() {
		return zona;
	}
	public  void setZona(Zona zona) {
		this.zona = zona;
	}
	
	
}
