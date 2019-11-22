package ttps.spring.clasesDAOImplHibernateJPA;

import ttps.spring.clasesDAO.TipoEventoDAO;
import ttps.spring.model2019.TipoEvento;

public class TipoEventoDAOHibernateJPA extends GenericDAOHibernateJPA<TipoEvento> implements TipoEventoDAO {

	public TipoEventoDAOHibernateJPA() {
		super(TipoEvento.class);
		// TODO Auto-generated constructor stub
	}

}
