package pl.laundry.ejb.serviceOrderDao;

import java.util.List;

import javax.ejb.Local;

import pl.laundry.ejb.serviceOrder.entity.ServiceOrderEntity;
import pl.laundry.ejb.serviceOrder.entity.ServicePositionEntity;

@Local
public interface ServiceOrderDao {
	/**
	 * @param service
	 */
	public void createOrder(ServiceOrderEntity service);

	/**
	 * @return
	 */
	public List<ServiceOrderEntity> retrieveOrders();

	/**
	 * @return
	 */
	public List<ServiceOrderDTO> retrieveOrderHeaders();

	/**
	 * @param orderId
	 * @return
	 */
	public List<ServicePositionEntity> findPositionsByOrderNo(long orderNo);
}
