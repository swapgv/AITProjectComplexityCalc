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
 * Home object for domain model class RefComplexity.
 * @see au.rms.nsw.gov.au.dao.RefComplexity
 * @author Hibernate Tools
 */
public class RefComplexityHome {

	private static final Log log = LogFactory.getLog(RefComplexityHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(RefComplexity transientInstance) {
		log.debug("persisting RefComplexity instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(RefComplexity instance) {
		log.debug("attaching dirty RefComplexity instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RefComplexity instance) {
		log.debug("attaching clean RefComplexity instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(RefComplexity persistentInstance) {
		log.debug("deleting RefComplexity instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RefComplexity merge(RefComplexity detachedInstance) {
		log.debug("merging RefComplexity instance");
		try {
			RefComplexity result = (RefComplexity) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RefComplexity findById(String id) {
		log.debug("getting RefComplexity instance with id: " + id);
		try {
			RefComplexity instance = (RefComplexity) sessionFactory.getCurrentSession()
					.get("au.rms.nsw.gov.au.dao.RefComplexity", id);
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

	public List<RefComplexity> findByExample(RefComplexity instance) {
		log.debug("finding RefComplexity instance by example");
		try {
			List<RefComplexity> results = (List<RefComplexity>) sessionFactory.getCurrentSession()
					.createCriteria("au.rms.nsw.gov.au.dao.RefComplexity").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
