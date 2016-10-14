package au.rms.nsw.gov.au.model.hibernate;
// Generated 14/10/2016 12:10:24 PM by Hibernate Tools 5.2.0.Beta1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * OperationComplexity generated by hbm2java
 */
@Entity
@Table(name = "OPERATION_COMPLEXITY", schema = "ESTADM")
public class OperationComplexity implements java.io.Serializable {

	private OperationComplexityId id;
	private ProjectServiceMapping projectServiceMapping;
	private RefComplexity refComplexity;
	private ServiceOperation serviceOperation;

	public OperationComplexity() {
	}

	public OperationComplexity(OperationComplexityId id, ProjectServiceMapping projectServiceMapping,
			ServiceOperation serviceOperation) {
		this.id = id;
		this.projectServiceMapping = projectServiceMapping;
		this.serviceOperation = serviceOperation;
	}

	public OperationComplexity(OperationComplexityId id, ProjectServiceMapping projectServiceMapping,
			RefComplexity refComplexity, ServiceOperation serviceOperation) {
		this.id = id;
		this.projectServiceMapping = projectServiceMapping;
		this.refComplexity = refComplexity;
		this.serviceOperation = serviceOperation;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "prjSrvcMappingId", column = @Column(name = "PRJ_SRVC_MAPPING_ID", nullable = false, precision = 22, scale = 0)),
			@AttributeOverride(name = "operationId", column = @Column(name = "OPERATION_ID", nullable = false, precision = 22, scale = 0)),
			@AttributeOverride(name = "complexityCode", column = @Column(name = "COMPLEXITY_CODE", length = 5)),
			@AttributeOverride(name = "serviceId", column = @Column(name = "SERVICE_ID", nullable = false, precision = 22, scale = 0)) })
	public OperationComplexityId getId() {
		return this.id;
	}

	public void setId(OperationComplexityId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRJ_SRVC_MAPPING_ID", nullable = false, insertable = false, updatable = false)
	public ProjectServiceMapping getProjectServiceMapping() {
		return this.projectServiceMapping;
	}

	public void setProjectServiceMapping(ProjectServiceMapping projectServiceMapping) {
		this.projectServiceMapping = projectServiceMapping;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COMPLEXITY_CODE", insertable = false, updatable = false)
	public RefComplexity getRefComplexity() {
		return this.refComplexity;
	}

	public void setRefComplexity(RefComplexity refComplexity) {
		this.refComplexity = refComplexity;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "OPERATION_ID", referencedColumnName = "ID", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "SERVICE_ID", referencedColumnName = "SERVICE_ID", nullable = false, insertable = false, updatable = false) })
	public ServiceOperation getServiceOperation() {
		return this.serviceOperation;
	}

	public void setServiceOperation(ServiceOperation serviceOperation) {
		this.serviceOperation = serviceOperation;
	}

}