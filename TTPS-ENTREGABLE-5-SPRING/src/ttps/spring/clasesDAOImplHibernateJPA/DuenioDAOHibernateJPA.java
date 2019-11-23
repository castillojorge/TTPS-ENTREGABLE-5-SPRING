package ttps.spring.clasesDAOImplHibernateJPA;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import ttps.spring.clasesDAO.DuenioDAO;
import ttps.spring.model2019.Due�o;

@Repository
public class DuenioDAOHibernateJPA extends GenericDAOHibernateJPA<Due�o> implements DuenioDAO {

	public DuenioDAOHibernateJPA() {
		super(Due�o.class);
		// TODO Auto-generated constructor stub
	}

}
