package choreography.eventuate.axon.domain;

import choreography.eventuate.axon.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="exchanges", path="exchanges")
public interface ExchangeRepository extends PagingAndSortingRepository<Exchange, Long>{

}
