package org.bootstrap.project.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.github.javarch.persistence.orm.hibernate.AbstractPersistable;

@Entity
public class Usuario extends AbstractPersistable  {	
	
	private String username;
	
	private String senha;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="usuario")
	private List<Permissao> permissoes;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="usuario")
	private List<Conta> contas;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Permissao> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(List<Permissao> permissoes) {
		this.permissoes = permissoes;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	

}
