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
 * Home object for domain model class PrjOpnCritMapping.
 * @see au.rms.nsw.gov.au.dao.PrjOpnCritMapping
 * @author Hibernate Tools
 */
public class PrjOpnCritMappingHome {

	private static final Log log = LogFactory.getLog(PrjOpnCritMappingHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(PrjOpnCritMapping transientInstance) {
		log.debug("persisting PrjOpnCritMapping instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(PrjOpnCritMapping instance) {
		log.debug("attaching dirty PrjOpnCritMapping instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PrjOpnCritMapping instance) {
		log.debug("attaching clean PrjOpnCritMapping instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(PrjOpnCritMapping persistentInstance) {
		log.debug("deleting PrjOpnCritMapping instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PrjOpnCritMapping merge(PrjOpnCritMapping detachedInstance) {
		log.debug("merging PrjOpnCritMapping instance");
		try {
			PrjOpnCritMapping result = (PrjOpnCritMapping) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PrjOpnCritMapping findById(au.rms.nsw.gov.au.dao.PrjOpnCritMappingId id) {
		log.debug("getting PrjOpnCritMapping instance with id: " + id);
		try {
			PrjOpnCritMapping instance = (PrjOpnCritMapping) sessionFactory.getCurrentSession()
					.get("au.rms.nsw.gov.au.dao.PrjOpnCritMapping", id);
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

	public List<PrjOpnCritMapping> findByExample(PrjOpnCritMapping instance) {
		log.debug("finding PrjOpnCritMapping instance by example");
		try {
			List<PrjOpnCritMapping> results = (List<PrjOpnCritMapping>) sessionFactory.getCurrentSession()
					.createCriteria("au.rms.nsw.gov.au.dao.PrjOpnCritMapping").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
