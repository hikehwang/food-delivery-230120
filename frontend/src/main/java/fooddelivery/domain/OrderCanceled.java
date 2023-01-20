package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String userId;
    private String storeId;
    private String menuId;
    private Integer qty;
    private String status;

    public OrderCanceled(Orders aggregate){
        super(aggregate);
    }
    public OrderCanceled(){
        super();
    }
}
