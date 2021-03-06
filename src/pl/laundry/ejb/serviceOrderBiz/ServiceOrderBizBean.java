/**
 * 
 */
package pl.laundry.ejb.serviceOrderBiz;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import pl.laundry.ejb.serviceOrder.entity.ServiceOrderEntity;
import pl.laundry.ejb.serviceOrder.entity.ServicePositionEntity;
import pl.laundry.ejb.serviceOrderDao.ServiceOrderDTO;
import pl.laundry.ejb.serviceOrderDao.ServiceOrderDao;

/**
 * @author Administrator
 *
 */
@Stateless
@Local(ServiceOrderBiz.class)
public class ServiceOrderBizBean {

	@EJB
	private ServiceOrderDao serviceDao;

	public void createOrder(ServiceOrderEntity service) {
		serviceDao.createOrder(service);

	}

	public List<ServiceOrderEntity> retrieveOrders() {
		return serviceDao.retrieveOrders();
	}

	public List<ServiceOrderDTO> retrieveOrderHeaders(){
		return serviceDao.retrieveOrderHeaders();
	}
	
	public List<ServicePositionEntity> findPositionsByOrderNo(long orderNo) {
		return serviceDao.findPositionsByOrderNo(orderNo);
	}

}
