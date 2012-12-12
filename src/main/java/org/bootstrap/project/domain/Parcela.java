package org.bootstrap.project.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.github.javarch.persistence.orm.hibernate.AbstractPersistable;

@Entity
public class Parcela extends AbstractPersistable {
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_conta", nullable = false)
	private Conta conta;

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	

}
