/**
 * 
 */
package pl.laundry.ejb.commons.entityManager;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Administrator
 *
 */
@Embeddable
public class Money implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "CURRENCY")
	private String currency;

	@Column(name = "AMOUNT")
	private BigDecimal amount;

	public Money() {
	}

	public Money(String currency, BigDecimal amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * @param currency
	 *            the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Money add(Money other) {
		if (this.currency != other.currency)
			throw new IllegalArgumentException(String.format("%s != %s", this.currency, other.currency));
		return new Money(this.currency, this.amount.add(other.amount));
	}

	public Money subtract(Money other) {
		if (this.currency != other.currency)
			throw new IllegalArgumentException(String.format("%s != %s", this.currency, other.currency));
		return new Money(this.currency, this.amount.subtract(other.amount));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
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
		Money other = (Money) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		return true;
	}

}
