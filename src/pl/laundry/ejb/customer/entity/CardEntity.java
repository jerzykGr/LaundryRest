/**
 * 
 */
package pl.laundry.ejb.customer.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Administrator
 *
 */
@Entity
@Table(name = "CUSTOMER_CARD")
public class CardEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private long cardId;

	private String cardNo;

	private Date expireDate;


	/**
	 * @return the cardId
	 */
	@Id
	@Column(name = "CARD_ID")
	public long getCardId() {
		return cardId;
	}

	/**
	 * @param cardId
	 *            the cardId to set
	 */
	public void setCardId(long cardId) {
		this.cardId = cardId;
	}

	/**
	 * @return the cardNo
	 */
	@Column(name = "CARD_NO")
	public String getCardNo() {
		return cardNo;
	}

	/**
	 * @param cardNo
	 *            the cardNo to set
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	/**
	 * @return the expireDate
	 */
	@Column(name = "EXPIRE_DATE")
	public Date getExpireDate() {
		return expireDate;
	}

	/**
	 * @param expireDate
	 *            the expireDate to set
	 */
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}



}
