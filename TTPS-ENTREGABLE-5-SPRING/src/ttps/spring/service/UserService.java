package ttps.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ttps.spring.clasesDAO.UsuarioDAO;
import ttps.spring.model2019.Usuario;

@Service
public class UserService {

	@Autowired
	private UsuarioDAO usuarioDAOHibernateJPA;
	
	public boolean existeUserByEmail(String email) {
		
		return usuarioDAOHibernateJPA.existeUsuario_by_email(email);
		
	}
	
	public void saveUser(Usuario u) {
		usuarioDAOHibernateJPA.persistir(u);
	}
	
	public void editUser(int id , Usuario u) {
		Usuario user = usuarioDAOHibernateJPA.recuperar(id);
		user.setNombre_user(u.getNombre_user());
		user.setApellido_user(u.getApellido_user());
		user.setEmail_user(u.getEmail_user());
		user.setPassword(u.getPassword());
		user.setTelefono(u.getTelefono());
		user.setRol(u.getRol());
	}
	
}
