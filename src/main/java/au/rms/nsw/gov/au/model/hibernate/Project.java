package au.rms.nsw.gov.au.model.hibernate;
// Generated 14/10/2016 12:10:24 PM by Hibernate Tools 5.2.0.Beta1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Project generated by hbm2java
 */
@Entity
@Table(name = "PROJECT", schema = "ESTADM")
public class Project implements java.io.Serializable {

	private BigDecimal id;
	private String name;
	private String techOwner;
	private Date created;
	private Date modified;
	private String createdBy;
	private String modifiedBy;
	private Set projectServiceMappings = new HashSet(0);
	private Set serviceOperations = new HashSet(0);

	public Project() {
	}

	public Project(BigDecimal id, String name, String techOwner, Date created, Date modified, String createdBy,
			String modifiedBy) {
		this.id = id;
		this.name = name;
		this.techOwner = techOwner;
		this.created = created;
		this.modified = modified;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
	}

	public Project(BigDecimal id, String name, String techOwner, Date created, Date modified, String createdBy,
			String modifiedBy, Set projectServiceMappings, Set serviceOperations) {
		this.id = id;
		this.name = name;
		this.techOwner = techOwner;
		this.created = created;
		this.modified = modified;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
		this.projectServiceMappings = projectServiceMappings;
		this.serviceOperations = serviceOperations;
	}

	@Id

	@Column(name = "ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	@Column(name = "NAME", nullable = false, length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "TECH_OWNER", nullable = false, length = 50)
	public String getTechOwner() {
		return this.techOwner;
	}

	public void setTechOwner(String techOwner) {
		this.techOwner = techOwner;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED", nullable = false, length = 7)
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "MODIFIED", nullable = false, length = 7)
	public Date getModified() {
		return this.modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	@Column(name = "CREATED_BY", nullable = false, length = 50)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "MODIFIED_BY", nullable = false, length = 50)
	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
	public Set getProjectServiceMappings() {
		return this.projectServiceMappings;
	}

	public void setProjectServiceMappings(Set projectServiceMappings) {
		this.projectServiceMappings = projectServiceMappings;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
	public Set getServiceOperations() {
		return this.serviceOperations;
	}

	public void setServiceOperations(Set serviceOperations) {
		this.serviceOperations = serviceOperations;
	}

}
