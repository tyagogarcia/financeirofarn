package org.bootstrap.project.controller;

import org.bootstrap.project.domain.TipoConta;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.javarch.jsf.AbstractCrudManagedBean;

@Component
@Scope("view")
public class TipoContaMbean extends AbstractCrudManagedBean<TipoConta> {

	private int idTipoConta;

	public TipoContaMbean() {
		super();
	}

	public int getidTipoConta() {
		return idTipoConta;
	}

	public void setidTipoConta(int idTipoConta) {
		this.idTipoConta = idTipoConta;
	}

}
