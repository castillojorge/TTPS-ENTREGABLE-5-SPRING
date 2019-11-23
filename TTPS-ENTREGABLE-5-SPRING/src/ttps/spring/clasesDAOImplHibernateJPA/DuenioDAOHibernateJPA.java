package ttps.spring.clasesDAOImplHibernateJPA;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import ttps.spring.clasesDAO.DuenioDAO;
import ttps.spring.model2019.Dueño;

@Repository
public class DuenioDAOHibernateJPA extends GenericDAOHibernateJPA<Dueño> implements DuenioDAO {

	public DuenioDAOHibernateJPA() {
		super(Dueño.class);
		// TODO Auto-generated constructor stub
	}

}
