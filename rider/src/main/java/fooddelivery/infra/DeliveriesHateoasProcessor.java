package fooddelivery.infra;
import fooddelivery.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class DeliveriesHateoasProcessor implements RepresentationModelProcessor<EntityModel<Deliveries>>  {

    @Override
    public EntityModel<Deliveries> process(EntityModel<Deliveries> model) {

        
        return model;
    }
    
}
