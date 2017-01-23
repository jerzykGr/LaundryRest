package pl.laundry.ejb.serviceOrder.endpoint;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import pl.laundry.ejb.serviceOrder.entity.ServiceOrderEntity;
import pl.laundry.ejb.serviceOrder.entity.ServicePositionEntity;
import pl.laundry.ejb.serviceOrderBiz.ServiceOrderBiz;

@ManagedBean
public class ServiceOrder implements IServiceOrder {

	@EJB
	private ServiceOrderBiz serviceBiz;

	@Override
	public String sayHello(String name) throws Exception {

		return "Hello: " + name;
	}

	@Override
	public List<ServiceOrderEntity> retrieveOrders() {
		List<ServiceOrderEntity> sv = serviceBiz.retrieveOrders();
		return sv;
	}

	@Override
	public void createOrder(ServiceOrderEntity service) {
		serviceBiz.createOrder(service);

	}

	@Override
	public long findOrder(long orderNo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ServicePositionEntity> findPositionsByOrderNo(long orderNo) {

		return serviceBiz.findPositionsByOrderNo(orderNo);
	}

}
