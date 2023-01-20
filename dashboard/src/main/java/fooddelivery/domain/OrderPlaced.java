package fooddelivery.domain;

import fooddelivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userID;
    private String storeID;
    private String menuID;
    private Integer qty;
    private String status;
}
