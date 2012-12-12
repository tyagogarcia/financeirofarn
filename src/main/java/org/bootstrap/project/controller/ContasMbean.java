package org.bootstrap.project.controller;

import org.bootstrap.project.domain.Conta;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.javarch.jsf.AbstractCrudManagedBean;

@Component
@Scope("view")
public class ContasMbean extends AbstractCrudManagedBean<Conta>{

}
