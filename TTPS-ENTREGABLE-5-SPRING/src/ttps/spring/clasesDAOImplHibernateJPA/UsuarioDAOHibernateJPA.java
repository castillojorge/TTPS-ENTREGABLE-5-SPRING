package ttps.spring.clasesDAOImplHibernateJPA;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import ttps.spring.clasesDAO.UsuarioDAO;
import ttps.spring.model2019.Usuario;

@Repository
public class UsuarioDAOHibernateJPA extends GenericDAOHibernateJPA<Usuario> implements UsuarioDAO {

	public UsuarioDAOHibernateJPA() {
		super(Usuario.class);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param email
	 * @return True si Existe 
	 * 
	 */
	public boolean existeUsuario_by_email(String email) {
		Usuario u = new Usuario();
		Query q = (Query) this.getEntitymanager().createQuery("from " + u.getClass().getSimpleName() + " where email_user=:email ");
		q.setParameter("email", email);
		List<Usuario> usuario = q.getResultList();
		return (usuario.size() > 0);
	}
	
	/**
	 * 
	 * @param email
	 * @return Un usuario si Existe o null en caso de lo Contrario
	 */
	public Usuario recuperarUsuario_by_email(String email) {
		Usuario u = new Usuario();
		//this.getPersistentClass();
		if(this.existeUsuario_by_email(email)) {
			Query q = (Query) this.getEntitymanager().createQuery("from " + u.getClass().getSimpleName() + " where email_user=:email ");
			q.setParameter("email", email);
			List<Usuario> usuario = q.getResultList();
			return usuario.get(0);
		}
		return null;
	}
	
	public Usuario recuperarUsuario_by_email_and_password(String email, String password) {
		Usuario u = new Usuario();
		if(this.existeUsuario_by_email(email)) {
			Query q = (Query) this.getEntitymanager().createQuery("from " + u.getClass().getSimpleName() + " where email_user=:email and password=:pass");
			q.setParameter("email", email);
			q.setParameter("pass", password);
			List<Usuario> usuario = q.getResultList();
			if(usuario.get(0).getPassword() == password) {
				return usuario.get(0);
			}
			return null;
		}
		return null;
	}
}
