package ttps.spring.clasesDAOImplHibernateJPA;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import ttps.spring.clasesDAO.DueñoDAO;
import ttps.spring.model2019.Dueño;

@Repository
public class DueñoDAOHibernateJPA extends GenericDAOHibernateJPA<Dueño> implements DueñoDAO {

	public DueñoDAOHibernateJPA() {
		super(Dueño.class);
		// TODO Auto-generated constructor stub
	}

}
