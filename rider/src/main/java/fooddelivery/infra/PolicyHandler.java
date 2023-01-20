package fooddelivery.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import fooddelivery.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import fooddelivery.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired DeliveriesRepository deliveriesRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CookStarted'")
    public void wheneverCookStarted_CookInfoTransfer(@Payload CookStarted cookStarted){

        CookStarted event = cookStarted;
        System.out.println("\n\n##### listener CookInfoTransfer : " + cookStarted + "\n\n");


        

        // Sample Logic //
        Deliveries.cookInfoTransfer(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CoookFinished'")
    public void wheneverCoookFinished_CookInfoTransfer(@Payload CoookFinished coookFinished){

        CoookFinished event = coookFinished;
        System.out.println("\n\n##### listener CookInfoTransfer : " + coookFinished + "\n\n");


        

        // Sample Logic //
        Deliveries.cookInfoTransfer(event);
        

        

    }

}


