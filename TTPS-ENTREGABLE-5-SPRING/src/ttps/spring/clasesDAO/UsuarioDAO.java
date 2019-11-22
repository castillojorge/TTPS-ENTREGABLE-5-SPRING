package ttps.spring.clasesDAO;

import java.util.List;

import org.hibernate.query.Query;

import ttps.spring.model2019.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario> {
	
	public boolean existeUsuario_by_email(String email);
	
	public Usuario recuperarUsuario_by_email(String email);
	
	public Usuario recuperarUsuario_by_email_and_password(String email, String password);

}
