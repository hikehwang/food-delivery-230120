package fooddelivery.infra;

import fooddelivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="statuses", path="statuses")
public interface StatusRepository extends PagingAndSortingRepository<Status, Long> {

    List<Status> findByOrderId(String orderId);


    
}
