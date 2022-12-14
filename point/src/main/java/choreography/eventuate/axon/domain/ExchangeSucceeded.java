package choreography.eventuate.axon.domain;

import choreography.eventuate.axon.domain.*;
import lombok.*;
import java.util.*;
import io.eventuate.tram.events.common.DomainEvent;


@Data
@ToString
public class ExchangeSucceeded implements DomainEvent {

    private Long orderId;
    private String userId;
    private Long currencyId;
    private Long amount;
    private Double rate;
    private Double pointUsed;
}


