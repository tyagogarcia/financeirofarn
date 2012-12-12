package org.bootstrap.project.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.github.javarch.persistence.orm.hibernate.AbstractPersistable;

@Entity
public class Papel extends AbstractPersistable{
	
	private String denominacao;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="papel")	
	private List<Permissao> permissao;

	public String getDenominacao() {
		return denominacao;
	}

	public void setDenominacao(String denominacao) {
		this.denominacao = denominacao;
	}

	public List<Permissao> getPermissao() {
		return permissao;
	}

	public void setPermissao(List<Permissao> permissao) {
		this.permissao = permissao;
	}
	
	
}
