package fooddelivery.infra;
import fooddelivery.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class OrdersHateoasProcessor implements RepresentationModelProcessor<EntityModel<Orders>>  {

    @Override
    public EntityModel<Orders> process(EntityModel<Orders> model) {

        
        return model;
    }
    
}
