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
 * Home object for domain model class ArchitectureCritMapping.
 * @see au.rms.nsw.gov.au.dao.ArchitectureCritMapping
 * @author Hibernate Tools
 */
public class ArchitectureCritMappingHome {

	private static final Log log = LogFactory.getLog(ArchitectureCritMappingHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(ArchitectureCritMapping transientInstance) {
		log.debug("persisting ArchitectureCritMapping instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ArchitectureCritMapping instance) {
		log.debug("attaching dirty ArchitectureCritMapping instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ArchitectureCritMapping instance) {
		log.debug("attaching clean ArchitectureCritMapping instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ArchitectureCritMapping persistentInstance) {
		log.debug("deleting ArchitectureCritMapping instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ArchitectureCritMapping merge(ArchitectureCritMapping detachedInstance) {
		log.debug("merging ArchitectureCritMapping instance");
		try {
			ArchitectureCritMapping result = (ArchitectureCritMapping) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ArchitectureCritMapping findById(String id) {
		log.debug("getting ArchitectureCritMapping instance with id: " + id);
		try {
			ArchitectureCritMapping instance = (ArchitectureCritMapping) sessionFactory.getCurrentSession()
					.get("au.rms.nsw.gov.au.dao.ArchitectureCritMapping", id);
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

	public List<ArchitectureCritMapping> findByExample(ArchitectureCritMapping instance) {
		log.debug("finding ArchitectureCritMapping instance by example");
		try {
			List<ArchitectureCritMapping> results = (List<ArchitectureCritMapping>) sessionFactory.getCurrentSession()
					.createCriteria("au.rms.nsw.gov.au.dao.ArchitectureCritMapping").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
