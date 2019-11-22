package ttps.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ttps.spring.clasesDAO.UsuarioDAO;
import ttps.spring.clasesDAOImplHibernateJPA.UsuarioDAOHibernateJPA;
import ttps.spring.model2019.Usuario;

@Service
public class AutenticacionService {
	
	@Autowired
	private UsuarioDAO usuarioDAOHibernateJPA;
	
	public Usuario login(String email,String pass) {
		if(usuarioDAOHibernateJPA.existeUsuario_by_email(email)) {
			return usuarioDAOHibernateJPA.recuperarUsuario_by_email_and_password(email, pass);
		}
		return null;
	}
	
}
