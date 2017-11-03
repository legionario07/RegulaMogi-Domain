package br.com.regulamogi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Representa o perfil de acesso ex(UnidadeDeSaude, DAT, GERENTE, PAciente)
 * @author PauLinHo
 *
 */
@Entity
public class Perfil extends EntidadeDominio{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(unique = true, nullable =false)
	private String perfil;
	
	public Perfil(Long id, String perfil){
		this(id);
		this.perfil = perfil;
	}
	
	public Perfil(Long id){
		this();
		this.setId(id);
	}
	
	public Perfil(){
		
	}
	
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil.toUpperCase();
	}
	
	@Override
	public String toString() {
		return getPerfil();
	}
	
}
