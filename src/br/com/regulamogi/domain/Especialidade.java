package br.com.regulamogi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Representa a Especialidade Solicitada pelo Médico
 * @author PauLinHo
 *
 */
@Entity
public class Especialidade extends EntidadeDominio{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(unique = true, nullable = false)
	private String especialidade;

	public Especialidade(Long id, String especialidade){
		this(id);
		this.especialidade = especialidade;
	}
	
	public Especialidade(Long id){
		this();
		this.setId(id);
	}
	
	public Especialidade(){
		
	}
	
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade.toUpperCase();
	}
	
	
	@Override
	public String toString() {
		return this.getEspecialidade();
	}
	
}
