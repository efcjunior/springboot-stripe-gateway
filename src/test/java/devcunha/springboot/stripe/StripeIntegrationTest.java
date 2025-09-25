package devcunha.springboot.stripe;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
@ActiveProfiles("test")
class StripeIntegrationTest {

    @Value("${stripe.apiKey}")
    private String stripeApiKey;

	@Test
	void printApiKey() {
        System.out.println("Stripe Key = " + stripeApiKey);
	}

    @Test
    void testConnection() throws StripeException {
        Stripe.apiKey = stripeApiKey;

        Account account = Account.retrieve();

        assertThat(account).isNotNull();
        assertThat(account.getId()).startsWith("acct_");
    }
}
