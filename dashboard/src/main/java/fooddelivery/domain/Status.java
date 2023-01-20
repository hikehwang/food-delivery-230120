package fooddelivery.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="Status_table")
@Data
public class Status {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String orderId;
        private String userId;
        private String storeId;
        private String menuId;
        private String orderStatus;
        private String storeStatus;
        private String delieveryStatus;


}
