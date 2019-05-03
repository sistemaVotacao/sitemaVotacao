package br.com.fatec.entidadesBD;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SecaoEleitoral {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idSecaoEleitoral;
	
	@ManyToOne
	private Municipio municipio;
	
	@ManyToOne
	private Zona zona;
	
	private String local;

	public Long getIdSecaoEleitoral() {
		return idSecaoEleitoral;
	}

	public void setIdSecaoEleitoral(Long idSecaoEleitoral) {
		this.idSecaoEleitoral = idSecaoEleitoral;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
}
