package ttps.spring.clasesDAOImplHibernateJPA;

import java.io.Serializable;

import ttps.spring.clasesDAO.Due�oDAO;
import ttps.spring.model2019.Due�o;

public class Due�oDAOHibernateJPA extends GenericDAOHibernateJPA<Due�o> implements Due�oDAO {

	public Due�oDAOHibernateJPA() {
		super(Due�o.class);
		// TODO Auto-generated constructor stub
	}

}
