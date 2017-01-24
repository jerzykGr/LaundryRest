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

		return entityManager.createNativeQuery("SELECT so.*,'PLN' as currency FROM SERVICE_ORDER so",
				ServiceOrderEntity.SERVICE_CUSTOMER_MAPPING).getResultList();

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
