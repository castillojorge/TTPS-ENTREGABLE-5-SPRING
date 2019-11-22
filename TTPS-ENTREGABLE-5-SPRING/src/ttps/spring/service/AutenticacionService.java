package ttps.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ttps.spring.clasesDAOImplHibernateJPA.UsuarioDAOHibernateJPA;
import ttps.spring.model2019.Usuario;

@Service
public class AutenticacionService {
	
	@Autowired
	private UsuarioDAOHibernateJPA usuarioRepositorio;
	
	public Usuario login(String email,String pass) {
		if(usuarioRepositorio.existeUsuario_by_email(email)) {
			return usuarioRepositorio.recuperarUsuario_by_email_and_password(email, pass);
		}
		return null;
	}
	
}
