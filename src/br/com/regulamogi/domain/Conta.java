package br.com.regulamogi.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

/**
 * Representa a Conta de Acesso
 * @author PauLinHo
 *
 */
@Entity
public class Conta extends EntidadeDominio{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(unique = true)
	private String login;
	private String senha;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	private Perfil perfil;
	
	public Conta(){
		this.perfil = new Perfil();
	}
	
	public Conta(Long id){
		this();
		setId(id);
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login.toUpperCase();
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Perfil getPerfil() {
		return perfil;
	}
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

}
