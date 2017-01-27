/**
 * 
 */
package pl.laundry.ejb.serviceOrderFacade;

import java.util.List;

import pl.laundry.ejb.serviceOrder.entity.ServiceOrderEntity;
import pl.laundry.ejb.serviceOrder.entity.ServicePositionEntity;
import pl.laundry.ejb.serviceOrderDao.ServiceOrderDTO;

/**
 * @author Administrator
 *
 */
public interface ServiceOrderFacade {
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
	 * @param orderNo
	 * @return
	 */
	public List<ServicePositionEntity> findPositionsByOrderNo(long orderNo);
}
