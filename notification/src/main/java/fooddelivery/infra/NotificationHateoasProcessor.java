package fooddelivery.infra;
import fooddelivery.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class NotificationHateoasProcessor implements RepresentationModelProcessor<EntityModel<Notification>>  {

    @Override
    public EntityModel<Notification> process(EntityModel<Notification> model) {

        
        return model;
    }
    
}
