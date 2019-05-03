package br.com.fatec.entidadesBD;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class UF {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long UF_ID;
	private String UF;
	
	@OneToMany
	private Collection<Zona> listaZonas = new ArrayList<Zona>();
	
	@OneToMany
	private Collection<Municipio> listaMunicipios = new ArrayList<Municipio>();
	
	@OneToMany
	private Collection<Eleitor> listaEleitores = new ArrayList<Eleitor>();
	
	public Collection<Municipio> getListaMunicipios() {
		return listaMunicipios;
	}
	public void setListaMunicipios(Collection<Municipio> listaMunicipios) {
		this.listaMunicipios = listaMunicipios;
	}
	public Collection<Zona> getListaZonas() {
		return listaZonas;
	}
	public void setListaZonas(Collection<Zona> listaZonas) {
		this.listaZonas = listaZonas;
	}
	public long getUF_ID() {
		return UF_ID;
	}
	public void setUF_ID(long uF_ID) {
		UF_ID = uF_ID;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}
}
