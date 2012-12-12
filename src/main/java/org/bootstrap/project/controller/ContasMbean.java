package org.bootstrap.project.controller;

import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import org.bootstrap.project.domain.Conta;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.javarch.jsf.AbstractCrudManagedBean;

@Component
@Scope("view")
public class ContasMbean extends AbstractCrudManagedBean<Conta>{

	public DataModel<Conta> getFindAllContaUsuarioAsDataModel() {
		DataModel<Conta> dataModel = new ListDataModel<Conta>();
		// TODO pegar do usuario logado, pedente, ds.
		return dataModel; 
	} 
}
