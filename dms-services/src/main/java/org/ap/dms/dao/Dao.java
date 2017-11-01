package org.ap.dms.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class Dao {
	@PersistenceContext(unitName = "dms-pu")
    private EntityManager em;

    public <E> E create(E e) {
        em.persist(e);
        return e;
    }

    public <E> E update(E e) {
        return em.merge(e);
    }

    public <E> void delete(Class<E> clazz, long id) {
        em.remove(em.find(clazz, id));
    }

    public <E> E find(Class<E> clazz, long id) {
        return em.find(clazz, id);
    }

    public <E> List<E> find(Class<E> clazz, String query, int min, int max) {
        return queryRange(em.createQuery(query, clazz), min, max).getResultList();
    }

    public <E> List<E> namedFind(Class<E> clazz, String query, int min, int max) {
        return queryRange(em.createNamedQuery(query, clazz), min, max).getResultList();
    }
    
    public <E> List<E> getAll(Class<E> clazz) {
        return em.createNamedQuery(clazz.getSimpleName()+"."+"getAll").getResultList();
    }

    private static Query queryRange(Query query, int min, int max) {
        if (max >= 0) {
            query.setMaxResults(max);
        }
        if (min >= 0) {
            query.setFirstResult(min);
        }
        return query;
    }
    
    
}
