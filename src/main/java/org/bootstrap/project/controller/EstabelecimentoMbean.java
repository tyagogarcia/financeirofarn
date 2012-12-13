package org.bootstrap.project.controller;

import java.util.List;

import javax.faces.model.SelectItem;

import org.bootstrap.project.domain.Estabelecimento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.javarch.jsf.AbstractCrudManagedBean;
import com.github.javarch.jsf.SelectItemsUtils;

@Component
@Scope("view")
public class EstabelecimentoMbean extends AbstractCrudManagedBean<Estabelecimento> {
	@Autowired
	SelectItemsUtils selectItens;


	public EstabelecimentoMbean() {
		super();
	}

	public List<SelectItem> getEstabelecimentoAsSelectItem() {
		return selectItens.createSelectItems(getRepository().findAll(), "id",
				"denominacao");
	}
}
