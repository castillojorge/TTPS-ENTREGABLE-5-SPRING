package ttps.spring.clasesDAOImplHibernateJPA;

import org.springframework.stereotype.Repository;

import ttps.spring.clasesDAO.RecordatorioDAO;
import ttps.spring.model2019.Recordatorio;

@Repository
public class RecordatorioDAOHibernateJPA extends GenericDAOHibernateJPA<Recordatorio> implements RecordatorioDAO {

	public RecordatorioDAOHibernateJPA() {
		super(Recordatorio.class);
		// TODO Auto-generated constructor stub
	}

}
