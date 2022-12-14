package choreography.eventuate.axon.infra;
import choreography.eventuate.axon.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class ExchangeHateoasProcessor implements RepresentationModelProcessor<EntityModel<Exchange>>  {

    @Override
    public EntityModel<Exchange> process(EntityModel<Exchange> model) {

        
        return model;
    }
    
}
