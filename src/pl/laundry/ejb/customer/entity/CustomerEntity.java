/**
 * 
 */
package pl.laundry.ejb.customer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Administrator
 *
 */
@Entity
@Table(name = "CUSTOMER")
public class CustomerEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private long custId;

	private String name;

	private CardEntity customerCard;

	/**
	 * @return the custId
	 */
	@Id
	@Column(name = "CUST_ID")
	public long getCustId() {
		return custId;
	}

	/**
	 * @param custId
	 *            the custId to set
	 */
	public void setCustId(long custId) {
		this.custId = custId;
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
	 * @return the customerCard
	 */
	@OneToOne
	@JoinColumn(name="CARD_ID")
	public CardEntity getCustomerCard() {
		return customerCard;
	}

	/**
	 * @param customerCard
	 *            the customerCard to set
	 */
	public void setCustomerCard(CardEntity customerCard) {
		this.customerCard = customerCard;
	}

}
