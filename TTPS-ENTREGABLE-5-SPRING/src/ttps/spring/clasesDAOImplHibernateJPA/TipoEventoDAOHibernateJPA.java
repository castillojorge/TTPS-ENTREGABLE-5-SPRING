package ttps.spring.clasesDAOImplHibernateJPA;

import org.springframework.stereotype.Repository;

import ttps.spring.clasesDAO.TipoEventoDAO;
import ttps.spring.model2019.TipoEvento;

@Repository
public class TipoEventoDAOHibernateJPA extends GenericDAOHibernateJPA<TipoEvento> implements TipoEventoDAO {

	public TipoEventoDAOHibernateJPA() {
		super(TipoEvento.class);
		// TODO Auto-generated constructor stub
	}

}
