package ttps.spring.clasesDAOImplHibernateJPA;

import java.io.Serializable;

import ttps.spring.clasesDAO.DueñoDAO;
import ttps.spring.model2019.Dueño;

public class DueñoDAOHibernateJPA extends GenericDAOHibernateJPA<Dueño> implements DueñoDAO {

	public DueñoDAOHibernateJPA() {
		super(Dueño.class);
		// TODO Auto-generated constructor stub
	}

}
