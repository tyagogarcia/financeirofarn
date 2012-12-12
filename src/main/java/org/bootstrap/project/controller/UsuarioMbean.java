package org.bootstrap.project.controller;

import org.bootstrap.project.domain.Usuario;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.javarch.jsf.AbstractCrudManagedBean;

@Component
@Scope("view")
public class UsuarioMbean extends AbstractCrudManagedBean<Usuario>{

	private int idPapel;
	
	public UsuarioMbean() {		
		super();
	}

	public int getIdPapel() {
		return idPapel;
	}

	public void setIdPapel(int idPapel) {
		this.idPapel = idPapel;
	}

	
	
}
