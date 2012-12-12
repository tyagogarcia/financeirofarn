package org.bootstrap.project.controller;

import java.util.List;

import javax.faces.model.SelectItem;

import org.bootstrap.project.domain.Papel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.javarch.jsf.SelectItemsUtils;
import com.github.javarch.persistence.orm.hibernate.HibernateRepository;

@Component
@Scope("view")
public class PapelMbean {

	@Autowired
	SelectItemsUtils selectItens;
	
	@Autowired 
	HibernateRepository defaultRepository;
	
	public List<SelectItem> getPapeisAsSelectItem(){
		defaultRepository.setClazz(Papel.class);
		return selectItens.createSelectItems(defaultRepository.findAll()	, "id", "denominacao");
	}
}
