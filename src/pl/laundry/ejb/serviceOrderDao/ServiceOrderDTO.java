/**
 * 
 */
package pl.laundry.ejb.serviceOrderDao;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Administrator
 *
 */
public class ServiceOrderDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private BigDecimal orderNo;

	private Date orderDate;

	private BigDecimal subtotal;

	private BigDecimal surchargeExpressPercentage;

	private BigDecimal surchargeExpressAmount;

	private BigDecimal grandTotal;

	private String describe;

	private String customer;

	private Integer positionsCount;

	public ServiceOrderDTO() {
	}

	public ServiceOrderDTO(BigDecimal orderNo, Date orderDate, BigDecimal subtotal, BigDecimal surchargeExpressPercentage,
			BigDecimal surchargeExpressAmount, BigDecimal grandTotal, String describe, String customer, Integer positionsCount) {
		super();
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.subtotal = subtotal;
		this.surchargeExpressPercentage = surchargeExpressPercentage;
		this.surchargeExpressAmount = surchargeExpressAmount;
		this.grandTotal = grandTotal;
		this.describe = describe;
		this.customer = customer;
		this.positionsCount = positionsCount;
	}

	/**
	 * @return the orderNo
	 */
	public BigDecimal getOrderNo() {
		return orderNo;
	}

	/**
	 * @param orderNo
	 *            the orderNo to set
	 */
	public void setOrderNo(BigDecimal orderNo) {
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
	public BigDecimal getGrandTotal() {
		return grandTotal;
	}

	/**
	 * @param grandTotal
	 *            the grandTotal to set
	 */
	public void setGrandTotal(BigDecimal grandTotal) {
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

	/**
	 * @return the customer
	 */
	public String getCustomer() {
		return customer;
	}

	/**
	 * @param customer
	 *            the customer to set
	 */
	public void setCustomer(String customer) {
		this.customer = customer;
	}

	/**
	 * @return the positionsCount
	 */
	public int getPositionsCount() {
		return positionsCount;
	}

	/**
	 * @param positionsCount
	 *            the positionsCount to set
	 */
	public void setPositionsCount(int positionsCount) {
		this.positionsCount = positionsCount;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((describe == null) ? 0 : describe.hashCode());
		result = prime * result + ((grandTotal == null) ? 0 : grandTotal.hashCode());
		result = prime * result + ((orderDate == null) ? 0 : orderDate.hashCode());
		result = prime * result + ((orderNo == null) ? 0 : orderNo.hashCode());
		result = prime * result + positionsCount;
		result = prime * result + ((subtotal == null) ? 0 : subtotal.hashCode());
		result = prime * result + ((surchargeExpressAmount == null) ? 0 : surchargeExpressAmount.hashCode());
		result = prime * result + ((surchargeExpressPercentage == null) ? 0 : surchargeExpressPercentage.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ServiceOrderDTO other = (ServiceOrderDTO) obj;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (describe == null) {
			if (other.describe != null)
				return false;
		} else if (!describe.equals(other.describe))
			return false;
		if (grandTotal == null) {
			if (other.grandTotal != null)
				return false;
		} else if (!grandTotal.equals(other.grandTotal))
			return false;
		if (orderDate == null) {
			if (other.orderDate != null)
				return false;
		} else if (!orderDate.equals(other.orderDate))
			return false;
		if (orderNo == null) {
			if (other.orderNo != null)
				return false;
		} else if (!orderNo.equals(other.orderNo))
			return false;
		if (positionsCount != other.positionsCount)
			return false;
		if (subtotal == null) {
			if (other.subtotal != null)
				return false;
		} else if (!subtotal.equals(other.subtotal))
			return false;
		if (surchargeExpressAmount == null) {
			if (other.surchargeExpressAmount != null)
				return false;
		} else if (!surchargeExpressAmount.equals(other.surchargeExpressAmount))
			return false;
		if (surchargeExpressPercentage == null) {
			if (other.surchargeExpressPercentage != null)
				return false;
		} else if (!surchargeExpressPercentage.equals(other.surchargeExpressPercentage))
			return false;
		return true;
	}

}
