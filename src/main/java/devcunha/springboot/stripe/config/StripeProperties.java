package devcunha.springboot.stripe.config;

import lombok.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Value
@ConfigurationProperties(prefix = "stripe")
public class StripeProperties {

    String apiKey;
    String platformAccountId;
}
