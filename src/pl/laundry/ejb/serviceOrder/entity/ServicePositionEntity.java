/**
 * 
 */
package pl.laundry.ejb.serviceOrder.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Administrator
 *
 */
@Entity
@Table(name = "SERVICE_ORDER_POSITIONS")
@SequenceGenerator(name = "POSITION_SEQUENCE_GENERATOR", sequenceName = "SEQ_SERVICE_ORDER_POSITIONS")
public class ServicePositionEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "POSITION_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "POSITION_SEQUENCE_GENERATOR")
	private long positionId;

	@Column(name = "QTY")
	private int qty;

	@Column(name = "PRICE")
	private float price;

	@Column(name = "CURRENCY")
	private String currency;
 
	@ManyToOne
	@JoinColumn(name = "SERVICE_DICT_ID")
	private ServiceDictEntity serviceDict;

	/**
	 * @return the serviceDict
	 */
	public ServiceDictEntity getServiceDict() {
		return serviceDict;
	}

	/**
	 * @param serviceDict
	 *            the serviceDict to set
	 */
	public void setServiceDict(ServiceDictEntity serviceDict) {
		this.serviceDict = serviceDict;
	}

	/**
	 * @return the positionId
	 */
	public long getPositionId() {
		return positionId;
	}

	/**
	 * @param positionId
	 *            the positionId to set
	 */
	public void setPositionId(long positionId) {
		this.positionId = positionId;
	}

	/**
	 * @return the qty
	 */
	public int getQty() {
		return qty;
	}

	/**
	 * @param qty
	 *            the qty to set
	 */
	public void setQty(int qty) {
		this.qty = qty;
	}

	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency
	 *            the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
