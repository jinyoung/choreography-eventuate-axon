package choreography.eventuate.axon.api;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

import choreography.eventuate.axon.aggregate.*;
import choreography.eventuate.axon.command.*;

@RestController
public class OrderController {

  private final CommandGateway commandGateway;
  private final QueryGateway queryGateway;

  public OrderController(CommandGateway commandGateway, QueryGateway queryGateway) {
      this.commandGateway = commandGateway;
      this.queryGateway = queryGateway;
  }

  @RequestMapping(value = "/order/order",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8")
  public void order(@RequestBody OrderAggregate order)
        throws Exception {
          System.out.println("##### /order/order  called #####");
          // make command
          OrderCommand order = new OrderCommand();
          // TODO set attribute
          // send command
          commandGateway.send(order);
  }


  @RequestMapping(value = "/order/cancel",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8")
  public void cancel(@RequestBody OrderAggregate order)
        throws Exception {
          System.out.println("##### /order/cancel  called #####");
          // make command
          CancelCommand cancel = new CancelCommand();
          // TODO set attribute
          // send command
          commandGateway.send(cancel);
  }

}
