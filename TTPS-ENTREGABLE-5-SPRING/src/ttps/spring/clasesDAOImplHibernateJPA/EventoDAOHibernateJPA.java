package ttps.spring.clasesDAOImplHibernateJPA;

import ttps.spring.clasesDAO.EventoDAO;
import ttps.spring.model2019.Evento;

public class EventoDAOHibernateJPA extends GenericDAOHibernateJPA<Evento> implements EventoDAO {

	public EventoDAOHibernateJPA() {
		super(Evento.class);
		// TODO Auto-generated constructor stub
	}

}
