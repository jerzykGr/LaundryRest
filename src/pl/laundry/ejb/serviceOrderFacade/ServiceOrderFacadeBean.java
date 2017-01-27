/**
 * 
 */
package pl.laundry.ejb.serviceOrderFacade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import pl.laundry.ejb.serviceOrder.entity.ServiceOrderEntity;
import pl.laundry.ejb.serviceOrder.entity.ServicePositionEntity;
import pl.laundry.ejb.serviceOrderBiz.ServiceOrderBiz;
import pl.laundry.ejb.serviceOrderDao.ServiceOrderDTO;

/**
 * @author Administrator
 *
 */
@Stateless
@Local(ServiceOrderFacadeLocal.class)
@Remote(ServiceOrderFacadeRemote.class)
public class ServiceOrderFacadeBean {

	@EJB
	private ServiceOrderBiz serviceOrderBiz;

	public void createOrder(ServiceOrderEntity service) {
		serviceOrderBiz.createOrder(service);

	}

	public List<ServiceOrderEntity> retrieveOrders() {
		return serviceOrderBiz.retrieveOrders();
	}

	public List<ServiceOrderDTO> retrieveOrderHeaders() {
		return serviceOrderBiz.retrieveOrderHeaders();
	}

	public List<ServicePositionEntity> findPositionsByOrderNo(long orderNo) {
		return serviceOrderBiz.findPositionsByOrderNo(orderNo);
	}
}
