package devcunha.springboot.stripe;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Account;
import devcunha.springboot.stripe.config.StripeProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
@ActiveProfiles("test")
class StripeIntegrationTest {

    @Autowired
    private StripeProperties stripeProperties;

	@Test
	void printApiKey() {
        System.out.println("Stripe Key = " + stripeProperties.getApiKey());
	}

    @Test
    void testConnection() throws StripeException {
        Stripe.apiKey = stripeProperties.getApiKey();

        Account account = Account.retrieve();

        assertThat(account).isNotNull();
        assertThat(account.getId()).startsWith("acct_");
    }
}
