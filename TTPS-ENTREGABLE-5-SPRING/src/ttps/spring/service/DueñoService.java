package ttps.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ttps.spring.clasesDAO.DueñoDAO;
import ttps.spring.clasesDAO.MascotaDAO;
import ttps.spring.model2019.Dueño;

@Service
public class DueñoService {

	@Autowired
	private DueñoDAO dueñoDAOHibernateJPA;
	@Autowired
	private MascotaDAO mascotaDAOHibernateJPA;
	
	public Dueño findById(int id) {
		
		return dueñoDAOHibernateJPA.recuperar(id);
	}
	
}
