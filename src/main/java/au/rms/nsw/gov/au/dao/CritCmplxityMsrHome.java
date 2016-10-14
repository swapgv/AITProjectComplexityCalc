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
 * Home object for domain model class CritCmplxityMsr.
 * @see au.rms.nsw.gov.au.dao.CritCmplxityMsr
 * @author Hibernate Tools
 */
public class CritCmplxityMsrHome {

	private static final Log log = LogFactory.getLog(CritCmplxityMsrHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(CritCmplxityMsr transientInstance) {
		log.debug("persisting CritCmplxityMsr instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(CritCmplxityMsr instance) {
		log.debug("attaching dirty CritCmplxityMsr instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CritCmplxityMsr instance) {
		log.debug("attaching clean CritCmplxityMsr instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(CritCmplxityMsr persistentInstance) {
		log.debug("deleting CritCmplxityMsr instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CritCmplxityMsr merge(CritCmplxityMsr detachedInstance) {
		log.debug("merging CritCmplxityMsr instance");
		try {
			CritCmplxityMsr result = (CritCmplxityMsr) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CritCmplxityMsr findById(au.rms.nsw.gov.au.dao.CritCmplxityMsrId id) {
		log.debug("getting CritCmplxityMsr instance with id: " + id);
		try {
			CritCmplxityMsr instance = (CritCmplxityMsr) sessionFactory.getCurrentSession()
					.get("au.rms.nsw.gov.au.dao.CritCmplxityMsr", id);
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

	public List<CritCmplxityMsr> findByExample(CritCmplxityMsr instance) {
		log.debug("finding CritCmplxityMsr instance by example");
		try {
			List<CritCmplxityMsr> results = (List<CritCmplxityMsr>) sessionFactory.getCurrentSession()
					.createCriteria("au.rms.nsw.gov.au.dao.CritCmplxityMsr").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
