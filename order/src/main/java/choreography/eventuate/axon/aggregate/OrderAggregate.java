package choreography.eventuate.axon.aggregate;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

import org.springframework.beans.BeanUtils;
import java.util.List;


import choreography.eventuate.axon.command.*;
import choreography.eventuate.axon.event.*;

@Aggregate
public class OrderAggregate {

    @AggregateIdentifier
    private Long id;
    private String currencyId;
    private Double amount;
    private String status;
    private String holderId;

    private OrderAggregate(){}

    @CommandHandler
    public void handle(OrderCommand command){
        // TODO send Event
        // AggregateLifecycle.apply( Event );

        }
    @CommandHandler
    public void handle(CancelCommand command){
        // TODO send Event
        // AggregateLifecycle.apply( Event );

        }


    @EventSourcingHandler
    public void on(OrderCreatedEvent event) {
        BeanUtils.copyProperties(event, this);
    }


    @EventSourcingHandler
    public void on(OrderPlacedEvent event) {
        BeanUtils.copyProperties(event, this);
    }


    @EventSourcingHandler
    public void on(OrderRejectedEvent event) {
        BeanUtils.copyProperties(event, this);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getHolderId() {
        return holderId;
    }

    public void setHolderId(String holderId) {
        this.holderId = holderId;
    }


}
