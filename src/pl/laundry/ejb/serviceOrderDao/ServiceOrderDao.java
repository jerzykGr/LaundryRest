package pl.laundry.ejb.serviceOrderDao;

import java.util.List;

import javax.ejb.Local;

import pl.laundry.ejb.serviceOrder.entity.ServiceOrderEntity;

@Local
public interface ServiceOrderDao {
	public void createOrder(ServiceOrderEntity service);
	public List<ServiceOrderEntity> retrieveOrders();
}
