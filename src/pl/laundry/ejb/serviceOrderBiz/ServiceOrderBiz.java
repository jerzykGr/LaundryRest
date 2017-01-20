/**
 * 
 */
package pl.laundry.ejb.serviceOrderBiz;

import java.util.List;

import pl.laundry.ejb.serviceOrder.entity.ServiceOrderEntity;

/**
 * @author Administrator
 *
 */
public interface ServiceOrderBiz {
	public void createOrder(ServiceOrderEntity service);
	public List<ServiceOrderEntity> retrieveOrders();
}
