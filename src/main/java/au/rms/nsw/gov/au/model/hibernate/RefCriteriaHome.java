package au.rms.nsw.gov.au.model.hibernate;
// Generated 14/10/2016 12:10:24 PM by Hibernate Tools 5.2.0.Beta1

import java.math.BigDecimal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class RefCriteria.
 * @see au.rms.nsw.gov.au.model.hibernate.RefCriteria
 * @author Hibernate Tools
 */
@Stateless
public class RefCriteriaHome {

	private static final Log log = LogFactory.getLog(RefCriteriaHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(RefCriteria transientInstance) {
		log.debug("persisting RefCriteria instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(RefCriteria persistentInstance) {
		log.debug("removing RefCriteria instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public RefCriteria merge(RefCriteria detachedInstance) {
		log.debug("merging RefCriteria instance");
		try {
			RefCriteria result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RefCriteria findById(BigDecimal id) {
		log.debug("getting RefCriteria instance with id: " + id);
		try {
			RefCriteria instance = entityManager.find(RefCriteria.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
