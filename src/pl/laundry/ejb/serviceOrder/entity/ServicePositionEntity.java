/**
 * 
 */
package pl.laundry.ejb.serviceOrder.entity;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import pl.laundry.ejb.clothes.ClothesDictEntity;
import pl.laundry.ejb.commons.entityManager.Money;

/**
 * @author Administrator
 *
 */
@Entity
@Table(name = "SERVICE_ORDER_POSITIONS")
@SequenceGenerator(name = "POSITION_SEQUENCE_GENERATOR", sequenceName = "SEQ_SERVICE_ORDER_POSITIONS")
public class ServicePositionEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private long positionId;

	private int qty;

	private Money price;

	private ClothesDictEntity clothesDict;

	private ServiceDictEntity serviceDictId;

	/**
	 * @return the clothesDict
	 */
	@ManyToOne
	@JoinColumn(name = "CLOTHES_DICT_ID")
	public ClothesDictEntity getClothesDict() {
		return clothesDict;
	}

	/**
	 * @param clothesDict
	 *            the clothesDict to set
	 */
	public void setClothesDict(ClothesDictEntity clothesDict) {
		this.clothesDict = clothesDict;
	}

	/**
	 * @return the positionId
	 */
	@Id
	@Column(name = "POSITION_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "POSITION_SEQUENCE_GENERATOR")
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
	@Column(name = "QTY")
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
	@Embedded
	@AttributeOverride(name = "amount", column = @Column(name = "PRICE"))
	public Money getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(Money price) {
		this.price = price;
	}

	/**
	 * @return the serviceDictId
	 */
	@ManyToOne
	@JoinColumn(name = "SERVICE_DICT_ID")
	public ServiceDictEntity getServiceDictId() {
		return serviceDictId;
	}

	/**
	 * @param serviceDictId
	 *            the serviceDictId to set
	 */
	public void setServiceDictId(ServiceDictEntity serviceDictId) {
		this.serviceDictId = serviceDictId;
	}
}
