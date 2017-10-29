package br.com.regulamogi.domain;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Representa a Solicitação, guia solicitada pelo Medico ao Paciente
 * @author PauLinHo
 *
 */
@Entity
public class Solicitacao extends EntidadeDominio{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false) @Temporal(TemporalType.DATE)
	private Calendar dataConsulta;
	@Column(nullable = false) @Temporal(TemporalType.DATE)
	private Calendar dataEnvio;
	private String numeroMemorando;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	private UnidadeDeSaude unidadeDeSaude;
	@Enumerated(EnumType.STRING)
	private PrioridadeType prioridade;
	@Enumerated(EnumType.STRING)
	private StatusType status;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	private Especialidade especialidade;
	
	public Solicitacao(Long id){
		this();
		this.setId(id);
	}
	
	public Solicitacao(){
		unidadeDeSaude = new UnidadeDeSaude();
		especialidade = new Especialidade();
	}
	
	public Calendar getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(Calendar dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	public Calendar getDataEnvio() {
		return dataEnvio;
	}
	public void setDataEnvio(Calendar dataEnvio) {
		this.dataEnvio = dataEnvio;
	}
	public String getNumeroMemorando() {
		return numeroMemorando;
	}
	public void setNumeroMemorando(String numeroMemorando) {
		this.numeroMemorando = numeroMemorando;
	}
	public UnidadeDeSaude getUnidadeDeSaude() {
		return unidadeDeSaude;
	}
	public void setUnidadeDeSaude(UnidadeDeSaude unidadeDeSaude) {
		this.unidadeDeSaude = unidadeDeSaude;
	}
	public PrioridadeType getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(PrioridadeType prioridade) {
		this.prioridade = prioridade;
	}
	public StatusType getStatus() {
		return status;
	}
	public void setStatus(StatusType status) {
		this.status = status;
	}
	public Especialidade getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	

}
