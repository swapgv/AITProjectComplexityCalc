package au.rms.nsw.gov.au.dao;
// Generated 14/10/2016 12:25:05 PM by Hibernate Tools 5.2.0.Beta1

import java.util.List;
import javax.naming.InitialContext;

import au.rms.nsw.gov.au.model.hibernate.RefCriteriaCustomDefn;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class RefCriteriaCustomDefn.
 * @see au.rms.nsw.gov.au.model.hibernate.RefCriteriaCustomDefn
 * @author Hibernate Tools
 */
public class RefCriteriaCustomDefnHome {

	private static final Log log = LogFactory.getLog(RefCriteriaCustomDefnHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(RefCriteriaCustomDefn transientInstance) {
		log.debug("persisting RefCriteriaCustomDefn instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(RefCriteriaCustomDefn instance) {
		log.debug("attaching dirty RefCriteriaCustomDefn instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RefCriteriaCustomDefn instance) {
		log.debug("attaching clean RefCriteriaCustomDefn instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(RefCriteriaCustomDefn persistentInstance) {
		log.debug("deleting RefCriteriaCustomDefn instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RefCriteriaCustomDefn merge(RefCriteriaCustomDefn detachedInstance) {
		log.debug("merging RefCriteriaCustomDefn instance");
		try {
			RefCriteriaCustomDefn result = (RefCriteriaCustomDefn) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RefCriteriaCustomDefn findById(String id) {
		log.debug("getting RefCriteriaCustomDefn instance with id: " + id);
		try {
			RefCriteriaCustomDefn instance = (RefCriteriaCustomDefn) sessionFactory.getCurrentSession()
					.get("au.rms.nsw.gov.au.dao.RefCriteriaCustomDefn", id);
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

	public List<RefCriteriaCustomDefn> findByExample(RefCriteriaCustomDefn instance) {
		log.debug("finding RefCriteriaCustomDefn instance by example");
		try {
			List<RefCriteriaCustomDefn> results = (List<RefCriteriaCustomDefn>) sessionFactory.getCurrentSession()
					.createCriteria("au.rms.nsw.gov.au.dao.RefCriteriaCustomDefn").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
