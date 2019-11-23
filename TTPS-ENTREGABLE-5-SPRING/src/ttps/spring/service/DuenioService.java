package ttps.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ttps.spring.clasesDAO.DuenioDAO;
import ttps.spring.clasesDAO.MascotaDAO;
import ttps.spring.model2019.Dueño;
import ttps.spring.model2019.Mascota;

@Service
public class DuenioService {

	@Autowired
	private DuenioDAO duenioDAOHibernateJPA;
	@Autowired
	private MascotaDAO mascotaDAOHibernateJPA;
	
	public Dueño findById(int id) {
		if(duenioDAOHibernateJPA.existe(id)) {
			return duenioDAOHibernateJPA.recuperar(id);
		}
		else return null;
	}
	
	public boolean existDueño(int id) {
		return duenioDAOHibernateJPA.existe(id);
	}
	
	public void saveMascota(int id, Mascota m) {
		if(duenioDAOHibernateJPA.existe(id)) {
			Dueño d = duenioDAOHibernateJPA.recuperar(id);
			List<Mascota> lMascotas = d.getMascotas();
			m.setMiDueño(d);
			lMascotas.add(m);
			d.setMascotas(lMascotas);
			duenioDAOHibernateJPA.actualizar(d);
			//mascotaDAOHibernateJPA.persistir(m);	
		}
	}
}
