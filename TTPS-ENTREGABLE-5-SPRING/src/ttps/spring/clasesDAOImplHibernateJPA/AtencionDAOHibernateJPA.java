package ttps.spring.clasesDAOImplHibernateJPA;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import ttps.spring.clasesDAO.AtencionDAO;
import ttps.spring.model2019.Atencion;

@Repository
public class AtencionDAOHibernateJPA extends GenericDAOHibernateJPA<Atencion> implements AtencionDAO {

	public AtencionDAOHibernateJPA() {
		super(Atencion.class);
		// TODO Auto-generated constructor stub
	}

}
