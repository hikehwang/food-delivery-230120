package fooddelivery.domain;

import fooddelivery.domain.DeliveryStarted;
import fooddelivery.domain.DeliveryFinished;
import fooddelivery.RiderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Deliveries_table")
@Data

public class Deliveries  {


    
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


        DeliveryStarted deliveryStarted = new DeliveryStarted(this);
        deliveryStarted.publishAfterCommit();



        DeliveryFinished deliveryFinished = new DeliveryFinished(this);
        deliveryFinished.publishAfterCommit();

    }

    public static DeliveriesRepository repository(){
        DeliveriesRepository deliveriesRepository = RiderApplication.applicationContext.getBean(DeliveriesRepository.class);
        return deliveriesRepository;
    }




    public static void cookInfoTransfer(CookStarted cookStarted){

        /** Example 1:  new item 
        Deliveries deliveries = new Deliveries();
        repository().save(deliveries);

        */

        /** Example 2:  finding and process
        
        repository().findById(cookStarted.get???()).ifPresent(deliveries->{
            
            deliveries // do something
            repository().save(deliveries);


         });
        */

        
    }
    public static void cookInfoTransfer(CoookFinished coookFinished){

        /** Example 1:  new item 
        Deliveries deliveries = new Deliveries();
        repository().save(deliveries);

        */

        /** Example 2:  finding and process
        
        repository().findById(coookFinished.get???()).ifPresent(deliveries->{
            
            deliveries // do something
            repository().save(deliveries);


         });
        */

        
    }


}
