package br.com.regulamogi.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import br.com.regulamogi.utils.RemoveAcentoUtil;

/**
 * Representa a Unidade De Saude que realiza o Cadastro ou atualiza as solicitações
 * @author PauLinHo
 *
 */
@Entity
public class UnidadeDeSaude extends EntidadeDominio{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(unique = true, nullable = false)
	private String nomeUnidade;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Conta conta;	

	

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public UnidadeDeSaude(Long id, String nomeUnidade){
		this(id);
		this.nomeUnidade = nomeUnidade;
	}
	
	public UnidadeDeSaude(Long id){
		this();
		this.setId(id);
	}
	
	public UnidadeDeSaude(){
		conta = new Conta();
	}
	
	public String getNomeUnidade() {
		return nomeUnidade;
	}
	public void setNomeUnidade(String nomeUnidade) {
		this.nomeUnidade = RemoveAcentoUtil.semAcento(nomeUnidade).toUpperCase();
	}

	@Override
	public String toString() {
		return getNomeUnidade();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeUnidade == null) ? 0 : nomeUnidade.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UnidadeDeSaude other = (UnidadeDeSaude) obj;
		if (nomeUnidade == null) {
			if (other.nomeUnidade != null)
				return false;
		} else if (!nomeUnidade.equals(other.nomeUnidade))
			return false;
		return true;
	}

	
}
