package au.rms.nsw.gov.au.model.hibernate;
// Generated 14/10/2016 12:10:24 PM by Hibernate Tools 5.2.0.Beta1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * ArchitectureCritMapping generated by hbm2java
 */
@Entity
@Table(name = "ARCHITECTURE_CRIT_MAPPING", schema = "ESTADM")
public class ArchitectureCritMapping implements java.io.Serializable {

	private String architectureCode;
	private RefArchitectureLayer refArchitectureLayer;
	private RefCriteria refCriteria;
	private BigDecimal weightage;

	public ArchitectureCritMapping() {
	}

	public ArchitectureCritMapping(RefArchitectureLayer refArchitectureLayer, BigDecimal weightage) {
		this.refArchitectureLayer = refArchitectureLayer;
		this.weightage = weightage;
	}

	public ArchitectureCritMapping(RefArchitectureLayer refArchitectureLayer, RefCriteria refCriteria,
			BigDecimal weightage) {
		this.refArchitectureLayer = refArchitectureLayer;
		this.refCriteria = refCriteria;
		this.weightage = weightage;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "refArchitectureLayer"))
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "ARCHITECTURE_CODE", unique = true, nullable = false, length = 4)
	public String getArchitectureCode() {
		return this.architectureCode;
	}

	public void setArchitectureCode(String architectureCode) {
		this.architectureCode = architectureCode;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public RefArchitectureLayer getRefArchitectureLayer() {
		return this.refArchitectureLayer;
	}

	public void setRefArchitectureLayer(RefArchitectureLayer refArchitectureLayer) {
		this.refArchitectureLayer = refArchitectureLayer;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CRITERIA_ID")
	public RefCriteria getRefCriteria() {
		return this.refCriteria;
	}

	public void setRefCriteria(RefCriteria refCriteria) {
		this.refCriteria = refCriteria;
	}

	@Column(name = "WEIGHTAGE", nullable = false, precision = 22, scale = 0)
	public BigDecimal getWeightage() {
		return this.weightage;
	}

	public void setWeightage(BigDecimal weightage) {
		this.weightage = weightage;
	}

}
