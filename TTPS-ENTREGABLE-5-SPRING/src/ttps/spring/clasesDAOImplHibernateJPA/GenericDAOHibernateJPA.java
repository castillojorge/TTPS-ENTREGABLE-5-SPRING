package ttps.spring.clasesDAOImplHibernateJPA;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import ttps.spring.clasesDAO.GenericDAO;

@Transactional
public class GenericDAOHibernateJPA <T> implements GenericDAO<T>{

	private EntityManager entitymanager;
	
	
	@PersistenceContext
	public void setEntitymanager(EntityManager entitymanager) {
		this.entitymanager = entitymanager;
	}
	
	public EntityManager getEntitymanager() {
		return entitymanager;
	}
	
	protected Class<T> persistentClass;
	
	public GenericDAOHibernateJPA(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

	public Class<T> getPersistentClass() {
		return persistentClass;
	}

	public void setPersistentClass(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

	@Override
	public T persistir(T entity) {
		// TODO Auto-generated method stub
		this.getEntitymanager().persist(entity);
		return entity;
	}

	@Override
	public T actualizar(T entity) {
		// TODO Auto-generated method stub
		this.getEntitymanager().merge(entity);
		return entity;
	}

	@Override
	public void borrar(T entity) {
		// TODO Auto-generated method stub
		this.getEntitymanager().remove(entity);
	}

	@Override
	public T borrar(Serializable id) {
		// TODO Auto-generated method stub
		T entity = this.getEntitymanager().find(this.getPersistentClass(), id);
		this.borrar(entity);
		return entity;
	}

	@Override
	public boolean existe(Serializable id) {
		// TODO Auto-generated method stub
		T entity = this.getEntitymanager().find(this.getPersistentClass(), id);
		return (entity != null);
	}

	@Override
	public T recuperar(Serializable id) {
		// TODO Auto-generated method stub
		T entity = this.getEntitymanager().find(this.getPersistentClass(), id);
		return entity;
	}
	
	public List<T> recuperarTodos(){
		List<T> resultado = this.getEntitymanager().createQuery("from " + getPersistentClass().getSimpleName()).getResultList();
		return resultado;
	}
	

}
