package ttps.spring.clasesDAOImplHibernateJPA;

import org.springframework.stereotype.Repository;

import ttps.spring.clasesDAO.FichaPublicaDAO;
import ttps.spring.model2019.FichaPublica;

@Repository
public class FichaPublicaDAOHibernateJPA extends GenericDAOHibernateJPA<FichaPublica>implements FichaPublicaDAO {

	public FichaPublicaDAOHibernateJPA() {
		super(FichaPublica.class);
		// TODO Auto-generated constructor stub
	}

}
