package au.rms.nsw.gov.au.model.hibernate;
// Generated 14/10/2016 12:10:24 PM by Hibernate Tools 5.2.0.Beta1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class RefState.
 * @see RefState
 * @author Hibernate Tools
 */
@Stateless
public class RefStateHome {

	private static final Log log = LogFactory.getLog(RefStateHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(RefState transientInstance) {
		log.debug("persisting RefState instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(RefState persistentInstance) {
		log.debug("removing RefState instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public RefState merge(RefState detachedInstance) {
		log.debug("merging RefState instance");
		try {
			RefState result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RefState findById(String id) {
		log.debug("getting RefState instance with id: " + id);
		try {
			RefState instance = entityManager.find(RefState.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
