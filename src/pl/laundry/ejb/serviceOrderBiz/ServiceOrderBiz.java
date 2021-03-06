/**
 * 
 */
package pl.laundry.ejb.serviceOrderBiz;

import java.util.List;

import javax.ejb.Local;

import pl.laundry.ejb.serviceOrder.entity.ServiceOrderEntity;
import pl.laundry.ejb.serviceOrder.entity.ServicePositionEntity;
import pl.laundry.ejb.serviceOrderDao.ServiceOrderDTO;

/**
 * @author Administrator
 *
 */
@Local
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
	 * @return
	 */
	public List<ServiceOrderDTO> retrieveOrderHeaders();

	/**
	 * @param orderNo
	 * @return
	 */
	public List<ServicePositionEntity> findPositionsByOrderNo(long orderNo);

	/**
	 * @param custId
	 */
	public void setCustomerId(long custId);

	public void setSubTotalAmount();

	public void setSuperChargeAmount();

	public void setGrandTotalAmount();
}
