package au.rms.nsw.gov.au.dao;

import au.rms.nsw.gov.au.model.hibernate.Project;

import java.util.List;

/**
 * Created by gopalakv on 14/10/2016.
 */
public interface ProjectRepo {

    Project findById(java.math.BigDecimal id);

    List<Project> findByExample(Project instance);

    void delete(Project persistentInstance);

    void attachClean(Project instance);

    void attachDirty(Project instance);

    List<Project> findAll();
}
