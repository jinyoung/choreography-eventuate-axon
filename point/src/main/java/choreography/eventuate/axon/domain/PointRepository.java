package choreography.eventuate.axon.domain;

import choreography.eventuate.axon.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="points", path="points")
public interface PointRepository extends PagingAndSortingRepository<Point, String>{

}
