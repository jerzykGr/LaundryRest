/**
 * 
 */
package pl.laundry.ejb.serviceOrder.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import pl.laundry.ejb.serviceOrder.enums.ServiceDict;

/**
 * @author Administrator
 *
 */
@Entity
@Table(name = "SERVICE_DICT")
public class ServiceDictEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private long dictId;

	private String describe;

	private ServiceDict serviceDict;

	/**
	 * @return the dictId
	 */
	@Id
	@Column(name = "DICT_ID")
	public long getDictId() {
		return dictId;
	}

	/**
	 * @param dictId
	 *            the dictId to set
	 */
	public void setDictId(long dictId) {
		this.dictId = dictId;
	}

	/**
	 * @return the describe
	 */
	@Column(name = "DESCRIBE")
	public String getDescribe() {
		return describe;
	}

	/**
	 * @param describe
	 *            the describe to set
	 */
	public void setDescribe(String describe) {
		this.describe = describe;
	}

	@Column(name = "CODE")
	protected String getDBServiceDict() {
		return serviceDict == null ? null : serviceDict.getCode();
	}

	/**
	 * @param serviceDict
	 *            the serviceDict to set
	 */
	protected void setDBServiceDict(String dbValue) {
		this.serviceDict = ServiceDict.getByCode(dbValue);
	}

	/**
	 * @return the serviceDict
	 */
	@Transient
	public ServiceDict getServiceDict() {
		return serviceDict;
	}

	/**
	 * @param serviceDict
	 *            the serviceDict to set
	 */
	public void setServiceDict(ServiceDict serviceDict) {
		this.serviceDict = serviceDict;
	}
}
