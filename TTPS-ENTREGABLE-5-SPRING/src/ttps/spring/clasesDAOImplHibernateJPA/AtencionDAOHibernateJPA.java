package ttps.spring.clasesDAOImplHibernateJPA;

import java.io.Serializable;

import ttps.spring.clasesDAO.AtencionDAO;
import ttps.spring.model2019.Atencion;

public class AtencionDAOHibernateJPA extends GenericDAOHibernateJPA<Atencion> implements AtencionDAO {

	public AtencionDAOHibernateJPA() {
		super(Atencion.class);
		// TODO Auto-generated constructor stub
	}

}
