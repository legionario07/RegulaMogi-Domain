package br.com.regulamogi.domain;

/**
 * Representa a Prioridade da Solicitação ex.Urgente
 * @author PauLinHo
 *
 */
public enum TelefoneType{

	CELULAR("Celular".toUpperCase()),
	RESIDENCIAL("Residencial".toUpperCase()),
	RECADO("Recado".toUpperCase()),
	COMERCIAL("Comercial".toUpperCase());
	
	private String descricao;
	
	private TelefoneType(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
