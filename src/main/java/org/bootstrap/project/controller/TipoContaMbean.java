package org.bootstrap.project.controller;

import java.util.List;

import javax.faces.model.SelectItem;

import org.bootstrap.project.domain.TipoConta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.javarch.jsf.AbstractCrudManagedBean;
import com.github.javarch.jsf.SelectItemsUtils;

@Component
@Scope("view")
public class TipoContaMbean extends AbstractCrudManagedBean<TipoConta> {
	@Autowired
	SelectItemsUtils selectItens;
	
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

	public List<SelectItem> getTipoContaAsSelectItem() {
		return selectItens.createSelectItems(getRepository().findAll(), "id",
				"denominacao");
	}

}
