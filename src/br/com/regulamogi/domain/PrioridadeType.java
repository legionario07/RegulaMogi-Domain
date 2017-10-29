package br.com.regulamogi.domain;

/**
 * Representa a Prioridade da Solicitação ex.Urgente
 * @author PauLinHo
 *
 */
public enum PrioridadeType{

	URGENTE("Urgente".toUpperCase()),
	ROTINA("Rotina".toUpperCase());
	
	private String descricao;
	
	private PrioridadeType(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
