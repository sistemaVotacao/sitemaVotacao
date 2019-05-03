package br.com.fatec.entidadesBD;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LogSistema {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdLog;

	private String dataEHoraLog;
	private String numeroTituloUsuario;
	private String acaoUsuario;
	
	public Long getIdLog() {
		return IdLog;
	}
	public void setIdLog(Long idLog) {
		IdLog = idLog;
	}
	public String getDataEHoraLog() {
		return dataEHoraLog;
	}
	public void setDataEHoraLog(String dataEHoraLog) {
		this.dataEHoraLog = dataEHoraLog;
	}
	public String getNumeroTituloUsuario() {
		return numeroTituloUsuario;
	}
	public void setNumeroTituloUsuario(String numeroTituloUsuario) {
		this.numeroTituloUsuario = numeroTituloUsuario;
	}
	public String getAcaoUsuario() {
		return acaoUsuario;
	}
	public void setAcaoUsuario(String acaoUsuario) {
		this.acaoUsuario = acaoUsuario;
	}
		
	
}
