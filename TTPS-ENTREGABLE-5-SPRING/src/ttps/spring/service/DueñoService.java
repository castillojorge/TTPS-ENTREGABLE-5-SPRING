package ttps.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ttps.spring.clasesDAO.DueñoDAO;
import ttps.spring.clasesDAO.MascotaDAO;

@Service
public class DueñoService {

	@Autowired
	private DueñoDAO dueñoDAOHibernateJPA;
	@Autowired
	private MascotaDAO mascotaDAOHibernateJPA;
}
