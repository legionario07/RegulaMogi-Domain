package br.com.regulamogi.domain;

/**
 * Representa o Status da Solicitação. Ex. Agendado, Aguardando Agendamento
 * @author PauLinHo
 *
 */
public enum StatusType {

	ENVIADO("Enviado à SMS".toUpperCase()),
	AGUARDANDO_VAGA("Aguardando vaga para Agendamento".toUpperCase()),
	AGENDADO("Agendado".toUpperCase()),
	AGUARDANDO_RETIRADA_GUIA("Aguardando a Retirada da Guia".toUpperCase()),
	AGUARDANDO_DOCUMENTO("Aguardando Documento do Paciente".toUpperCase()),
	DEVOLVIDA("Devolvida à Unidade".toUpperCase()),
	CONCLUIDO("Concluído".toUpperCase());
	
	private String descricao;
	
	private StatusType(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
