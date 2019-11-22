package ttps.spring.clasesDAOImplHibernateJPA;

import org.springframework.stereotype.Repository;

import ttps.spring.clasesDAO.MascotaDAO;
import ttps.spring.model2019.Mascota;

@Repository
public class MascotaDAOHibernateJPA extends GenericDAOHibernateJPA<Mascota> implements MascotaDAO {

	public MascotaDAOHibernateJPA() {
		super(Mascota.class);
		// TODO Auto-generated constructor stub
	}

}
