package org.bootstrap.project.controller;

import java.util.List;

import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import org.bootstrap.project.domain.Conta;
import org.bootstrap.project.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.github.javarch.jsf.AbstractCrudManagedBean;
import com.github.javarch.persistence.QueryParameter;
import com.github.javarch.persistence.orm.hibernate.HibernateRepository;

@Component
@Scope("view")
public class ContasMbean extends AbstractCrudManagedBean<Conta>{

	@Autowired
	private HibernateRepository defaultRepository;
	
	public DataModel<Conta> getFindAllContaUsuarioAsDataModel() {
		Usuario usuario = getUsuarioAutenticado();
		
		defaultRepository.setClazz(Usuario.class);
		List contas = defaultRepository.findAllByNamedQuery("Conta.findAllByUsuario",QueryParameter.with("usuario", usuario));
		
		DataModel<Conta> dataModel = new ListDataModel<Conta>(contas);
		return dataModel; 
	}

	private Usuario getUsuarioAutenticado() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		Usuario usuario = (Usuario)auth.getPrincipal();
		return usuario;
	} 
	
	public String cadastrarContaUsuario(){
		Usuario usuario = getUsuarioAutenticado();
		getEntidade().setUsuario(usuario);
		return super.cadastrar();
	}
}
