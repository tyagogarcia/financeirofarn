package org.bootstrap.project.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.github.javarch.persistence.orm.hibernate.AbstractPersistable;

@Entity
public class TipoConta extends AbstractPersistable {
		
	private String denominacao;

	@OneToMany(fetch = FetchType.LAZY,mappedBy="tipoConta")	
	private List<Conta> contas;

	public String getDenominacao() {
		return denominacao;
	}

	public void setDenominacao(String denominacao) {
		this.denominacao = denominacao;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	
}
