package br.com.regulamogi.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;

/**
 * Representa a Unidade De Saude que realiza o Cadastro ou atualiza as solicita��es
 * @author PauLinHo
 *
 */
@Entity
public class UnidadeDeSaude extends EntidadeDominio{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(unique = true)
	private String nomeUnidade;
	@ElementCollection(fetch=FetchType.EAGER)
	private List<Conta> contas;	

	public UnidadeDeSaude(Long id, String nomeUnidade){
		this(id);
		this.nomeUnidade = nomeUnidade;
	}
	
	public UnidadeDeSaude(Long id){
		this();
		this.setId(id);
	}
	
	public UnidadeDeSaude(){
		contas = new ArrayList<>();
	}
	
	public String getNomeUnidade() {
		return nomeUnidade;
	}
	public void setNomeUnidade(String nomeUnidade) {
		this.nomeUnidade = nomeUnidade.toUpperCase();
	}
	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}


	@Override
	public String toString() {
		return getNomeUnidade();
	}

	
}