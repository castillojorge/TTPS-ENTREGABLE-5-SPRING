package ttps.spring.clasesDAOImplHibernateJPA;

import org.springframework.stereotype.Repository;

import ttps.spring.clasesDAO.EventoDAO;
import ttps.spring.model2019.Evento;

@Repository
public class EventoDAOHibernateJPA extends GenericDAOHibernateJPA<Evento> implements EventoDAO {

	public EventoDAOHibernateJPA() {
		super(Evento.class);
		// TODO Auto-generated constructor stub
	}

}
