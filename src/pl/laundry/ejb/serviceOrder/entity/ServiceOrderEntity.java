package pl.laundry.ejb.serviceOrder.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "SERVICE_ORDER")
@SequenceGenerator(name = "SERVICE_SEQUENCE_GENERATOR", sequenceName = "SEQ_SERVICE_ORDER", allocationSize = 1)

@NamedQueries({
		@NamedQuery(name = "retrieveOrders", query = "SELECT s FROM ServiceOrderEntity s JOIN FETCH s.servicePositions") })
public class ServiceOrderEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SERVICE_SEQUENCE_GENERATOR")
	@Column(name = "ORDER_NO")
	private long orderNo;

	@Temporal(TemporalType.DATE)
	@Column(name = "ORDER_DATE")
	private Date orderDate;

	@Column(name = "SUBTOTAL")
	private long subtotal;

	@Column(name = "SURCHARGE_EXPRESS_PERCENTAGE")
	private long surchargeExpressPercentage;

	@Column(name = "SURCHARGE_EXPRESS_AMOUNT")
	private long surchargeExpressAmount;

	@Column(name = "GRANDTOTAL")
	private long grandTotal;

	@Column(name = "DESCRIBE")
	private String describe;

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "ORDER_NO")
	private List<ServicePositionEntity> servicePositions;

	/**
	 * @return the servicePositions
	 */
	public List<ServicePositionEntity> getServicePositions() {
		return servicePositions;
	}

	/**
	 * @param servicePositions
	 *            the servicePositions to set
	 */
	public void setServicePositions(List<ServicePositionEntity> servicePositions) {
		this.servicePositions = servicePositions;
	}

	/**
	 * @return the orderNo
	 */
	public long getOrderNo() {
		return orderNo;
	}

	/**
	 * @param orderNo
	 *            the orderNo to set
	 */
	public void setOrderNo(long orderNo) {
		this.orderNo = orderNo;
	}

	/**
	 * @return the orderDate
	 */
	public Date getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate
	 *            the orderDate to set
	 */
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return the subtotal
	 */
	public long getSubtotal() {
		return subtotal;
	}

	/**
	 * @param subtotal
	 *            the subtotal to set
	 */
	public void setSubtotal(long subtotal) {
		this.subtotal = subtotal;
	}

	/**
	 * @return the surchargeExpressPercentage
	 */
	public long getSurchargeExpressPercentage() {
		return surchargeExpressPercentage;
	}

	/**
	 * @param surchargeExpressPercentage
	 *            the surchargeExpressPercentage to set
	 */
	public void setSurchargeExpressPercentage(long surchargeExpressPercentage) {
		this.surchargeExpressPercentage = surchargeExpressPercentage;
	}

	/**
	 * @return the surchargeExpressAmount
	 */
	public long getSurchargeExpressAmount() {
		return surchargeExpressAmount;
	}

	/**
	 * @param surchargeExpressAmount
	 *            the surchargeExpressAmount to set
	 */
	public void setSurchargeExpressAmount(long surchargeExpressAmount) {
		this.surchargeExpressAmount = surchargeExpressAmount;
	}

	/**
	 * @return the grandTotal
	 */
	public long getGrandTotal() {
		return grandTotal;
	}

	/**
	 * @param grandTotal
	 *            the grandTotal to set
	 */
	public void setGrandTotal(long grandTotal) {
		this.grandTotal = grandTotal;
	}

	/**
	 * @return the describe
	 */
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

}
