package org.bootstrap.project.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.github.javarch.persistence.orm.hibernate.AbstractPersistable;

@Entity
public class Usuario extends AbstractPersistable implements UserDetails {	
	
	private String username;
	
	private String senha;
	
	@OneToMany(fetch=FetchType.EAGER,mappedBy="usuario")
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

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> permissoes = new ArrayList<GrantedAuthority>();
		for ( Permissao permissao : getPermissoes() ){
			permissoes.add( new SimpleGrantedAuthority( permissao.getPapel().getDenominacao() ));
		}
		return permissoes;
	}

	@Override
	public String getPassword() {
		return senha;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
