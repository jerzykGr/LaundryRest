/**
 * 
 */
package pl.laundry.ejb.serviceOrder.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Administrator
 *
 */
@Entity
@Table(name = "SERVICE_DICT")
public class ServiceDictEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private long dictId;

	private String name;

	private String describe;

	private String code;

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
	 * @return the name
	 */
	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
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

	/**
	 * @return the code
	 */
	@Column(name = "CODE")
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

}
