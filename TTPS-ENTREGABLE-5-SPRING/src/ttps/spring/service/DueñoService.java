package ttps.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ttps.spring.clasesDAO.Due�oDAO;
import ttps.spring.clasesDAO.MascotaDAO;
import ttps.spring.model2019.Due�o;

@Service
public class Due�oService {

	@Autowired
	private Due�oDAO due�oDAOHibernateJPA;
	@Autowired
	private MascotaDAO mascotaDAOHibernateJPA;
	
	public Due�o findById(int id) {
		
		return due�oDAOHibernateJPA.recuperar(id);
	}
	
}
