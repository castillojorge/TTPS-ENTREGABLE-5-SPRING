package ttps.spring.clasesDAOImplHibernateJPA;

import ttps.spring.clasesDAO.UsuarioDAO;
import ttps.spring.model2019.Usuario;

public class UsuarioDAOHibernateJPA extends GenericDAOHibernateJPA<Usuario> implements UsuarioDAO {

	public UsuarioDAOHibernateJPA() {
		super(Usuario.class);
		// TODO Auto-generated constructor stub
	}

}
