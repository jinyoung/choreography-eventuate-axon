package choreography.eventuate.axon.domain;

import choreography.eventuate.axon.domain.*;
import java.util.*;
import lombok.*;
import io.eventuate.tram.events.common.DomainEvent;
import org.springframework.beans.BeanUtils;


@Data
@ToString
public class ExchangeFailed implements DomainEvent {

    private Long orderId;
    private Long currencyId;
    private Long amount;
    private Double rate;

    public ExchangeFailed(Exchange aggregate){
        BeanUtils.copyProperties(aggregate, this);
    }
    public ExchangeFailed(){
        super();
    }
}
