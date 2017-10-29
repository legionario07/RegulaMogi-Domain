package br.com.regulamogi.domain;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Representa o paciente
 * @author PauLinHo
 *
 */
@Entity
public class Paciente extends EntidadeDominio{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(unique = true)
	private String SIS;
	private String nome;
	private String celular;
	private String telefone;
	@Column(nullable = false) @Temporal(TemporalType.TIMESTAMP)
	private Calendar lastLogin;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	private Conta conta;
	@ElementCollection(fetch=FetchType.EAGER)
	private List<Solicitacao> solicitacoes;
	
	public Paciente(String SIS){
		this();
		this.SIS = SIS;
	}
	
	public Paciente(Long id){
		this();
		this.setId(id);
	}
	
	public Paciente(){
		conta = new Conta();
		solicitacoes= new ArrayList<>();
	}
	
	public String getSIS() {
		return SIS;
	}
	public void setSIS(String sIS) {
		SIS = sIS;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getNome();
	}

	public Calendar getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Calendar lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Solicitacao> getSolicitacoes() {
		return solicitacoes;
	}

	public void setSolicitacoes(List<Solicitacao> solicitacoes) {
		this.solicitacoes = solicitacoes;
	}

}
