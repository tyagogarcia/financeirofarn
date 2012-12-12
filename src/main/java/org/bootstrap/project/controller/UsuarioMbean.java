package org.bootstrap.project.controller;

import org.bootstrap.project.domain.Usuario;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.javarch.jsf.AbstractCrudManagedBean;

@Component
@Scope("view")
public class UsuarioMbean extends AbstractCrudManagedBean<Usuario>{
 
	public UsuarioMbean() {		
		super();
	}
}
