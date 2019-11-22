package ttps.spring.clasesDAOImplHibernateJPA;

import ttps.spring.clasesDAO.SuscripcionMascotaDAO;
import ttps.spring.model2019.SuscripcionMascota;

public class SuscripcionMascotaDAOHibernateJPA extends GenericDAOHibernateJPA<SuscripcionMascota> implements SuscripcionMascotaDAO {

	public SuscripcionMascotaDAOHibernateJPA() {
		super(SuscripcionMascota.class);
		// TODO Auto-generated constructor stub
	}

}
