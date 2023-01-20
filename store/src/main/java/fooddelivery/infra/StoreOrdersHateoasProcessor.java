package fooddelivery.infra;
import fooddelivery.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class StoreOrdersHateoasProcessor implements RepresentationModelProcessor<EntityModel<StoreOrders>>  {

    @Override
    public EntityModel<StoreOrders> process(EntityModel<StoreOrders> model) {

        
        return model;
    }
    
}
