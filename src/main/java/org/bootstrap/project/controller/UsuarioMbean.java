package org.bootstrap.project.controller;

import java.util.List;

import javax.faces.model.SelectItem;

import org.bootstrap.project.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.javarch.jsf.AbstractCrudManagedBean;
import com.github.javarch.jsf.SelectItemsUtils;

@Component
@Scope("view")
public class UsuarioMbean extends AbstractCrudManagedBean<Usuario> {
	@Autowired
	SelectItemsUtils selectItens;

	public UsuarioMbean() {
		super();
	}

	public List<SelectItem> getUsuariosAsSelectItem() {		
		return selectItens.createSelectItems(getRepository().findAll(), "id", 	"username");
	}
}
