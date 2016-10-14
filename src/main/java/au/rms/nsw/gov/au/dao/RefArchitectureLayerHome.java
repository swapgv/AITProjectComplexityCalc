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
 * Home object for domain model class RefArchitectureLayer.
 * @see au.rms.nsw.gov.au.dao.RefArchitectureLayer
 * @author Hibernate Tools
 */
public class RefArchitectureLayerHome {

	private static final Log log = LogFactory.getLog(RefArchitectureLayerHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(RefArchitectureLayer transientInstance) {
		log.debug("persisting RefArchitectureLayer instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(RefArchitectureLayer instance) {
		log.debug("attaching dirty RefArchitectureLayer instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(RefArchitectureLayer instance) {
		log.debug("attaching clean RefArchitectureLayer instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(RefArchitectureLayer persistentInstance) {
		log.debug("deleting RefArchitectureLayer instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public RefArchitectureLayer merge(RefArchitectureLayer detachedInstance) {
		log.debug("merging RefArchitectureLayer instance");
		try {
			RefArchitectureLayer result = (RefArchitectureLayer) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public RefArchitectureLayer findById(String id) {
		log.debug("getting RefArchitectureLayer instance with id: " + id);
		try {
			RefArchitectureLayer instance = (RefArchitectureLayer) sessionFactory.getCurrentSession()
					.get("au.rms.nsw.gov.au.dao.RefArchitectureLayer", id);
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

	public List<RefArchitectureLayer> findByExample(RefArchitectureLayer instance) {
		log.debug("finding RefArchitectureLayer instance by example");
		try {
			List<RefArchitectureLayer> results = (List<RefArchitectureLayer>) sessionFactory.getCurrentSession()
					.createCriteria("au.rms.nsw.gov.au.dao.RefArchitectureLayer").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
