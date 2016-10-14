package au.rms.nsw.gov.au.dao;
// Generated 14/10/2016 12:25:05 PM by Hibernate Tools 5.2.0.Beta1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class RefCriteria.
 * @see au.rms.nsw.gov.au.dao.RefCriteria
 * @author Hibernate Tools
 */
public class RefCriteriaHome {

	private static final Log log = LogFactory.getLog(RefCriteriaHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(RefCriteria transientInstance) {
		log.debug("persisting RefCriteria instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(RefCriteria instance) {
		log.debug("attaching dirty RefCriteria instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RefCriteria instance) {
		log.debug("attaching clean RefCriteria instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(RefCriteria persistentInstance) {
		log.debug("deleting RefCriteria instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RefCriteria merge(RefCriteria detachedInstance) {
		log.debug("merging RefCriteria instance");
		try {
			RefCriteria result = (RefCriteria) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RefCriteria findById(java.math.BigDecimal id) {
		log.debug("getting RefCriteria instance with id: " + id);
		try {
			RefCriteria instance = (RefCriteria) sessionFactory.getCurrentSession()
					.get("au.rms.nsw.gov.au.dao.RefCriteria", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<RefCriteria> findByExample(RefCriteria instance) {
		log.debug("finding RefCriteria instance by example");
		try {
			List<RefCriteria> results = (List<RefCriteria>) sessionFactory.getCurrentSession()
					.createCriteria("au.rms.nsw.gov.au.dao.RefCriteria").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
