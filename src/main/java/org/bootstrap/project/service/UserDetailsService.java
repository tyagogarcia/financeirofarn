package org.bootstrap.project.service;

import org.bootstrap.project.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.github.javarch.persistence.orm.hibernate.HibernateRepository;

@Service("userDetailsService")
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

	@Autowired
	private HibernateRepository defaultRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		defaultRepository.setClazz(Usuario.class);
		Usuario usuario = new Usuario();
		usuario.setUsername(username);
		usuario = (Usuario) defaultRepository.findOneByExample(usuario);
		if ( usuario == null ){
			throw new UsernameNotFoundException("");
		}
		return usuario;
	}
 
}
