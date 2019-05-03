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
public class Zona {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idZona;
	
	@OneToOne
	private Municipio municipio;
	
	@ManyToOne
	private UF uf;
	
	@OneToMany
	private Collection<SecaoEleitoral> listaSecoesEletorais = new ArrayList<SecaoEleitoral>();
	
	public Collection<SecaoEleitoral> getListaSecoesEletorais() {
		return listaSecoesEletorais;
	}
	public void setListaSecoesEletorais(Collection<SecaoEleitoral> listaSecoesEletorais) {
		this.listaSecoesEletorais = listaSecoesEletorais;
	}
	
	public Long getIdZona() {
		return idZona;
	}
	public void setIdZona(Long idZona) {
		this.idZona = idZona;
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
}
