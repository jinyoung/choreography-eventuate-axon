package choreography.eventuate.axon.domain;

import choreography.eventuate.axon.domain.*;
import lombok.*;
import java.util.*;
import io.eventuate.tram.events.common.DomainEvent;


@Data
@ToString
public class OrderCreated implements DomainEvent {

    private Long id;
    private String currencyId;
    private Double amount;
    private String holderId;
}


