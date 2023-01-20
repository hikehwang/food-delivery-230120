package fooddelivery.domain;

import fooddelivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class OrderRejected extends AbstractEvent {

    private Long id;
    private String orderID;
    private String storeID;
    private String menuID;
    private Integer qty;
    private String status;
    private String address;
}
