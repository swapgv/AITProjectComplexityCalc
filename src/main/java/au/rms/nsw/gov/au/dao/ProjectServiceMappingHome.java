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
 * Home object for domain model class ProjectServiceMapping.
 * @see au.rms.nsw.gov.au.dao.ProjectServiceMapping
 * @author Hibernate Tools
 */
public class ProjectServiceMappingHome {

	private static final Log log = LogFactory.getLog(ProjectServiceMappingHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(ProjectServiceMapping transientInstance) {
		log.debug("persisting ProjectServiceMapping instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ProjectServiceMapping instance) {
		log.debug("attaching dirty ProjectServiceMapping instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ProjectServiceMapping instance) {
		log.debug("attaching clean ProjectServiceMapping instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(ProjectServiceMapping persistentInstance) {
		log.debug("deleting ProjectServiceMapping instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ProjectServiceMapping merge(ProjectServiceMapping detachedInstance) {
		log.debug("merging ProjectServiceMapping instance");
		try {
			ProjectServiceMapping result = (ProjectServiceMapping) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProjectServiceMapping findById(java.math.BigDecimal id) {
		log.debug("getting ProjectServiceMapping instance with id: " + id);
		try {
			ProjectServiceMapping instance = (ProjectServiceMapping) sessionFactory.getCurrentSession()
					.get("au.rms.nsw.gov.au.dao.ProjectServiceMapping", id);
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

	public List<ProjectServiceMapping> findByExample(ProjectServiceMapping instance) {
		log.debug("finding ProjectServiceMapping instance by example");
		try {
			List<ProjectServiceMapping> results = (List<ProjectServiceMapping>) sessionFactory.getCurrentSession()
					.createCriteria("au.rms.nsw.gov.au.dao.ProjectServiceMapping").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
