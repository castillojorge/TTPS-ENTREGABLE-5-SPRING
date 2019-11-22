package ttps.spring.clasesDAOImplHibernateJPA;

import org.springframework.stereotype.Repository;

import ttps.spring.clasesDAO.VeterinarioDAO;
import ttps.spring.model2019.Veterinario;

@Repository
public class VeterinarioDAOHibernateJPA extends GenericDAOHibernateJPA<Veterinario> implements VeterinarioDAO {

	public VeterinarioDAOHibernateJPA() {
		super(Veterinario.class);
		// TODO Auto-generated constructor stub
	}

}
