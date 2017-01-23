package pl.laundry.ejb.serviceOrder.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityResult;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import pl.laundry.ejb.commons.entityManager.Money;
import pl.laundry.ejb.customer.entity.CustomerEntity;

@Entity
@Table(name = "SERVICE_ORDER")
@SequenceGenerator(name = "SERVICE_SEQUENCE_GENERATOR", sequenceName = "SEQ_SERVICE_ORDER", allocationSize = 1)

@SqlResultSetMapping(name = "ServiceOrder.serviceAndCustomerMapping", entities = {
		@EntityResult(entityClass = ServiceOrderEntity.class) })

public class ServiceOrderEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String SERVICE_CUSTOMER_MAPPING = "ServiceOrder.serviceAndCustomerMapping";

	private long orderNo;

	private Date orderDate;

	private BigDecimal subtotal;

	private BigDecimal surchargeExpressPercentage;

	private BigDecimal surchargeExpressAmount;

	private Money grandTotal;

	private String describe;

	private CustomerEntity customer;

	/**
	 * @return the customer
	 */

	@ManyToOne
	@JoinColumn(name = "CUSTOMER_ID")
	public CustomerEntity getCustomer() {
		return customer;
	}

	/**
	 * @param customer
	 *            the customer to set
	 */
	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	/**
	 * @return the orderNo
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SERVICE_SEQUENCE_GENERATOR")
	@Column(name = "ORDER_NO")
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
	@Temporal(TemporalType.DATE)
	@Column(name = "ORDER_DATE")
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
	@Column(name = "SUBTOTAL")
	public BigDecimal getSubtotal() {
		return subtotal;
	}

	/**
	 * @param subtotal
	 *            the subtotal to set
	 */
	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	/**
	 * @return the surchargeExpressPercentage
	 */
	@Column(name = "SURCHARGE_EXPRESS_PERCENTAGE")
	public BigDecimal getSurchargeExpressPercentage() {
		return surchargeExpressPercentage;
	}

	/**
	 * @param surchargeExpressPercentage
	 *            the surchargeExpressPercentage to set
	 */
	public void setSurchargeExpressPercentage(BigDecimal surchargeExpressPercentage) {
		this.surchargeExpressPercentage = surchargeExpressPercentage;
	}

	/**
	 * @return the surchargeExpressAmount
	 */
	@Column(name = "SURCHARGE_EXPRESS_AMOUNT")
	public BigDecimal getSurchargeExpressAmount() {
		return surchargeExpressAmount;
	}

	/**
	 * @param surchargeExpressAmount
	 *            the surchargeExpressAmount to set
	 */
	public void setSurchargeExpressAmount(BigDecimal surchargeExpressAmount) {
		this.surchargeExpressAmount = surchargeExpressAmount;
	}

	/**
	 * @return the grandTotal
	 */
	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "amount", column = @Column(name = "GRANDTOTAL")) })
	public Money getGrandTotal() {
		return grandTotal;
	}

	/**
	 * @param grandTotal
	 *            the grandTotal to set
	 */
	public void setGrandTotal(Money grandTotal) {
		this.grandTotal = grandTotal;
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

}
