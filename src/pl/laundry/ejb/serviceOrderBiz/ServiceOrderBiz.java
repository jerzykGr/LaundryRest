/**
 * 
 */
package pl.laundry.ejb.serviceOrderBiz;

import java.util.List;

import pl.laundry.ejb.serviceOrder.entity.ServiceOrderEntity;
import pl.laundry.ejb.serviceOrder.entity.ServicePositionEntity;

/**
 * @author Administrator
 *
 */
public interface ServiceOrderBiz {
	/**
	 * @param service
	 */
	public void createOrder(ServiceOrderEntity service);

	/**
	 * @return
	 */
	public List<ServiceOrderEntity> retrieveOrders();

	/**
	 * @param orderNo
	 * @return
	 */
	public List<ServicePositionEntity> findPositionsByOrderNo(long orderNo);
}
