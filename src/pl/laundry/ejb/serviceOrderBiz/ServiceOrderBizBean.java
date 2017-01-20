/**
 * 
 */
package pl.laundry.ejb.serviceOrderBiz;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import pl.laundry.ejb.serviceOrder.entity.ServiceOrderEntity;
import pl.laundry.ejb.serviceOrderDao.ServiceOrderDao;

/**
 * @author Administrator
 *
 */
@Stateless
public class ServiceOrderBizBean implements ServiceOrderBiz {

	@EJB
	private ServiceOrderDao serviceDao;

	@Override
	public void createOrder(ServiceOrderEntity service) {
		serviceDao.createOrder(service);

	}

	@Override
	public List<ServiceOrderEntity> retrieveOrders() {
		return serviceDao.retrieveOrders();
	}

}
