package choreography.eventuate.axon.domain;

import choreography.eventuate.axon.domain.*;
import java.util.*;
import lombok.*;
import io.eventuate.tram.events.common.DomainEvent;
import org.springframework.beans.BeanUtils;


@Data
@ToString
public class ExchangeCompensated implements DomainEvent {

    private Long id;

    public ExchangeCompensated(Exchange aggregate){
        BeanUtils.copyProperties(aggregate, this);
    }
    public ExchangeCompensated(){
        super();
    }
}
