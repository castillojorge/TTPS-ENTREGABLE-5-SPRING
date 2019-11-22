package ttps.spring.clasesDAOImplHibernateJPA;

import ttps.spring.clasesDAO.FichaPublicaDAO;
import ttps.spring.model2019.FichaPublica;

public class FichaPublicaDAOHibernateJPA extends GenericDAOHibernateJPA<FichaPublica>implements FichaPublicaDAO {

	public FichaPublicaDAOHibernateJPA() {
		super(FichaPublica.class);
		// TODO Auto-generated constructor stub
	}

}
