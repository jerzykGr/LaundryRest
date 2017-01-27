package pl.laundry.ejb.serviceOrderDao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pl.laundry.ejb.serviceOrder.entity.ServiceOrderEntity;
import pl.laundry.ejb.serviceOrder.entity.ServicePositionEntity;

@Stateless
public class ServiceOrderDaoBean implements ServiceOrderDao {

	@PersistenceContext(unitName = "LaundryRest")
	private EntityManager entityManager;

	/*
	 * (non-Javadoc)
	 * 
	 * @see pl.plzejb.playerDao.PlayerDao#addPlayer(pl.plzejb.player.entity.
	 * PlayerEntity)
	 */
	@Override
	public void createOrder(ServiceOrderEntity service) {
		entityManager.persist(service);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pl.plzejb.playerDao.PlayerDao#findPlayer(int)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<ServiceOrderEntity> retrieveOrders() {

		return entityManager.createNativeQuery(
				"SELECT so.*, sp.position_id, sp.qty, sp.price, sp.currency, "
						+ " sp.order_no, sp.clothes_dict_id, sp.service_dict_id FROM SERVICE_ORDER so "
						+ " JOIN SERVICE_ORDER_POSITIONS sp on sp.order_no = so.order_no "
						+ " JOIN SERVICE_DICT sd on sd.DICT_ID = sp.SERVICE_DICT_ID",
				ServiceOrderEntity.SERVICE_ORDER_MAPPING).getResultList();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ServiceOrderDTO> retrieveOrderHeaders() {

		return entityManager.createNativeQuery(
				"SELECT so.order_no, so.order_date, so.subtotal, so.surcharge_express_percentage, "
						+ " so.surcharge_express_amount, so.grandtotal, so.describe, c.name ||' '||cc.card_no as customer, count(sp.position_id) as positionsCount"
						+ " FROM SERVICE_ORDER so " + " JOIN CUSTOMER c on c.cust_id = so.customer_id"
						+ " JOIN CUSTOMER_CARD cc on cc.card_id = c.card_id"
						+ " JOIN SERVICE_ORDER_POSITIONS sp on sp.order_no = so.order_no "
						+ " GROUP BY so.order_no, so.order_date, so.subtotal, so.surcharge_express_percentage, "
						+ " so.surcharge_express_amount, so.grandtotal, so.describe, c.name ||' '||cc.card_no",
				ServiceOrderEntity.SERVICE_ORDER_HEADER_MAPPING).getResultList();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ServicePositionEntity> findPositionsByOrderNo(long orderNo) {

		Query query = entityManager.createNativeQuery("SELECT sop.position_id, sop.qty, sop.price, sop.currency,"
				+ " sop.order_no, sop.clothes_dict_id, sd.code FROM SERVICE_ORDER_POSITIONS sop "
				+ " JOIN SERVICE_DICT sd on sd.DICT_ID = sop.SERVICE_DICT_ID" + " WHERE sop.order_no = :orderNo",
				ServicePositionEntity.class);
		query.setParameter("orderNo", orderNo);

		return query.getResultList();
	}

}
