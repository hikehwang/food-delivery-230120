package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliveryFinished extends AbstractEvent {

    private Long id;
    private String orderId;
    private String storeId;
    private String menuId;
    private Integer qty;
    private String status;
    private String address;

    public DeliveryFinished(Deliveries aggregate){
        super(aggregate);
    }
    public DeliveryFinished(){
        super();
    }
}
