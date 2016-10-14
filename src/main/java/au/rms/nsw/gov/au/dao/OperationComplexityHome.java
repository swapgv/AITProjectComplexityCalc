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
 * Home object for domain model class OperationComplexity.
 * @see au.rms.nsw.gov.au.dao.OperationComplexity
 * @author Hibernate Tools
 */
public class OperationComplexityHome {

	private static final Log log = LogFactory.getLog(OperationComplexityHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(OperationComplexity transientInstance) {
		log.debug("persisting OperationComplexity instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(OperationComplexity instance) {
		log.debug("attaching dirty OperationComplexity instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(OperationComplexity instance) {
		log.debug("attaching clean OperationComplexity instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(OperationComplexity persistentInstance) {
		log.debug("deleting OperationComplexity instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public OperationComplexity merge(OperationComplexity detachedInstance) {
		log.debug("merging OperationComplexity instance");
		try {
			OperationComplexity result = (OperationComplexity) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public OperationComplexity findById(au.rms.nsw.gov.au.dao.OperationComplexityId id) {
		log.debug("getting OperationComplexity instance with id: " + id);
		try {
			OperationComplexity instance = (OperationComplexity) sessionFactory.getCurrentSession()
					.get("au.rms.nsw.gov.au.dao.OperationComplexity", id);
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

	public List<OperationComplexity> findByExample(OperationComplexity instance) {
		log.debug("finding OperationComplexity instance by example");
		try {
			List<OperationComplexity> results = (List<OperationComplexity>) sessionFactory.getCurrentSession()
					.createCriteria("au.rms.nsw.gov.au.dao.OperationComplexity").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
