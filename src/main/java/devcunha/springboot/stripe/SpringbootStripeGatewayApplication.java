package devcunha.springboot.stripe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringbootStripeGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootStripeGatewayApplication.class, args);
	}

}
