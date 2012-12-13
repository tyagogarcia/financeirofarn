package org.bootstrap.project.webservice;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.bootstrap.project.domain.Conta;

@WebService
public interface ListarFluxoCaixaWebService {

	List<Conta> getContas(@WebParam(name="idUsuario") int idUsuario);
	
 
}
