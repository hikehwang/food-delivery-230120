package fooddelivery.infra;

import fooddelivery.domain.*;
import fooddelivery.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class StatusViewHandler {

    @Autowired
    private StatusRepository statusRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderPlaced_then_CREATE_1 (@Payload OrderPlaced orderPlaced) {
        try {

            if (!orderPlaced.validate()) return;

            // view 객체 생성
            Status status = new Status();
            // view 객체에 이벤트의 Value 를 set 함
            status.setOrderId(String.valueOf(orderPlaced.getId()));
            status.setUserId(orderPlaced.getUserId());
            status.setMenuId(orderPlaced.getMenuId());
            status.setStoreId(orderPlaced.getStoreId());
            // view 레파지 토리에 save
            statusRepository.save(status);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderAcepted_then_UPDATE_1(@Payload OrderAcepted orderAcepted) {
        try {
            if (!orderAcepted.validate()) return;
                // view 객체 조회

                List<Status> statusList = statusRepository.findByOrderId(orderAcepted.getOrderId());
                for(Status status : statusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    status.setOrderStatus("Order Accepted");
                // view 레파지 토리에 save
                statusRepository.save(status);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderRejected_then_UPDATE_2(@Payload OrderRejected orderRejected) {
        try {
            if (!orderRejected.validate()) return;
                // view 객체 조회

                List<Status> statusList = statusRepository.findByOrderId(orderRejected.getOrderId());
                for(Status status : statusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    status.setOrderStatus("Order Rejected");
                // view 레파지 토리에 save
                statusRepository.save(status);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenCookStarted_then_UPDATE_3(@Payload CookStarted cookStarted) {
        try {
            if (!cookStarted.validate()) return;
                // view 객체 조회

                List<Status> statusList = statusRepository.findByOrderId(cookStarted.getOrderId());
                for(Status status : statusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    status.setStoreStatus("Cook Started");
                // view 레파지 토리에 save
                statusRepository.save(status);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenCoookFinished_then_UPDATE_4(@Payload CoookFinished coookFinished) {
        try {
            if (!coookFinished.validate()) return;
                // view 객체 조회

                List<Status> statusList = statusRepository.findByOrderId(coookFinished.getOrderId());
                for(Status status : statusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    status.setStoreStatus("Cook Finished");
                // view 레파지 토리에 save
                statusRepository.save(status);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenDeliveryStarted_then_UPDATE_5(@Payload DeliveryStarted deliveryStarted) {
        try {
            if (!deliveryStarted.validate()) return;
                // view 객체 조회

                List<Status> statusList = statusRepository.findByOrderId(deliveryStarted.getOrderId());
                for(Status status : statusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    status.setDelieveryStatus("Delivery Started");
                // view 레파지 토리에 save
                statusRepository.save(status);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenDeliveryFinished_then_UPDATE_6(@Payload DeliveryFinished deliveryFinished) {
        try {
            if (!deliveryFinished.validate()) return;
                // view 객체 조회

                List<Status> statusList = statusRepository.findByOrderId(deliveryFinished.getOrderId());
                for(Status status : statusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    status.setDelieveryStatus("Delivery Finished");
                // view 레파지 토리에 save
                statusRepository.save(status);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenDeliveryFinished_then_DELETE_1(@Payload DeliveryFinished deliveryFinished) {
        try {
            if (!deliveryFinished.validate()) return;
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

