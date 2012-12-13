package org.bootstrap.project.webservice.impl;

import java.util.List;

import javax.jws.WebService;

import org.bootstrap.project.domain.Conta;
import org.bootstrap.project.domain.Usuario;
import org.bootstrap.project.webservice.ListarFluxoCaixaWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.javarch.persistence.QueryParameter;
import com.github.javarch.persistence.orm.hibernate.HibernateRepository;

@Component
@WebService(endpointInterface = "org.bootstrap.project.webservice.ListarFluxoCaixaWebService")
public class ListaFluxoCaixaWebServiceImpl implements ListarFluxoCaixaWebService {

	@Autowired
	private HibernateRepository defaultRepository;
	
	@Override
	public List<Conta> getContas(int idUsuario) {

		defaultRepository.setClazz(Usuario.class);
		Usuario usuario = (Usuario)defaultRepository.findOne(idUsuario);
		
		defaultRepository.setClazz(Conta.class);
		
		List contas = defaultRepository.findAllByNamedQuery("Conta.findAllByUsuario",QueryParameter.with("usuario", usuario));
		return contas;
	}

 

}
