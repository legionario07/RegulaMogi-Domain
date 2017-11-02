package br.com.regulamogi.domain;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Telefone extends EntidadeDominio {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String numero;
	@Enumerated(EnumType.STRING)
	private TelefoneType telefoneType;
	
	public Telefone(Long id){
		this();
		this.setId(id);
	}
		
	public Telefone(){
		
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public TelefoneType getTelefoneType() {
		return telefoneType;
	}
	public void setTelefoneType(TelefoneType telefoneType) {
		this.telefoneType = telefoneType;
	}
	
}
