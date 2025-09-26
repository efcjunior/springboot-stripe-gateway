package devcunha.springboot.stripe.config;

import com.stripe.StripeClient;
import com.stripe.model.Account;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StripeConfig {

    @Bean
    public StripeClient stripeClient(StripeProperties stripeProperties){
        return new StripeClient(stripeProperties.getApiKey());
    }

    @Bean
    public String stripeAccountId(StripeProperties stripeProperties, StripeClient client) throws Exception {
        Account account = client.accounts().retrieve(stripeProperties.getPlatformAccountId());
        return account.getId();
    }
}
