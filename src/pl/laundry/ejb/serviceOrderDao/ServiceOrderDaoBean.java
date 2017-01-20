package pl.laundry.ejb.serviceOrderDao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pl.laundry.ejb.serviceOrder.entity.ServiceOrderEntity;

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
		return entityManager.createNamedQuery("retrieveOrders").getResultList();
	}

}
