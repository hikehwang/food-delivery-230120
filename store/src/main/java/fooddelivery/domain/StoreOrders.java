package fooddelivery.domain;

import fooddelivery.domain.OrderAcepted;
import fooddelivery.domain.OrderRejected;
import fooddelivery.domain.CookStarted;
import fooddelivery.domain.CoookFinished;
import fooddelivery.StoreApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="StoreOrders_table")
@Data

public class StoreOrders  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String storeId;
    
    
    
    
    
    private String menuId;
    
    
    
    
    
    private Integer qty;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private String address;

    @PostPersist
    public void onPostPersist(){


        OrderAcepted orderAcepted = new OrderAcepted(this);
        orderAcepted.publishAfterCommit();



        OrderRejected orderRejected = new OrderRejected(this);
        orderRejected.publishAfterCommit();



        CookStarted cookStarted = new CookStarted(this);
        cookStarted.publishAfterCommit();



        CoookFinished coookFinished = new CoookFinished(this);
        coookFinished.publishAfterCommit();

    }

    public static StoreOrdersRepository repository(){
        StoreOrdersRepository storeOrdersRepository = StoreApplication.applicationContext.getBean(StoreOrdersRepository.class);
        return storeOrdersRepository;
    }




    public static void orderInfoTransferred(OrderPlaced orderPlaced){

        /** Example 1:  new item 
        StoreOrders storeOrders = new StoreOrders();
        repository().save(storeOrders);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(storeOrders->{
            
            storeOrders // do something
            repository().save(storeOrders);


         });
        */

        
    }


}
