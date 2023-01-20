package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userId;
    private String storeId;
    private String menuId;
    private Integer qty;
    private String status;

    public OrderPlaced(Orders aggregate){
        super(aggregate);
    }
    public OrderPlaced(){
        super();
    }
}
