package fooddelivery.common;


import fooddelivery.PaymentGatewayApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { PaymentGatewayApplication.class })
public class CucumberSpingConfiguration {
    
}
