package au.rms.nsw.gov.au.model.hibernate;
// Generated 14/10/2016 12:10:24 PM by Hibernate Tools 5.2.0.Beta1

import java.math.BigDecimal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Services.
 * @see Services
 * @author Hibernate Tools
 */
@Stateless
public class ServicesHome {

	private static final Log log = LogFactory.getLog(ServicesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Services transientInstance) {
		log.debug("persisting Services instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Services persistentInstance) {
		log.debug("removing Services instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Services merge(Services detachedInstance) {
		log.debug("merging Services instance");
		try {
			Services result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Services findById(BigDecimal id) {
		log.debug("getting Services instance with id: " + id);
		try {
			Services instance = entityManager.find(Services.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
