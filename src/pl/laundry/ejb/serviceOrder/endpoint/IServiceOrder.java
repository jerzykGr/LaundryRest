package pl.laundry.ejb.serviceOrder.endpoint;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import pl.laundry.ejb.serviceOrder.entity.ServiceOrderEntity;
import pl.laundry.ejb.serviceOrder.entity.ServicePositionEntity;
import pl.laundry.ejb.serviceOrderDao.ServiceOrderDTO;

@Path("serviceOrder")
public interface IServiceOrder {
	@POST
	@Path("sayHello")
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHello(@QueryParam("name") String name) throws Exception;

	@POST
	@Path("find")
	@Produces(MediaType.APPLICATION_JSON)
	public long findOrder(@QueryParam("id") long orderNo) throws Exception;

	@GET
	@Path("retrieve")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ServiceOrderEntity> retrieveOrders();

	@GET
	@Path("retrieveHeaders")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ServiceOrderDTO> retrieveOrderHeaders();
	
	@GET
	@Path("findPositions")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ServicePositionEntity> findPositionsByOrderNo(@QueryParam("orderNo") long orderNo);

	@POST
	@Path("createOrder")
	@Consumes(MediaType.APPLICATION_JSON)
	public void createOrder(ServiceOrderEntity service);
}
