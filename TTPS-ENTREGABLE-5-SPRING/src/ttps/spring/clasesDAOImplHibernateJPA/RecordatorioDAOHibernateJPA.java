package ttps.spring.clasesDAOImplHibernateJPA;

import ttps.spring.clasesDAO.RecordatorioDAO;
import ttps.spring.model2019.Recordatorio;

public class RecordatorioDAOHibernateJPA extends GenericDAOHibernateJPA<Recordatorio> implements RecordatorioDAO {

	public RecordatorioDAOHibernateJPA() {
		super(Recordatorio.class);
		// TODO Auto-generated constructor stub
	}

}
